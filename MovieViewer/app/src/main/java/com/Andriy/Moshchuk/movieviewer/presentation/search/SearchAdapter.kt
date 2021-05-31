package com.Andriy.Moshchuk.movieviewer.presentation.search

import android.databinding.DataBindingUtil
import android.view.LayoutInflater
import android.view.ViewGroup

import com.Andriy.Moshchuk.movieviewer.presentation.common.BaseRecyclerViewAdapter
import com.Andriy.Moshchuk.movieviewer.presentation.model.SearchItem
import com.Andriy.Moshchuk.movieviewer.R
import com.Andriy.Moshchuk.movieviewer.databinding.ItemSearchBinding
import io.reactivex.Observable
import io.reactivex.subjects.PublishSubject

class SearchAdapter : BaseRecyclerViewAdapter<SearchItem, SearchViewHolder>() {

    private val clickSubject = PublishSubject.create<Int>()
    val clickObservable: Observable<Int> = clickSubject

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = DataBindingUtil.inflate<ItemSearchBinding>(
                inflater,
                R.layout.item_search,
                parent,
                false)

        return SearchViewHolder(binding, clickSubject)
    }
}
package com.Andriy.Moshchuk.movieviewer.presentation.common.adapters

import android.databinding.DataBindingUtil
import android.view.LayoutInflater
import android.view.ViewGroup
import com.Andriy.Moshchuk.movieviewer.presentation.common.BaseRecyclerViewAdapter
import com.Andriy.Moshchuk.movieviewer.presentation.model.HorizontalItem
import com.Andriy.Moshchuk.movieviewer.R
import com.Andriy.Moshchuk.movieviewer.databinding.ItemHorizontalBinding
import io.reactivex.Observable
import io.reactivex.subjects.PublishSubject

class HorizontalListAdapter : BaseRecyclerViewAdapter<HorizontalItem, HorizontalListViewHolder>() {

    private val clickSubject = PublishSubject.create<HorizontalItem>()
    val clickObservable: Observable<HorizontalItem> = clickSubject

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HorizontalListViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = DataBindingUtil.inflate<ItemHorizontalBinding>(
                inflater, R.layout.item_horizontal, parent, false)
        return HorizontalListViewHolder(binding, clickSubject)
    }
}
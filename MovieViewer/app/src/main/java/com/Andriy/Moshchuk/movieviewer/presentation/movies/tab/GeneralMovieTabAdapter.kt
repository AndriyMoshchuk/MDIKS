package com.Andriy.Moshchuk.movieviewer.presentation.movies.tab

import android.databinding.DataBindingUtil
import android.view.LayoutInflater
import android.view.ViewGroup

import com.Andriy.Moshchuk.movieviewer.data.entity.Movie

import com.Andriy.Moshchuk.movieviewer.presentation.common.BaseRecyclerViewAdapter
import com.Andriy.Moshchuk.movieviewer.presentation.model.HorizontalItem
import com.Andriy.Moshchuk.movieviewer.R
import com.Andriy.Moshchuk.movieviewer.databinding.ItemHorizontalMovieListBinding
import io.reactivex.Observable
import io.reactivex.subjects.PublishSubject

class GeneralMovieTabAdapter
    : BaseRecyclerViewAdapter<ArrayList<HorizontalItem>, GeneralMovieTabViewHolder>() {

    private val seeAllClickSubject = PublishSubject.create<Int>()
    private val movieClickSubject = PublishSubject.create<Int>()

    val seeAllClickEvent: Observable<Int> = seeAllClickSubject
    val movieClickEvent: Observable<Int> = movieClickSubject

    init {
        items.add(ArrayList())
//        items.add(ArrayList())
//        items.add(ArrayList()) //TODO: Remove this workaround
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GeneralMovieTabViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = DataBindingUtil.inflate<ItemHorizontalMovieListBinding>(
                inflater,
                R.layout.item_horizontal_movie_list,
                parent,
                false)

        return GeneralMovieTabViewHolder(binding, seeAllClickSubject, movieClickSubject)
    }

    fun addMovies(movies: List<HorizontalItem>, position: Int) {
        items[position].addAll(movies)
        notifyDataSetChanged()
    }
}
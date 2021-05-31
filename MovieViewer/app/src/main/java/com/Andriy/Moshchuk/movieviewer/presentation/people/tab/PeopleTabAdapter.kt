package com.Andriy.Moshchuk.movieviewer.presentation.people.tab

import android.databinding.DataBindingUtil
import android.view.LayoutInflater
import android.view.ViewGroup

import com.Andriy.Moshchuk.movieviewer.data.entity.Person
import com.Andriy.Moshchuk.movieviewer.presentation.common.BaseRecyclerViewAdapter
import com.Andriy.Moshchuk.movieviewer.R
import com.Andriy.Moshchuk.movieviewer.databinding.ItemLoadingBinding
import com.Andriy.Moshchuk.movieviewer.databinding.ItemPersonBinding
import io.reactivex.Observable
import io.reactivex.subjects.PublishSubject

const val PERSON = 0
const val LOADING = 1


class PeopleTabAdapter : BaseRecyclerViewAdapter<Person, BasePeopleViewHolder>() {

    private val clickSubject = PublishSubject.create<Int>()

    val personClickEvent: Observable<Int> = clickSubject
    var nextPage = 1

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BasePeopleViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return if (viewType == PERSON) {
            val binding = DataBindingUtil.inflate<ItemPersonBinding>(
                    inflater,
                    R.layout.item_person,
                    parent,
                    false)

            PeopleTabViewHolder(binding, clickSubject)
        } else {
            val binding = DataBindingUtil.inflate<ItemLoadingBinding>(
                    inflater,
                    R.layout.item_loading,
                    parent,
                    false)

            PeopleTabLoadingViewHolder(binding)
        }

    }

    override fun onBindViewHolder(viewHolder: BasePeopleViewHolder, position: Int) {
        if (viewHolder !is PeopleTabLoadingViewHolder)
            super.onBindViewHolder(viewHolder, position)
    }

    fun addPeople(people: List<Person>) {
        items.addAll(people)
        notifyDataSetChanged()
    }

    override fun getItemViewType(position: Int): Int {
        return if (position < items.size)
            PERSON
        else
            LOADING

    }

    override fun getItemCount() = items.size + 1
}
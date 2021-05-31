package com.Andriy.Moshchuk.movieviewer.presentation.people.tab

import android.databinding.ViewDataBinding
import com.Andriy.Moshchuk.movieviewer.data.entity.Person

import com.Andriy.Moshchuk.movieviewer.presentation.common.BaseViewHolder
import com.Andriy.Moshchuk.movieviewer.databinding.ItemLoadingBinding
import com.Andriy.Moshchuk.movieviewer.databinding.ItemPersonBinding
import io.reactivex.subjects.PublishSubject

open class BasePeopleViewHolder(viewDataBinding: ViewDataBinding)
    : BaseViewHolder<Person>(viewDataBinding)

class PeopleTabLoadingViewHolder(binding: ItemLoadingBinding)
    : BasePeopleViewHolder(binding)

class PeopleTabViewHolder(private val binding: ItemPersonBinding, private val clickSubject: PublishSubject<Int>)
    : BasePeopleViewHolder(binding) {

    override fun bind(item: Person?) {
        super.bind(item)

        itemView.setOnClickListener {
            if (item != null) {
                clickSubject.onNext(item.id)
            }
        }
        executeBinding(item)
    }

    private fun executeBinding(person: Person?) {
        binding.person = person
        binding.executePendingBindings()
    }
}
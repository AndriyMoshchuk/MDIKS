package com.Andriy.Moshchuk.movieviewer.presentation.common.adapters

import android.databinding.ViewDataBinding
import android.view.View
import com.Andriy.Moshchuk.movieviewer.presentation.common.BaseViewHolder
import com.Andriy.Moshchuk.movieviewer.presentation.model.VerticalItem
import com.Andriy.Moshchuk.movieviewer.databinding.ItemLoadingBinding
import com.Andriy.Moshchuk.movieviewer.databinding.ItemVerticalBinding
import io.reactivex.subjects.PublishSubject

open class BaseVerticalListViewHolder(viewDataBinding: ViewDataBinding)
    : BaseViewHolder<VerticalItem>(viewDataBinding) {
}

class VerticalListLoadingViewHolder(private val binding: ItemLoadingBinding)
    : BaseVerticalListViewHolder(binding) {

    fun bind(item: VerticalItem?, totalItemsCount: Int) {
        super.bind(item)

        if (adapterPosition == totalItemsCount) {
            binding.loadingProgressBar.visibility = View.GONE
        }
    }
}

class VerticalListViewHolder(
        private val binding: ItemVerticalBinding,
        internal val clickSubject: PublishSubject<Int>)
    : BaseVerticalListViewHolder(binding) {

    override fun bind(item: VerticalItem?) {
        super.bind(item)

        itemView.setOnClickListener {
            if (item != null) {
                clickSubject.onNext(item.id)
            }
        }

        executeBinding()
    }

    private fun executeBinding() {
        binding.item = item
        binding.executePendingBindings()
    }
}
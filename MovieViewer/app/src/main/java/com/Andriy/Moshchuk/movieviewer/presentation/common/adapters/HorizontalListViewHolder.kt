package com.Andriy.Moshchuk.movieviewer.presentation.common.adapters

import android.view.Gravity

import com.Andriy.Moshchuk.movieviewer.presentation.common.BaseViewHolder
import com.Andriy.Moshchuk.movieviewer.presentation.model.HorizontalItem
import com.Andriy.Moshchuk.movieviewer.presentation.model.ItemType
import com.Andriy.Moshchuk.movieviewer.databinding.ItemHorizontalBinding
import io.reactivex.subjects.PublishSubject

class HorizontalListViewHolder(
        private val binding: ItemHorizontalBinding,
        private val clickSubject: PublishSubject<HorizontalItem>) : BaseViewHolder<HorizontalItem>(binding) {

    override fun bind(item: HorizontalItem?) {
        super.bind(item)

        if (item != null)
            itemView.setOnClickListener { clickSubject.onNext(item) }

        executeBinding()
    }

    private fun executeBinding() {
        binding.item = item
        if (item?.itemType == ItemType.PERSON) {
            binding.movieFooterText.setLines(2)
            binding.movieFooterText.gravity = Gravity.CENTER
        }
        binding.executePendingBindings()
    }
}
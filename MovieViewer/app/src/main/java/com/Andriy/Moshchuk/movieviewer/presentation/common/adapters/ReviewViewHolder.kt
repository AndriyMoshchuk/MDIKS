package com.Andriy.Moshchuk.movieviewer.presentation.common.adapters

import com.Andriy.Moshchuk.movieviewer.data.entity.Review
import com.Andriy.Moshchuk.movieviewer.presentation.common.BaseViewHolder
import com.Andriy.Moshchuk.movieviewer.databinding.ItemReviewBinding

class ReviewViewHolder(private val binding: ItemReviewBinding) : BaseViewHolder<Review>(binding) {

    override fun bind(item: Review?) {
        super.bind(item)

        executeBinding()
    }

    private fun executeBinding() {
        binding.review = item
        binding.viewHolder = this
        binding.executePendingBindings()
    }
}
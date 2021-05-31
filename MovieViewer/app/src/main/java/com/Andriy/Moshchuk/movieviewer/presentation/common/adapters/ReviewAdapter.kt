package com.Andriy.Moshchuk.movieviewer.presentation.common.adapters

import android.databinding.DataBindingUtil
import android.view.LayoutInflater
import android.view.ViewGroup
import com.Andriy.Moshchuk.movieviewer.data.entity.Review
import com.Andriy.Moshchuk.movieviewer.presentation.common.BaseRecyclerViewAdapter
import com.Andriy.Moshchuk.movieviewer.R
import com.Andriy.Moshchuk.movieviewer.databinding.ItemReviewBinding

class ReviewAdapter : BaseRecyclerViewAdapter<Review, ReviewViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReviewViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = DataBindingUtil.inflate<ItemReviewBinding>(
                inflater,
                R.layout.item_review,
                parent,
                false)
        return ReviewViewHolder(binding)
    }
}
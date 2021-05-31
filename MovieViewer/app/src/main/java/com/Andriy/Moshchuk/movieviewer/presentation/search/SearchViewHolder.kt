package com.Andriy.Moshchuk.movieviewer.presentation.search


import com.Andriy.Moshchuk.movieviewer.presentation.common.BaseViewHolder
import com.Andriy.Moshchuk.movieviewer.presentation.model.SearchItem
import com.Andriy.Moshchuk.movieviewer.databinding.ItemSearchBinding
import io.reactivex.subjects.PublishSubject

class SearchViewHolder(
        private val binding: ItemSearchBinding,
        private val clickSubject: PublishSubject<Int>) : BaseViewHolder<SearchItem>(binding) {

    override fun bind(item: SearchItem?) {
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
package com.Andriy.Moshchuk.movieviewer.presentation.tv.list

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import com.Andriy.Moshchuk.movieviewer.domain.DiscoverUseCase
import com.Andriy.Moshchuk.movieviewer.domain.ProfileUseCase
import com.Andriy.Moshchuk.movieviewer.domain.SearchUseCase
import com.Andriy.Moshchuk.movieviewer.domain.TvUseCase
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class TvListViewModelFactory @Inject constructor(
        private val tvUseCase: TvUseCase,
        private val profileUseCase: ProfileUseCase,
        private val searchUseCase: SearchUseCase,
        private val discoverUseCase: DiscoverUseCase)
    : ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return TvListViewModel(
                tvUseCase,
                profileUseCase,
                searchUseCase,
                discoverUseCase,
                Schedulers.io(),
                AndroidSchedulers.mainThread()) as T
    }
}
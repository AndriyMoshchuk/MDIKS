package com.Andriy.Moshchuk.movieviewer.presentation.tv.details

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import com.Andriy.Moshchuk.movieviewer.domain.ProfileUseCase
import com.Andriy.Moshchuk.movieviewer.domain.TvDetailsUseCase
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class TvDetailsViewModelFactory @Inject constructor(
        private val tvDetailsUseCase: TvDetailsUseCase) : ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return TvDetailsViewModel(tvDetailsUseCase, Schedulers.io(), AndroidSchedulers.mainThread()) as T
    }
}
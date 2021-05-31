package com.Andriy.Moshchuk.movieviewer.presentation.movies.tab

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import com.Andriy.Moshchuk.movieviewer.domain.MoviesUseCase
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class MovieTabViewModelFactory @Inject constructor(
        private val moviesUseCase: MoviesUseCase) : ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MovieTabViewModel(moviesUseCase, Schedulers.io(), AndroidSchedulers.mainThread()) as T
    }
}
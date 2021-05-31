package com.Andriy.Moshchuk.movieviewer.presentation.movies.details

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import android.content.SharedPreferences
import com.Andriy.Moshchuk.movieviewer.domain.MovieDetailsUseCase
import com.Andriy.Moshchuk.movieviewer.domain.ProfileUseCase
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class MovieDetailsViewModelFactory @Inject constructor(
        private val movieDetailsUseCase: MovieDetailsUseCase) : ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MovieDetailsViewModel(movieDetailsUseCase, Schedulers.io(), AndroidSchedulers.mainThread()) as T
    }
}
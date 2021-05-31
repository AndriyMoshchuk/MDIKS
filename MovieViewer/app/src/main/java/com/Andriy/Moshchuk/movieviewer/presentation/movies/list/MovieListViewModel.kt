package com.Andriy.Moshchuk.movieviewer.presentation.movies.list

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.Andriy.Moshchuk.movieviewer.data.entity.MoviesType
import com.Andriy.Moshchuk.movieviewer.domain.DiscoverUseCase
import com.Andriy.Moshchuk.movieviewer.domain.MoviesUseCase
import com.Andriy.Moshchuk.movieviewer.domain.ProfileUseCase
import com.Andriy.Moshchuk.movieviewer.domain.SearchUseCase
import com.Andriy.Moshchuk.movieviewer.presentation.model.VerticalItemList
import com.Andriy.Moshchuk.movieviewer.presentation.utils.movieResponseToVerticalItemList
import io.reactivex.Scheduler

class MovieListViewModel(private val moviesUseCase: MoviesUseCase,
                         private val profileUseCase: ProfileUseCase,
                         private val searchUseCase: SearchUseCase,
                         private val discoverUseCase: DiscoverUseCase,
                         private val backgroundScheduler: Scheduler,
                         private val mainScheduler: Scheduler) : ViewModel() {

    private val moviesMutableLiveData = MutableLiveData<VerticalItemList>()
    private val loadingErrorMutableLiveData = MutableLiveData<String>()

    val moviesLiveData: LiveData<VerticalItemList> = moviesMutableLiveData
    val loadingErrorLiveData: LiveData<String> = loadingErrorMutableLiveData

    fun getMovies(moviesType: MoviesType, page: Int) = moviesUseCase.getMovies(moviesType, page)
            .map { movieResponseToVerticalItemList(it) }
            .subscribeOn(backgroundScheduler)
            .observeOn(mainScheduler)
            .subscribe(
                    { response -> moviesMutableLiveData.value = response },
                    { error -> loadingErrorMutableLiveData.value = error.message }
            )

    fun searchMovie(query: String, page: Int) = searchUseCase.searchMovies(query, page)
            .map { movieResponseToVerticalItemList(it) }
            .subscribeOn(backgroundScheduler)
            .observeOn(mainScheduler)
            .subscribe(
                    { response -> moviesMutableLiveData.value = response },
                    { error -> loadingErrorMutableLiveData.value = error.message }
            )

    fun discoverMovies(year: Int?, rating: Int?, genres: String?, page: Int) =
            discoverUseCase.discoverMovies(year, rating, genres, page)
                    .map { movieResponseToVerticalItemList(it) }
                    .subscribeOn(backgroundScheduler)
                    .observeOn(mainScheduler)
                    .subscribe(
                            { response -> moviesMutableLiveData.value = response },
                            { error -> loadingErrorMutableLiveData.value = error.message }
                    )

    fun getRatedMovies(sessionId: String, page: Int) = profileUseCase.getRatedMovies(sessionId, page)
            .map { movieResponseToVerticalItemList(it) }
            .subscribeOn(backgroundScheduler)
            .observeOn(mainScheduler)
            .subscribe(
                    { response -> moviesMutableLiveData.value = response },
                    { error -> loadingErrorMutableLiveData.value = error.message }
            )

    fun getMovieWatchlist(sessionId: String, page: Int) = profileUseCase.getMovieWatchList(sessionId, page)
            .map { movieResponseToVerticalItemList(it) }
            .subscribeOn(backgroundScheduler)
            .observeOn(mainScheduler)
            .subscribe(
                    { response -> moviesMutableLiveData.value = response },
                    { error -> loadingErrorMutableLiveData.value = error.message }
            )

    fun getFavoriteMovies(sessionId: String, page: Int) = profileUseCase.getFavoriteMovies(sessionId, page)
            .map { movieResponseToVerticalItemList(it) }
            .subscribeOn(backgroundScheduler)
            .observeOn(mainScheduler)
            .subscribe(
                    { response -> moviesMutableLiveData.value = response },
                    { error -> loadingErrorMutableLiveData.value = error.message }
            )
}
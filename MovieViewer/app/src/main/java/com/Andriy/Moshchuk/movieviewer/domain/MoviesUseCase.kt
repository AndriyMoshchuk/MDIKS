package com.Andriy.Moshchuk.movieviewer.domain

import com.Andriy.Moshchuk.movieviewer.data.entity.MoviesType
import com.Andriy.Moshchuk.movieviewer.data.network.ApiClient
import com.Andriy.Moshchuk.movieviewer.presentation.utils.movieResponseToVerticalItemList
import javax.inject.Inject

class MoviesUseCase @Inject constructor(private val apiClient: ApiClient) {

    fun getMovies(moviesType: MoviesType, page: Int) = apiClient.getMovies(moviesType, page)
}

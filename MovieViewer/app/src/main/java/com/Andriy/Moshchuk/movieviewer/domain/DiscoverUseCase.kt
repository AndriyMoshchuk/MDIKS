package com.Andriy.Moshchuk.movieviewer.domain

import com.Andriy.Moshchuk.movieviewer.data.network.ApiClient
import javax.inject.Inject

class DiscoverUseCase @Inject constructor(private val apiClient: ApiClient) {

    fun discoverMovies(year: Int?, rating: Int?, genres: String?, page:Int) = apiClient
            .discoverMovies(year, rating, genres, page)

    fun discoverTv(airDate: String?, voteAverage: Int?, genres: String?, page: Int) = apiClient
            .discoverTv(airDate, voteAverage, genres, page)
}
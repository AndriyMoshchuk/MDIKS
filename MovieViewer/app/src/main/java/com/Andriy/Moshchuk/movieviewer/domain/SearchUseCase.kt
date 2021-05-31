package com.Andriy.Moshchuk.movieviewer.domain

import com.Andriy.Moshchuk.movieviewer.data.network.ApiClient
import com.Andriy.Moshchuk.movieviewer.presentation.utils.movieToSearchListItem
import com.Andriy.Moshchuk.movieviewer.presentation.utils.personToSearchListItem
import com.Andriy.Moshchuk.movieviewer.presentation.utils.tvToSearchListItem
import javax.inject.Inject

class SearchUseCase @Inject constructor(private val apiClient: ApiClient) {

    fun searchMovies(query: String, page: Int = 1) = apiClient.searchMovies(query, page)

    fun searchTv(query: String, page: Int = 1) = apiClient.searchTv(query, page)

    fun searchPeople(query: String, page: Int = 1) = apiClient.searchPeople(query, page)
}
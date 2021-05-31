package com.Andriy.Moshchuk.movieviewer.domain

import com.Andriy.Moshchuk.movieviewer.data.network.ApiClient
import javax.inject.Inject

class PeopleUseCase @Inject constructor(private val apiClient: ApiClient) {

    fun getPopularPeople(page: Int) = apiClient.getPopularPeople(page)
}
package com.Andriy.Moshchuk.movieviewer.domain

import com.Andriy.Moshchuk.movieviewer.data.network.ApiClient
import javax.inject.Inject

class PersonDetailsUseCase @Inject constructor(private val apiClient: ApiClient) {

    fun getPersonDetails(personId: Int) = apiClient.getPersonDetails(personId)

    fun getPersonCast(personId: Int) = apiClient.getPersonCombinedCredits(personId)
}
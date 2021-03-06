package com.Andriy.Moshchuk.movieviewer.domain

import com.Andriy.Moshchuk.movieviewer.data.network.ApiClient
import com.Andriy.Moshchuk.movieviewer.data.network.body.RequestTokenBody
import com.Andriy.Moshchuk.movieviewer.data.network.response.RequestTokenResponse
import javax.inject.Inject

class ProfileUseCase @Inject constructor(private val apiClient: ApiClient) {

    fun getRequestToken() = apiClient.getRequstToken()

    fun createSessionId(requestToken: String) = apiClient.createSessionId(RequestTokenBody(requestToken))

    fun logout(sessionId: String) = apiClient.logout(sessionId)

    fun getAccountDetails(sessionId: String) = apiClient.getAccountDetails(sessionId)

    fun getRatedMovies(sessionId: String, page: Int) = apiClient.getRatedMovies(sessionId, page)

    fun getMovieWatchList(sessionId: String, page: Int) = apiClient.getMovieWatchList(sessionId, page)

    fun getFavoriteMovies(sessionId: String, page: Int) = apiClient.getFavoriteMovies(sessionId, page)

    fun getRatedTv(sessionId: String, page: Int) = apiClient.getRatedTv(sessionId, page)

    fun getTvWatchList(sessionId: String, page: Int) = apiClient.getTvWatchList(sessionId, page)

    fun getFavoriteTv(sessionId: String, page: Int) = apiClient.getFavoriteTv(sessionId, page)
}

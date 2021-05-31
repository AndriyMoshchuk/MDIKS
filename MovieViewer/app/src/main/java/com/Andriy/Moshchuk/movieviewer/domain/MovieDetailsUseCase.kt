package com.Andriy.Moshchuk.movieviewer.domain

import com.Andriy.Moshchuk.movieviewer.data.network.ApiClient
import com.Andriy.Moshchuk.movieviewer.data.network.body.AddToWatchlistBody
import com.Andriy.Moshchuk.movieviewer.data.network.body.MarkAsFavoriteBody
import com.Andriy.Moshchuk.movieviewer.data.network.body.RateBody
import com.Andriy.Moshchuk.movieviewer.data.network.response.ItemAccountStateResponse
import com.Andriy.Moshchuk.movieviewer.presentation.utils.actorToHorizontalListItem
import com.Andriy.Moshchuk.movieviewer.presentation.utils.topRatedMovieToHorizontalListItem
import javax.inject.Inject

class MovieDetailsUseCase @Inject constructor(private val apiClient: ApiClient) {

    fun getMovieDetails(movieId: Int) = apiClient.getMovieDetails(movieId)
    fun getMovieCredits(movieId: Int) = apiClient.getMovieCredits(movieId)
    fun getMovieReviews(movieId: Int) = apiClient.getMovieReviews(movieId)
    fun getRecommendedMovies(movieId: Int) = apiClient.getRecommendedMovies(movieId)

    fun rateMovie(movieId: Int, rating: Float, sessionId: String) = apiClient.rateMovie(movieId, RateBody(rating), sessionId)
    fun markAsFavorite(movieId: Int, sessionId: String) = apiClient.markAsFavorite(MarkAsFavoriteBody("movie", movieId, true), sessionId)
    fun addToWatchlist(movieId: Int, sessionId: String) = apiClient.addToWatchlist(AddToWatchlistBody("movie", movieId, true), sessionId)

    fun deleteMovieRating(movieId: Int, sessionId: String) = apiClient.deleteMovieRating(movieId, sessionId)
    fun deleteFromFavorites(movieId: Int, sessionId: String) = apiClient.markAsFavorite(MarkAsFavoriteBody("movie", movieId, false), sessionId)
    fun removeFromWatchList(movieId: Int, sessionId: String) = apiClient.addToWatchlist(AddToWatchlistBody("movie", movieId, false), sessionId)

    fun getMovieAccountStates(movieId: Int, sessionId: String) = apiClient.getMovieAccountStates(movieId, sessionId)
}
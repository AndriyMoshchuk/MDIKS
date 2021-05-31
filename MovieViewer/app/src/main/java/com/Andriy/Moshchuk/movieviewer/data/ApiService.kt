package com.shykun.volodymyr.movieviewer.data

import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

private const val API_KEY = "20eb38b01a93728dd275e5dcecd9a533"

interface ApiService {
    @GET("movie/popular")
    fun getPopulatMovies(@Query("api_key") api_key: String = API_KEY): Single<GetMovieResponse>
}
package com.Andriy.Moshchuk.movieviewer.data.network.response

import com.google.gson.annotations.SerializedName
import com.Andriy.Moshchuk.movieviewer.data.entity.Tv

data class TvResponse (
        @SerializedName("page") val page: Int,
        @SerializedName("results") val results: ArrayList<Tv>,
        @SerializedName("total_results") val totalResults: Int,
        @SerializedName("total_pages") val totalPages: Int
)
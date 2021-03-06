package com.Andriy.Moshchuk.movieviewer.data.network.response

import com.google.gson.annotations.SerializedName
import com.Andriy.Moshchuk.movieviewer.data.entity.Actor

data class PictureCreditsResponse(
        @SerializedName("id") val id: Int,
        @SerializedName("cast") val cast: List<Actor>
)
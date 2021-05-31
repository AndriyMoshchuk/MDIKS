package com.Andriy.Moshchuk.movieviewer.data.network.response

import com.google.gson.annotations.SerializedName
import com.Andriy.Moshchuk.movieviewer.data.entity.Role

class PersonCreditsResponse (
        @SerializedName("cast") val cast: List<Role>,
        @SerializedName("id") val id: Int)
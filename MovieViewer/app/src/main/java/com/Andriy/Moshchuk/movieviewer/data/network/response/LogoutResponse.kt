package com.Andriy.Moshchuk.movieviewer.data.network.response

import com.google.gson.annotations.SerializedName

data class LogoutResponse(@SerializedName("success") val succes: Boolean)
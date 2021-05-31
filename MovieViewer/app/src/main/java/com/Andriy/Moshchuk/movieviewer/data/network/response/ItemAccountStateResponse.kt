package com.Andriy.Moshchuk.movieviewer.data.network.response


class ItemAccountStateResponse(
        val id: Int,
        val favorite: Boolean,
        val rated: Boolean,
        val watchlist: Boolean)

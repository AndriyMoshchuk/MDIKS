package com.Andriy.Moshchuk.movieviewer.domain

import com.Andriy.Moshchuk.movieviewer.data.entity.TvType
import com.Andriy.Moshchuk.movieviewer.data.network.ApiClient
import javax.inject.Inject

class TvUseCase @Inject constructor(private val apiClient: ApiClient) {

    fun getTv(tvType: TvType, page: Int) = apiClient.getTV(tvType, page)
}

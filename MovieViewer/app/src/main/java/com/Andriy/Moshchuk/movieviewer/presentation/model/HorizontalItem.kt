package com.Andriy.Moshchuk.movieviewer.presentation.model

data class HorizontalItem(
        val id: Int,
        val itemType: ItemType,
        val imageUrl: String?,
        val iconId: Int?,
        val text: String
)
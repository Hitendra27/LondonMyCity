package com.example.londonmycity.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class LondonCategory(
    val id: Int,
    @StringRes val title: Int,
    @StringRes  val subtitle: Int,
    @DrawableRes val imageResourceId: Int,
    val attraction: List<LondonAttraction>
)

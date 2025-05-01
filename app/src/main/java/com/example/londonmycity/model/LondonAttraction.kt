package com.example.londonmycity.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

/**
 * Data model for london Attractions
 */
data class LondonAttraction(
    val id: Int,
    @StringRes val titleResourceId: Int,
    @StringRes val subtitleResourceId: Int,
    val recommended: Boolean,
    val highlyRecommended: Boolean,
    @DrawableRes val imageResourceId: Int,
    @StringRes val details: Int
)

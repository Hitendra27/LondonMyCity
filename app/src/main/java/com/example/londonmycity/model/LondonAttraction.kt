package com.example.londonmycity.model

/**
 * Data model for each london Attractions
 */
data class LondonAttraction(
    val id: Int,
    val titleResourceId: Int,
    val subtitleResourceId: Int,
    val recommended: Boolean,
    val highlyRecommended: Boolean,
    val imageResourceId: Int,
    val details: Int
)

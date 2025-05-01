package com.example.londonmycity.data

import com.example.londonmycity.R
import com.example.londonmycity.model.LondonAttraction
import com.example.londonmycity.model.LondonCategory

/**
 * London Category for attractions etc
 */
object LocalCategoryDataProvider {
    val defaultCategory = getCategoryData()[0]

    fun getCategoryData(): List<LondonCategory> {
        return listOf(
            LondonCategory(
                id = 1,
                title = R.string.attractions,
                subtitle = R.string.attractions_subtitle,
                imageResourceId = R.drawable.attractions,
                attraction = listOf(
                    LondonAttraction(
                        id = 1,
                        titleResourceId = R.string.warner_bros_studio,
                        subtitleResourceId = R.string.warner_bros_studio_subtitle,
                        recommended = true,
                        highlyRecommended = true,
                        imageResourceId = R.drawable.warner_bros_studio_our_london,
                        details = R.string.warner_bros_studio_detail_text
                    ),
                    LondonAttraction(
                        id = 2,
                        titleResourceId = R.string.london_eye,
                        subtitleResourceId = R.string.london_eye_subtitle,
                        recommended = true,
                        highlyRecommended = false,
                        imageResourceId = R.drawable.the_london_eye,
                        details = R.string.london_eye_detail

                    )
                )
            ),
            LondonCategory(
                id = 2,
                title = R.string.museum,
                subtitle = R.string.museum_subtitle,
                imageResourceId = R.drawable.museum,
                attraction = listOf(
                    LondonAttraction(
                        id = 1,
                        titleResourceId = R.string.warner_bros_studio,
                        subtitleResourceId = R.string.warner_bros_studio_subtitle,
                        recommended = true,
                        highlyRecommended = true,
                        imageResourceId = R.drawable.warner_bros_studio_our_london,
                        details = R.string.warner_bros_studio_detail_text
                    )
                )
            ),
            LondonCategory(
                id = 3,
                title = R.string.transport,
                subtitle = R.string.theatre_subtitle,
                imageResourceId = R.drawable.transport,
                attraction = listOf(
                    LondonAttraction(
                        id = 1,
                        titleResourceId = R.string.warner_bros_studio,
                        subtitleResourceId = R.string.warner_bros_studio_subtitle,
                        recommended = true,
                        highlyRecommended = true,
                        imageResourceId = R.drawable.warner_bros_studio_our_london,
                        details = R.string.warner_bros_studio_detail_text
                    )
                )
            ),
            LondonCategory(
                id = 4,
                title = R.string.sport_stadium,
                subtitle = R.string.sports_stadium_subtitle,
                imageResourceId = R.drawable.stadium,
                attraction = listOf(
                    LondonAttraction(
                        id = 1,
                        titleResourceId = R.string.warner_bros_studio,
                        subtitleResourceId = R.string.warner_bros_studio_subtitle,
                        recommended = true,
                        highlyRecommended = true,
                        imageResourceId = R.drawable.warner_bros_studio_our_london,
                        details = R.string.warner_bros_studio_detail_text
                    )
                )
            ),
            LondonCategory(
                id = 5,
                title = R.string.theatre,
                subtitle = R.string.theatre_subtitle,
                imageResourceId = R.drawable.theatre,
                attraction = listOf(
                    LondonAttraction(
                        id = 1,
                        titleResourceId = R.string.warner_bros_studio,
                        subtitleResourceId = R.string.warner_bros_studio_subtitle,
                        recommended = true,
                        highlyRecommended = true,
                        imageResourceId = R.drawable.warner_bros_studio_our_london,
                        details = R.string.warner_bros_studio_detail_text
                    )
                )
            )
        )
    }
}

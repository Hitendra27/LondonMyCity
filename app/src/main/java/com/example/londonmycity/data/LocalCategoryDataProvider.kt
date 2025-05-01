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

                    ),
                    LondonAttraction(
                        id = 3,
                        titleResourceId = R.string.hopon_hopoff,
                        subtitleResourceId = R.string.hopon_hopoff_subtitle,
                        recommended = true,
                        highlyRecommended = false,
                        imageResourceId = R.drawable.hop_on_hop_off,
                        details = R.string.hopon_hopoff_detail
                    ),
                    LondonAttraction(
                        id = 4,
                        titleResourceId = R.string.tower_of_london,
                        subtitleResourceId = R.string.tower_of_london_subtitle,
                        recommended = true,
                        highlyRecommended = false,
                        imageResourceId = R.drawable.tower_of_london,
                        details = R.string.tower_of_london_detail
                    ),
                    LondonAttraction(
                        id = 5,
                        titleResourceId = R.string.buckingham_palace,
                        subtitleResourceId = R.string.buckingham_palace_subtitle,
                        recommended = true,
                        highlyRecommended = false,
                        imageResourceId = R.drawable.buckingham_palace,
                        details = R.string.buckingham_palace_detail
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
                        titleResourceId = R.string.british_museum,
                        subtitleResourceId = R.string.british_museum_subtitle,
                        recommended = true,
                        highlyRecommended = true,
                        imageResourceId = R.drawable.british_museaum,
                        details = R.string.british_museum_detail
                    ),
                    LondonAttraction(
                        id = 2,
                        titleResourceId = R.string.natural_history_museum,
                        subtitleResourceId = R.string.natural_history_museum_subtitle,
                        recommended = true,
                        highlyRecommended = false,
                        imageResourceId = R.drawable.natural_history_musuem,
                        details = R.string.natural_history_museum_detail
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

        ),
        LondonCategory(
            id = 6,
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
        ),
        LondonCategory(
            id = 7,
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
           ),
        )
    }
}

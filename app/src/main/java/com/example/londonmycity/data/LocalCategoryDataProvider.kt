package com.example.londonmycity.data

import com.example.londonmycity.R
import com.example.londonmycity.model.LondonCategory

/**
 * London Category for attractions etc
 */
class LocalCategoryDataProvider {
    val defaultCategory = getCategoryData()[0]

    fun getCategoryData(): List<LondonCategory> {
        return listOf(
            LondonCategory(
                id = 1,
                title = R.string.attractions,
                subtitle = R.string.attractions_subtitle,
                imageResource = R.drawable.attractions
            ),
            LondonCategory(
                id = 2,
                title = R.string.museum,
                subtitle = R.string.museum_subtitle,
                imageResource = R.drawable.museum
            ),
            LondonCategory(
                id = 3,
                title = R.string.transport,
                subtitle = R.string.theatre_subtitle,
                imageResource = R.drawable.transport
            ),
            LondonCategory(
                id = 4,
                title = R.string.sport_stadium,
                subtitle = R.string.sports_stadium_subtitle,
                imageResource = R.drawable.stadium
            ),
            LondonCategory(
                id = 5,
                title = R.string.theatre,
                subtitle = R.string.tower_of_london,
                imageResource = R.drawable.theatre
            )
        )
    }
}

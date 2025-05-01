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
                        details = R.string.warner_bros_studio_detail
                    ),
                    LondonAttraction(
                        id = 2,
                        titleResourceId = R.string.london_eye,
                        subtitleResourceId = R.string.london_eye_subtitle,
                        recommended = true,
                        highlyRecommended = true,
                        imageResourceId = R.drawable.the_london_eye,
                        details = R.string.london_eye_detail
                    ),
                    LondonAttraction(
                        id = 3,
                        titleResourceId = R.string.madame_tussauds,
                        subtitleResourceId = R.string.madame_tussauds_subtitle,
                        recommended = true,
                        highlyRecommended = true,
                        imageResourceId = R.drawable.madame_tussauds,
                        details = R.string.madame_tussauds_detail
                    ),
                    LondonAttraction(
                        id = 4,
                        titleResourceId = R.string.tower_of_london,
                        subtitleResourceId = R.string.tower_of_london_subtitle,
                        recommended = true,
                        highlyRecommended = true,
                        imageResourceId = R.drawable.tower_of_london,
                        details = R.string.tower_of_london_detail
                    ),
                    LondonAttraction(
                        id = 5,
                        titleResourceId = R.string.hopon_hopoff,
                        subtitleResourceId = R.string.hopon_hopoff_subtitle,
                        recommended = true,
                        highlyRecommended = true,
                        imageResourceId = R.drawable.hop_on_hop_off,
                        details = R.string.hopon_hopoff_detail
                    ),
                    LondonAttraction(
                        id = 6,
                        titleResourceId = R.string.buckingham_palace,
                        subtitleResourceId = R.string.buckingham_palace_subtitle,
                        recommended = true,
                        highlyRecommended = true,
                        imageResourceId = R.drawable.buckingham_palace,
                        details = R.string.buckingham_palace_detail
                    ),
                    LondonAttraction(
                        id = 7,
                        titleResourceId = R.string.st_pauls_cathedral,
                        subtitleResourceId = R.string.st_pauls_cathedral_subtitle,
                        recommended = true,
                        highlyRecommended = true,
                        imageResourceId = R.drawable.st_paul,
                        details = R.string.st_pauls_cathedral_detail
                    ),
                    LondonAttraction(
                        id = 8,
                        titleResourceId = R.string.tower_bridge,
                        subtitleResourceId = R.string.tower_bridge_subtitle,
                        recommended = true,
                        highlyRecommended = true,
                        imageResourceId = R.drawable.tower_bridge,
                        details = R.string.tower_bridge_detail
                    ),
                    LondonAttraction(
                        id = 9,
                        titleResourceId = R.string.sky_garden,
                        subtitleResourceId = R.string.sky_garden_subtitle,
                        recommended = true,
                        highlyRecommended = true,
                        imageResourceId = R.drawable.sky_garden,
                        details = R.string.sky_garden_detail
                    ),
                    LondonAttraction(
                        id = 10,
                        titleResourceId = R.string.borough_market,
                        subtitleResourceId = R.string.borough_market_subtitle,
                        recommended = true,
                        highlyRecommended = true,
                        imageResourceId = R.drawable.borough_market,
                        details = R.string.british_museum_detail
                    ),
                    LondonAttraction(
                        id = 11,
                        titleResourceId = R.string.camden_town,
                        subtitleResourceId = R.string.camden_town_subtitle,
                        recommended = true,
                        highlyRecommended = true,
                        imageResourceId = R.drawable.camden_town,
                        details = R.string.british_museum_detail
                    ),
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
                        subtitleResourceId = R.string.british_museum_detail,
                        recommended = true,
                        highlyRecommended = true,
                        imageResourceId = R.drawable.british_museaum,
                        details = R.string.british_museum_detail
                    ),
                    LondonAttraction(
                        id = 2,
                        titleResourceId = R.string.natural_history_museum,
                        subtitleResourceId = R.string.natural_history_museum_detail,
                        recommended = true,
                        highlyRecommended = false,
                        imageResourceId = R.drawable.natural_history_musuem,
                        details = R.string.natural_history_museum_detail
                    ),
                    LondonAttraction(
                        id = 3,
                        titleResourceId = R.string.victoria_albert_museum,
                        subtitleResourceId = R.string.victoria_albert_museum_detail,
                        recommended = true,
                        highlyRecommended = false,
                        imageResourceId = R.drawable.victoria_and_albert,
                        details = R.string.victoria_albert_museum_detail
                    ),
                    LondonAttraction(
                        id = 4,
                        titleResourceId = R.string.tate_modern,
                        subtitleResourceId = R.string.tate_modern_detail,
                        recommended = true,
                        highlyRecommended = false,
                        imageResourceId = R.drawable.tate_modern,
                        details = R.string.tate_modern_detail
                    ),
                    LondonAttraction(
                        id = 5,
                        titleResourceId = R.string.science_museum,
                        subtitleResourceId = R.string.science_museum_detail,
                        recommended = true,
                        highlyRecommended = false,
                        imageResourceId = R.drawable.science_museum,
                        details = R.string.science_museum_detail
                    ),
                    LondonAttraction(
                        id = 6,
                        titleResourceId = R.string.national_gallery,
                        subtitleResourceId = R.string.national_gallery_detail,
                        recommended = true,
                        highlyRecommended = false,
                        imageResourceId = R.drawable.national_gallery,
                        details = R.string.national_gallery_detail
                    ),
                    LondonAttraction(
                        id = 7,
                        titleResourceId = R.string.churchill_war_rooms,
                        subtitleResourceId = R.string.churchill_war_rooms_detail,
                        recommended = true,
                        highlyRecommended = false,
                        imageResourceId = R.drawable.churchill_warrooms,
                        details = R.string.churchill_war_rooms_detail
                    ),
                )
            ),
            LondonCategory(
                id = 3,
                title = R.string.transport,
                subtitle = R.string.transport_subtitle,
                imageResourceId = R.drawable.transport,
                attraction = listOf(
                    LondonAttraction(
                        id = 1,
                        titleResourceId = R.string.tube,
                        subtitleResourceId = R.string.tube_detail,
                        recommended = true,
                        highlyRecommended = true,
                        imageResourceId = R.drawable.underground,
                        details = R.string.tube_detail
                    ),
                    LondonAttraction(
                        id = 2,
                        titleResourceId = R.string.buses,
                        subtitleResourceId = R.string.buses_detail,
                        recommended = true,
                        highlyRecommended = true,
                        imageResourceId = R.drawable.bus,
                        details = R.string.buses_detail
                    ),
                    LondonAttraction(
                        id = 3,
                        titleResourceId = R.string.dlr,
                        subtitleResourceId = R.string.dlr_detail,
                        recommended = true,
                        highlyRecommended = true,
                        imageResourceId = R.drawable.dlr,
                        details = R.string.dlr_detail
                    ),
                    LondonAttraction(
                        id = 4,
                        titleResourceId = R.string.overground,
                        subtitleResourceId = R.string.overground_detail,
                        recommended = true,
                        highlyRecommended = true,
                        imageResourceId = R.drawable.overground,
                        details = R.string.overground_detail
                    ),
                    LondonAttraction(
                        id = 5,
                        titleResourceId = R.string.trams,
                        subtitleResourceId = R.string.trams_detail,
                        recommended = true,
                        highlyRecommended = true,
                        imageResourceId = R.drawable.trams,
                        details = R.string.trams_detail
                    ),
                    LondonAttraction(
                        id = 6,
                        titleResourceId = R.string.national_rail,
                        subtitleResourceId = R.string.national_rail_detail,
                        recommended = true,
                        highlyRecommended = true,
                        imageResourceId = R.drawable.national_rail,
                        details = R.string.national_rail_detail
                    ),
                    LondonAttraction(
                        id = 7,
                        titleResourceId = R.string.river_bus,
                        subtitleResourceId = R.string.river_bus_detail,
                        recommended = true,
                        highlyRecommended = true,
                        imageResourceId = R.drawable.river_thames,
                        details = R.string.river_bus_detail
                    ),
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
                        titleResourceId = R.string.british_museum,
                        subtitleResourceId = R.string.british_museum_detail,
                        recommended = true,
                        highlyRecommended = true,
                        imageResourceId = R.drawable.warner_bros_studio_our_london,
                        details = R.string.british_museum_detail
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
                        titleResourceId = R.string.british_museum,
                        subtitleResourceId = R.string.british_museum_detail,
                        recommended = true,
                        highlyRecommended = true,
                        imageResourceId = R.drawable.warner_bros_studio_our_london,
                        details = R.string.british_museum_detail
                    )
                )

        ),
        LondonCategory(
            id = 6,
            title = R.string.shopping,
            subtitle = R.string.shopping_subtitle,
            imageResourceId = R.drawable.shopping,
            attraction = listOf(
                LondonAttraction(
                    id = 1,
                    titleResourceId = R.string.british_museum,
                    subtitleResourceId = R.string.british_museum_detail,
                    recommended = true,
                    highlyRecommended = true,
                    imageResourceId = R.drawable.warner_bros_studio_our_london,
                    details = R.string.british_museum_detail
                )
            )
        ),
        LondonCategory(
            id = 7,
            title = R.string.activities,
            subtitle = R.string.activities_subtitle,
            imageResourceId = R.drawable.activities,
            attraction = listOf(
                LondonAttraction(
                    id = 1,
                    titleResourceId = R.string.british_museum,
                    subtitleResourceId = R.string.british_museum_detail,
                    recommended = true,
                    highlyRecommended = true,
                    imageResourceId = R.drawable.warner_bros_studio_our_london,
                    details = R.string.british_museum_detail
                )
            )
           ),
            LondonCategory(
                id = 8,
                title = R.string.parks,
                subtitle = R.string.parks_subtitle,
                imageResourceId = R.drawable.parks,
                attraction = listOf(
                    LondonAttraction(
                        id = 1,
                        titleResourceId = R.string.british_museum,
                        subtitleResourceId = R.string.british_museum_detail,
                        recommended = true,
                        highlyRecommended = true,
                        imageResourceId = R.drawable.warner_bros_studio_our_london,
                        details = R.string.british_museum_detail
                    )
                )
            ),
            LondonCategory(
                id = 9,
                title = R.string.airport,
                subtitle = R.string.airport_subtitle,
                imageResourceId = R.drawable.airport,
                attraction = listOf(
                    LondonAttraction(
                        id = 1,
                        titleResourceId = R.string.british_museum,
                        subtitleResourceId = R.string.british_museum_detail,
                        recommended = true,
                        highlyRecommended = true,
                        imageResourceId = R.drawable.warner_bros_studio_our_london,
                        details = R.string.british_museum_detail
                    )
                )
            ),
            LondonCategory(
                id = 10,
                title = R.string.restaurants,
                subtitle = R.string.restaurants_subtitle,
                imageResourceId = R.drawable.restaurants,
                attraction = listOf(
                    LondonAttraction(
                        id = 1,
                        titleResourceId = R.string.british_museum,
                        subtitleResourceId = R.string.british_museum_detail,
                        recommended = true,
                        highlyRecommended = true,
                        imageResourceId = R.drawable.warner_bros_studio_our_london,
                        details = R.string.british_museum_detail
                    )
                )
            ),
        )
    }
}

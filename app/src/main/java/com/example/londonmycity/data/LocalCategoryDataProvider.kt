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
                        titleResourceId = R.string.arsenal_emirates_stadium,
                        subtitleResourceId = R.string.arsenal_emirates_stadium_subtitle,
                        recommended = true,
                        highlyRecommended = true,
                        imageResourceId = R.drawable.emirates,
                        details = R.string.arsenal_emirates_stadium_detail
                    ),
                    LondonAttraction(
                        id = 2,
                        titleResourceId = R.string.lords_cricket_ground,
                        subtitleResourceId = R.string.lords_cricket_ground_subtitle,
                        recommended = true,
                        highlyRecommended = true,
                        imageResourceId = R.drawable.lords,
                        details = R.string.lords_cricket_ground_detail
                    ),
                    LondonAttraction(
                        id = 3,
                        titleResourceId = R.string.the_oval,
                        subtitleResourceId = R.string.the_oval_subtitle,
                        recommended = true,
                        highlyRecommended = true,
                        imageResourceId = R.drawable.kia_oval,
                        details = R.string.the_oval_detail
                    ),
                    LondonAttraction(
                        id = 4,
                        titleResourceId = R.string.twickenham_stadium,
                        subtitleResourceId = R.string.twickenham_stadium_subtitle,
                        recommended = true,
                        highlyRecommended = true,
                        imageResourceId = R.drawable.twickenham_stadium,
                        details = R.string.twickenham_stadium_detail
                    ),
                    LondonAttraction(
                        id = 5,
                        titleResourceId = R.string.wembley_stadium,
                        subtitleResourceId = R.string.wembley_stadium_subtitle,
                        recommended = true,
                        highlyRecommended = true,
                        imageResourceId = R.drawable.wembley_stadium,
                        details = R.string.wembley_stadium_detail
                    ),
                    LondonAttraction(
                        id = 6,
                        titleResourceId = R.string.tottenham_hotspur_stadium,
                        subtitleResourceId = R.string.tottenham_hotspur_stadium_subtitle,
                        recommended = true,
                        highlyRecommended = true,
                        imageResourceId = R.drawable.tottenham_hotspur_stadium,
                        details = R.string.tottenham_hotspur_stadium_detail
                    ),
                    LondonAttraction(
                        id = 7,
                        titleResourceId = R.string.wimbledon,
                        subtitleResourceId = R.string.wimbledon_subtitle,
                        recommended = true,
                        highlyRecommended = true,
                        imageResourceId = R.drawable.wimbledon,
                        details = R.string.wimbledon_detail
                    ),
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
                        titleResourceId = R.string.the_national_theatre,
                        subtitleResourceId = R.string.the_national_theatre_subtitle,
                        recommended = true,
                        highlyRecommended = true,
                        imageResourceId = R.drawable.national_theatre,
                        details = R.string.the_national_theatre_detail
                    ),
                    LondonAttraction(
                        id = 2,
                        titleResourceId = R.string.shakespeares_globe,
                        subtitleResourceId = R.string.shakespeares_globe_subtitle,
                        recommended = true,
                        highlyRecommended = true,
                        imageResourceId = R.drawable.shakespeare_globe,
                        details = R.string.shakespeares_globe_detail
                    ),
                    LondonAttraction(
                        id = 3,
                        titleResourceId = R.string.royal_opera_house,
                        subtitleResourceId = R.string.royal_opera_house_subtitle,
                        recommended = true,
                        highlyRecommended = true,
                        imageResourceId = R.drawable.royal_opera,
                        details = R.string.royal_opera_house_detail
                    ),
                    LondonAttraction(
                        id = 4,
                        titleResourceId = R.string.theatre_royal_drury_lane,
                        subtitleResourceId = R.string.theatre_royal_drury_lane_subtitle,
                        recommended = true,
                        highlyRecommended = true,
                        imageResourceId = R.drawable.royal_drury_lane,
                        details = R.string.theatre_royal_drury_lane_detail
                    ),
                    LondonAttraction(
                        id = 5,
                        titleResourceId = R.string.london_palladium,
                        subtitleResourceId = R.string.london_palladium_subtitle,
                        recommended = true,
                        highlyRecommended = true,
                        imageResourceId = R.drawable.london_palladium,
                        details = R.string.london_palladium_detail
                    ),
                    LondonAttraction(
                        id = 6,
                        titleResourceId = R.string.old_vic_theatre,
                        subtitleResourceId = R.string.old_vic_theatre_subtitle,
                        recommended = true,
                        highlyRecommended = true,
                        imageResourceId = R.drawable.old_vic,
                        details = R.string.old_vic_theatre_detail
                    ),
                    LondonAttraction(
                        id = 7,
                        titleResourceId = R.string.the_apollo_theatre,
                        subtitleResourceId = R.string.the_apollo_theatre_subtitle,
                        recommended = true,
                        highlyRecommended = true,
                        imageResourceId = R.drawable.apollo_theatre,
                        details = R.string.the_apollo_theatre_detail
                    ),
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
                    titleResourceId = R.string.oxford_street,
                    subtitleResourceId = R.string.oxford_street_subtitle,
                    recommended = true,
                    highlyRecommended = true,
                    imageResourceId = R.drawable.oxford_st,
                    details = R.string.oxford_street_detail
                ),
                LondonAttraction(
                    id = 2,
                    titleResourceId = R.string.covent_garden,
                    subtitleResourceId = R.string.covent_garden_subtitle,
                    recommended = true,
                    highlyRecommended = true,
                    imageResourceId = R.drawable.covent_garden,
                    details = R.string.covent_garden_detail
                ),
                LondonAttraction(
                    id = 3,
                    titleResourceId = R.string.regent_street,
                    subtitleResourceId = R.string.regent_street_subtitle,
                    recommended = true,
                    highlyRecommended = true,
                    imageResourceId = R.drawable.regents_st,
                    details = R.string.regent_street_detail
                ),
                LondonAttraction(
                    id = 4,
                    titleResourceId = R.string.bond_street,
                    subtitleResourceId = R.string.bond_street_subtitle,
                    recommended = true,
                    highlyRecommended = true,
                    imageResourceId = R.drawable.bond_st,
                    details = R.string.bond_street_detail
                ),
                LondonAttraction(
                    id = 5,
                    titleResourceId = R.string.carnaby_street,
                    subtitleResourceId = R.string.carnaby_street_subtitle,
                    recommended = true,
                    highlyRecommended = true,
                    imageResourceId = R.drawable.carnaby_st,
                    details = R.string.carnaby_street_detail
                ),
                LondonAttraction(
                    id = 6,
                    titleResourceId = R.string.westfield_london,
                    subtitleResourceId = R.string.westfield_london_subtitle,
                    recommended = true,
                    highlyRecommended = true,
                    imageResourceId = R.drawable.westfield,
                    details = R.string.westfield_london_detail
                ),
                LondonAttraction(
                    id = 7,
                    titleResourceId = R.string.harrods,
                    subtitleResourceId = R.string.harrods_subtitle,
                    recommended = true,
                    highlyRecommended = true,
                    imageResourceId = R.drawable.harrods,
                    details = R.string.harrods_detail
                ),
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
                    titleResourceId = R.string.thames_river_cruise,
                    subtitleResourceId = R.string.thames_river_cruise_subtitle,
                    recommended = true,
                    highlyRecommended = true,
                    imageResourceId = R.drawable.thames_river_cruise,
                    details = R.string.thames_river_cruise_detail
                ),
                LondonAttraction(
                    id = 2,
                    titleResourceId = R.string.street_food_markets,
                    subtitleResourceId = R.string.street_food_markets_subtitle,
                    recommended = true,
                    highlyRecommended = true,
                    imageResourceId = R.drawable.street_market,
                    details = R.string.street_food_markets_detail
                ),
                LondonAttraction(
                    id = 3,
                    titleResourceId = R.string.kew_gardens,
                    subtitleResourceId = R.string.kew_gardens_subtitle,
                    recommended = true,
                    highlyRecommended = true,
                    imageResourceId = R.drawable.botanic_garden,
                    details = R.string.kew_gardens_detail
                ),
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
                        titleResourceId = R.string.hyde_park,
                        subtitleResourceId = R.string.hyde_park_subtitle,
                        recommended = true,
                        highlyRecommended = true,
                        imageResourceId = R.drawable.hyde_park,
                        details = R.string.hyde_park_detail
                    ),
                    LondonAttraction(
                        id = 2,
                        titleResourceId = R.string.regents_park,
                        subtitleResourceId = R.string.regents_park_subtitle,
                        recommended = true,
                        highlyRecommended = true,
                        imageResourceId = R.drawable.regents_park,
                        details = R.string.regents_park_detail
                    ),
                    LondonAttraction(
                        id = 3,
                        titleResourceId = R.string.richmond_park,
                        subtitleResourceId = R.string.richmond_park_subtitle,
                        recommended = true,
                        highlyRecommended = true,
                        imageResourceId = R.drawable.richmond_park,
                        details = R.string.richmond_park_detail
                    ),
                    LondonAttraction(
                        id = 4,
                        titleResourceId = R.string.st_james_park,
                        subtitleResourceId = R.string.st_james_park_subtitle,
                        recommended = true,
                        highlyRecommended = true,
                        imageResourceId = R.drawable.st_james_park,
                        details = R.string.st_james_park_detail
                    ),
                    LondonAttraction(
                        id = 5,
                        titleResourceId = R.string.greenwich_park,
                        subtitleResourceId = R.string.greenwich_park_subtitle,
                        recommended = true,
                        highlyRecommended = true,
                        imageResourceId = R.drawable.greenwich_park,
                        details = R.string.greenwich_park_detail
                    ),
                    LondonAttraction(
                        id = 6,
                        titleResourceId = R.string.holland_park,
                        subtitleResourceId = R.string.holland_park_subtitle,
                        recommended = true,
                        highlyRecommended = true,
                        imageResourceId = R.drawable.holland_park,
                        details = R.string.holland_park_detail
                    ),
                    LondonAttraction(
                        id = 7,
                        titleResourceId = R.string.victoria_park,
                        subtitleResourceId = R.string.victoria_park_subtitle,
                        recommended = true,
                        highlyRecommended = true,
                        imageResourceId = R.drawable.victoria_park,
                        details = R.string.victoria_park_detail
                    ),
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
                        titleResourceId = R.string.heathrow_airport,
                        subtitleResourceId = R.string.heathrow_airport_subtitle,
                        recommended = true,
                        highlyRecommended = true,
                        imageResourceId = R.drawable.heathrow,
                        details = R.string.heathrow_airport_detail
                    ),
                    LondonAttraction(
                        id = 2,
                        titleResourceId = R.string.gatwick_airport,
                        subtitleResourceId = R.string.gatwick_airport_subtitle,
                        recommended = true,
                        highlyRecommended = true,
                        imageResourceId = R.drawable.gatwick,
                        details = R.string.gatwick_airport_detail
                    ),
                    LondonAttraction(
                        id = 3,
                        titleResourceId = R.string.stansted_airport,
                        subtitleResourceId = R.string.stansted_airport_subtitle,
                        recommended = true,
                        highlyRecommended = true,
                        imageResourceId = R.drawable.stansted,
                        details = R.string.stansted_airport_detail
                    ),
                    LondonAttraction(
                        id = 4,
                        titleResourceId = R.string.luton_airport,
                        subtitleResourceId = R.string.luton_airport_subtitle,
                        recommended = true,
                        highlyRecommended = true,
                        imageResourceId = R.drawable.luton,
                        details = R.string.luton_airport_detail
                    ),
                    LondonAttraction(
                        id = 5,
                        titleResourceId = R.string.london_city_airport,
                        subtitleResourceId = R.string.london_city_airport_subtitle,
                        recommended = true,
                        highlyRecommended = true,
                        imageResourceId = R.drawable.london_city_airport,
                        details = R.string.london_city_airport_detail
                    ),
                    LondonAttraction(
                        id = 6,
                        titleResourceId = R.string.southend_airport,
                        subtitleResourceId = R.string.southend_airport_subtitle,
                        recommended = true,
                        highlyRecommended = true,
                        imageResourceId = R.drawable.southend_airport,
                        details = R.string.southend_airport_detail
                    ),
                    LondonAttraction(
                        id = 7,
                        titleResourceId = R.string.biggin_hill_airport,
                        subtitleResourceId = R.string.biggin_hill_airport_subtitle,
                        recommended = true,
                        highlyRecommended = true,
                        imageResourceId = R.drawable.biggins_hill,
                        details = R.string.biggin_hill_airport_detail
                    ),
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
                        titleResourceId = R.string.the_palomar,
                        subtitleResourceId = R.string.the_palomar_subtitle,
                        recommended = true,
                        highlyRecommended = true,
                        imageResourceId = R.drawable.palamar,
                        details = R.string.british_museum_detail
                    ),
                    LondonAttraction(
                        id = 2,
                        titleResourceId = R.string.dishoom_covent_garden,
                        subtitleResourceId = R.string.dishoom_covent_garden_subtitle,
                        recommended = true,
                        highlyRecommended = true,
                        imageResourceId = R.drawable.dishoom,
                        details = R.string.british_museum_detail
                    ),
                    LondonAttraction(
                        id = 3,
                        titleResourceId = R.string.padella_shoreditch,
                        subtitleResourceId = R.string.padella_shoreditch_subtitle,
                        recommended = true,
                        highlyRecommended = true,
                        imageResourceId = R.drawable.padella,
                        details = R.string.padella_shoreditch_detail
                    ),
                    LondonAttraction(
                        id = 4,
                        titleResourceId = R.string.sketch_the_lecture_room_library,
                        subtitleResourceId = R.string.sketch_the_lecture_room_library_subtitle,
                        recommended = true,
                        highlyRecommended = true,
                        imageResourceId = R.drawable.sketch,
                        details = R.string.sketch_the_lecture_room_library_detail
                    ),
                    LondonAttraction(
                        id = 5,
                        titleResourceId = R.string.hoppers_soho,
                        subtitleResourceId = R.string.hoppers_soho_subtitle,
                        recommended = true,
                        highlyRecommended = true,
                        imageResourceId = R.drawable.hoppers,
                        details = R.string.hoppers_soho_detail
                    ),
                    LondonAttraction(
                        id = 6,
                        titleResourceId = R.string.flat_iron_steak,
                        subtitleResourceId = R.string.flat_iron_steak_subtitle,
                        recommended = true,
                        highlyRecommended = true,
                        imageResourceId = R.drawable.flat_iron,
                        details = R.string.flat_iron_steak_detail
                    ),
                    LondonAttraction(
                        id = 7,
                        titleResourceId = R.string.duck_and_waffle,
                        subtitleResourceId = R.string.duck_and_waffle_subtitle,
                        recommended = true,
                        highlyRecommended = true,
                        imageResourceId = R.drawable.duck_and_waffle,
                        details = R.string.duck_and_waffle_detail
                    ),
                ),

            ),
        )
    }
}

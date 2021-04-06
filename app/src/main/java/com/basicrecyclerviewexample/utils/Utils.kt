package com.basicrecyclerviewexample.utils

import com.basicrecyclerviewexample.R
import com.basicrecyclerviewexample.data.Movie

fun getActionMovieList() = listOf(
    Movie(R.drawable.inception, "Inception", "Action-Sci-fi", "Christopher Nolan", "2h 42m"),
    Movie(
        R.drawable.shutter_island,
        "Shutter Island",
        "Thriller-Mystery",
        "Martin Scorsese",
        "2h 19m"
    ),
    Movie(
        R.drawable.minority_report,
        "Minority Report",
        "Sci-fi-Action",
        "Steven Spielberg",
        "2h 26m"
    ),
    Movie(R.drawable.collateral, "Collateral", "Thriller-Crime", "Michael Mann", "2 hours"),
    Movie(
        R.drawable.the_bourne_ultimatum,
        "The Bourne Ultimatum",
        "Action-Thriller",
        "Paul Greengrass",
        "1h 56m"
    ),
    Movie(R.drawable.the_raid, "The Raid", "Action-Martial Arts", "Gareth Evans", "1h 42m")
)

fun getComedyMovieList() = listOf(
    Movie(
        R.drawable.twenty_one_jump_street,
        "21 Jump Street",
        "Comedy-Action",
        "Phil Lord, Chris Miller",
        "1h 50m"
    ),
    Movie(R.drawable.yes_man, "Yes Man", "Comedy-Romance", "Peyton Reed", "1h 44m"),
    Movie(
        R.drawable.back_to_the_future,
        "Back to the Future",
        "Sci-fi-Comedy",
        "Robert Zemeckis",
        "1h 56m"
    ),
    Movie(R.drawable.get_smart, "Get Smart", "Comedy-Action", "Peter Segal", "1h 51m"),
    Movie(R.drawable.the_dictator, "The Dictator", "Comedy-Dark comedy", "Larry Charles", "1h 39m"),
    Movie(R.drawable.the_hangover, "The Hangover", "Comedy", "Todd Phillips", "1h 48m")
)

fun getAnimationMovieList() = listOf(
    Movie(R.drawable.ratatouille, "Ratatouille", "Family-Comedy", "Brad Bird", "1h 51m"),
    Movie(R.drawable.monsters_inc, "Monsters, Inc.", "Comedy-Adventure", "Pete Docter", "1h 36m"),
    Movie(R.drawable.megamind, "Megamind", "Family-Comedy", "Tom McGrath", "1h 36m"),
    Movie(R.drawable.the_incredibles, "The Incredibles", "Family-Comedy", "Brad Bird", "1h 56m"),
    Movie(
        R.drawable.kung_fu_panda,
        "Kung Fu Panda",
        "Family-Comedy",
        "Mark Osborne, John Stevenson",
        "1h 35m"
    ),
    Movie(
        R.drawable.how_to_train_your_dragon,
        "How To Train Your Dragon",
        "Family-Adventure",
        "Chris Sanders, Dean DeBlois",
        "1h 38m"
    )
)
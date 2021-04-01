package com.basicrecyclerviewexample

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Movie(
    val moviePoster: Int = 0,
    val movieName: String,
    val movieGenre: String,
    val movieDirector: String
) : Parcelable

fun getActionMovieList() = listOf(
    Movie(R.drawable.inception, "Inception", "Action/Sci-fi", "Christopher Nolan"),
    Movie(R.drawable.shutter_island, "Shutter Island", "Thriller/Mystery", "Martin Scorsese"),
    Movie(R.drawable.minority_report, "Minority Report", "Sci-fi/Action", "Steven Spielberg"),
    Movie(R.drawable.collateral, "Collateral", "Thriller/Crime", "Michael Mann"),
    Movie(
        R.drawable.the_bourne_ultimatum,
        "The Bourne Ultimatum",
        "Action/Thriller",
        "Paul Greengrass"
    ),
    Movie(R.drawable.the_raid, "The Raid", "Action/Martial Arts", "Gareth Evans")
)

fun getComedyMovieList() = listOf(
    Movie(R.drawable.twenty_one_jump_street, "21 Jump Street", "Comedy/Action", "Phil Lord, Chris Miller"),
    Movie(R.drawable.yes_man, "Yes Man", "Comedy/Romance", "Peyton Reed"),
    Movie(R.drawable.back_to_the_future, "Back to the Future", "Sci-fi/Comedy", "Robert Zemeckis"),
    Movie(R.drawable.get_smart, "Get Smart", "Comedy/Action", "Peter Segal"),
    Movie(R.drawable.the_dictator, "The Dictator", "Comedy/Dark comedy", "Larry Charles"),
    Movie(R.drawable.the_hangover, "The Hangover", "Comedy", "Todd Phillips")
)

fun getAnimationMovieList() = listOf(
    Movie(R.drawable.ratatouille, "Ratatouille", "Family/Comedy", "Brad Bird"),
    Movie(R.drawable.monsters_inc, "Monsters, Inc.", "Comedy/Adventure", "Pete Docter"),
    Movie(R.drawable.megamind, "Megamind", "Family/Comedy", "Tom McGrath"),
    Movie(R.drawable.the_incredibles, "The Incredibles", "Family/Comedy", "Brad Bird"),
    Movie(R.drawable.kung_fu_panda, "Kung Fu Panda", "Family/Comedy", "Mark Osborne, John Stevenson"),
    Movie(R.drawable.how_to_train_your_dragon, "How To Train Your Dragon", "Family/Adventure", "Chris Sanders, Dean DeBlois")
)
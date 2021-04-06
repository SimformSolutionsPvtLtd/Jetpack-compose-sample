package com.basicrecyclerviewexample.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Movie(
    val moviePoster: Int = 0,
    val movieName: String,
    val movieGenre: String,
    val movieDirector: String,
    val movieDuration: String,
    val movieSynopsis: String = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla sed interdum nulla. Suspendisse ac mi a ex dictum ultricies eget in tortor. Duis sit amet iaculis sapien. Suspendisse sit amet massa mi. Aliquam tempus pellentesque eleifend. Phasellus non tellus quam. Suspendisse potenti. Fusce ut rutrum elit, vitae ullamcorper nisi. Fusce gravida sem non augue ornare placerat. Fusce id accumsan diam. Morbi aliquet tellus accumsan tempus interdum. Nulla imperdiet ut sem in feugiat. Mauris ultrices odio ac dolor placerat interdum. Suspendisse tristique ultrices sem sed gravida."
) : Parcelable
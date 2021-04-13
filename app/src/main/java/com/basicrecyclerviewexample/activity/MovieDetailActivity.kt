package com.basicrecyclerviewexample.activity

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.basicrecyclerviewexample.data.Movie
import com.basicrecyclerviewexample.ui.theme.BasicRecyclerViewExampleTheme

class MovieDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            BasicRecyclerViewExampleTheme {
                Surface(color = MaterialTheme.colors.background) {
                    MovieDetail(movie = intent.getParcelableExtra("movie_data")!!)
                }
            }
        }
    }
}

@Composable
fun MovieDetail(movie: Movie) {
    LazyColumn(content = {
        item {
            Image(
                painterResource(id = movie.moviePoster),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(400.dp),
                contentDescription = "",
                contentScale = ContentScale.Crop,
                alignment = Alignment.TopStart
            )
            Spacer(Modifier.size(20.dp))
            Text(
                modifier = Modifier
                    .wrapContentWidth()
                    .wrapContentHeight()
                    .padding(start = 10.dp),
                style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold),
                text = movie.movieName
            )
            Spacer(Modifier.size(10.dp))
            GeneralText(textToShow = "${movie.movieDuration} | ${movie.movieGenre} | ${movie.movieDirector}")
            Text(
                modifier = Modifier
                    .wrapContentWidth()
                    .wrapContentHeight()
                    .padding(start = 10.dp),
                style = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.Bold),
                text = "Synopsis: "
            )
            GeneralText(textToShow = movie.movieSynopsis)
        }
    })
}

@Composable
fun GeneralText(textToShow: String) {
    Text(
        modifier = Modifier
            .wrapContentWidth()
            .wrapContentHeight()
            .padding(start = 10.dp, end = 10.dp, bottom = 10.dp),
        style = TextStyle(fontSize = 16.sp),
        text = textToShow
    )
}
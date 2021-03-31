package com.basicrecyclerviewexample

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .wrapContentWidth()
            .wrapContentHeight()
    ) {
        Image(
            painterResource(id = movie.moviePoster),
            modifier = Modifier
                .fillMaxWidth()
                .height(400.dp),
            contentDescription = ""
        )
        Spacer(Modifier.size(20.dp))
        GeneralText(textToShow = "Genre: ${movie.movieGenre}")
        GeneralText(textToShow = "Directed by: ${movie.movieDirector}")
    }
}

@Composable
fun GeneralText(textToShow: String) {
    Text(
        modifier = Modifier
            .wrapContentWidth()
            .wrapContentHeight()
            .padding(start = 10.dp),
        style = TextStyle(fontSize = 16.sp),
        text = textToShow
    )
}
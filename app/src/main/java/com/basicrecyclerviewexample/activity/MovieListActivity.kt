package com.basicrecyclerviewexample.activity

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
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
import com.basicrecyclerviewexample.data.Movie
import com.basicrecyclerviewexample.ui.theme.BasicRecyclerViewExampleTheme
import com.basicrecyclerviewexample.utils.getActionMovieList
import com.basicrecyclerviewexample.utils.getAnimationMovieList
import com.basicrecyclerviewexample.utils.getComedyMovieList

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BasicRecyclerViewExampleTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    LazyColumn(content = {
                        item {
                            GenreTitle(genreTitle = "Action Thriller")
                            MovieList(movieList = getActionMovieList()) { movie ->
                                Toast.makeText(
                                    this@MainActivity,
                                    movie.movieName,
                                    Toast.LENGTH_SHORT
                                ).show()
                                startActivity(
                                    Intent(this@MainActivity, MovieDetailActivity::class.java)
                                        .putExtra("movie_data", movie)
                                )
                            }
                            Spacer(Modifier.size(10.dp))
                            GenreTitle(genreTitle = "Comedy")
                            MovieList(movieList = getComedyMovieList()) { movie ->
                                Toast.makeText(
                                    this@MainActivity,
                                    movie.movieName,
                                    Toast.LENGTH_SHORT
                                ).show()
                                startActivity(
                                    Intent(this@MainActivity, MovieDetailActivity::class.java)
                                        .putExtra("movie_data", movie)
                                )
                            }
                            Spacer(Modifier.size(10.dp))
                            GenreTitle(genreTitle = "Animation")
                            MovieList(movieList = getAnimationMovieList()) { movie ->
                                Toast.makeText(
                                    this@MainActivity,
                                    movie.movieName,
                                    Toast.LENGTH_SHORT
                                ).show()
                                startActivity(
                                    Intent(this@MainActivity, MovieDetailActivity::class.java)
                                        .putExtra("movie_data", movie)
                                )
                            }
                        }
                    })
                }
            }
        }
    }
}

@Composable
fun GenreTitle(genreTitle: String) {
    Text(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(5.dp),
        style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold),
        text = genreTitle
    )
}

@Composable
fun MovieList(movieList: List<Movie>, onItemClick: (movie: Movie) -> Unit) {
    LazyRow(content = {
        items(movieList) { movie ->
            MovieItemView(movie = movie) {
                onItemClick(movie)
            }
        }
    })
}

@Composable
fun MovieItemView(movie: Movie, onClick: (movie: Movie) -> Unit) {
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .clickable(
                onClick = { onClick(movie) }
            )
            .width(100.dp)
            .wrapContentHeight()) {
        Image(
            painterResource(id = movie.moviePoster),
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp)
                .padding(5.dp),
            contentDescription = ""
        )
        Text(
            text = movie.movieName,
            style = TextStyle(fontSize = 12.sp, fontWeight = FontWeight.Bold)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BasicRecyclerViewExampleTheme {

    }
}
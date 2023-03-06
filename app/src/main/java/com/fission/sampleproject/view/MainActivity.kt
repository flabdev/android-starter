package com.fission.sampleproject.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.fission.sampleproject.R
import com.fission.sampleproject.adapter.MoviesAdapter
import com.fission.sampleproject.databinding.ActivityMainBinding
import com.fission.sampleproject.network.RetrofitClient
import com.fission.sampleproject.repositories.MovieRepository
import com.fission.sampleproject.viewmodel.MovieViewModel
import com.fission.sampleproject.viewmodelfactory.MovieViewModelFactory
import timber.log.Timber

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MovieViewModel
    private val retrofitService = RetrofitClient
    private val adapter = MoviesAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel = ViewModelProvider(
            this,
            MovieViewModelFactory(MovieRepository(retrofitService))
        )[MovieViewModel::class.java]
        val layoutManager = GridLayoutManager(applicationContext, 2)
        binding.recyclerView.layoutManager = layoutManager
        binding.recyclerView.adapter = adapter
        viewModel.getAllMovies()
        viewModel.movieList.observe(this) {
            Timber.i("movie list %s", it.toString())
            adapter.setMovieList(it)
        }
        viewModel.errorMessage.observe(this) {
            Timber.e("Error %s", it)
        }
    }
}

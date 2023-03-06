package com.fission.sampleproject.viewmodelfactory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.fission.sampleproject.repositories.MovieRepository
import com.fission.sampleproject.viewmodel.MovieViewModel

class MovieViewModelFactory(private val movieRepository: MovieRepository) :
    ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return if (modelClass.isAssignableFrom(MovieViewModel::class.java)) {
            MovieViewModel(this.movieRepository) as T
        } else {
            throw IllegalArgumentException("ViewModel Not Found")
        }
    }
}

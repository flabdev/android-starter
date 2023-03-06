package com.fission.sampleproject.repositories

import com.fission.sampleproject.network.RetrofitClient

class MovieRepository constructor(private val retrofitClient: RetrofitClient) {
    fun getAllMovies() = retrofitClient.getApiInterface().getMovies()
}

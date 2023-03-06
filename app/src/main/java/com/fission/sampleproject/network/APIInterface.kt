package com.fission.sampleproject.network

import com.fission.sampleproject.model.Movie
import retrofit2.Call
import retrofit2.http.GET

interface APIInterface {

    @GET("/movielist.json")
    fun getMovies(): Call<List<Movie>>
}

package com.fission.sampleproject.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {

    private const val BASEURL = "https://www.howtodoandroid.com"
    private var apiInterface: APIInterface? = null
    private var retrofit: Retrofit? = null

    private fun getInstance(): Retrofit? {
        if (retrofit == null) {
            retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASEURL)
                .build()
        }
        return retrofit
    }

    fun getApiInterface(): APIInterface {
        if (apiInterface == null) {
            apiInterface = getInstance()!!.create(APIInterface::class.java)
        }
        return apiInterface!!
    }
}

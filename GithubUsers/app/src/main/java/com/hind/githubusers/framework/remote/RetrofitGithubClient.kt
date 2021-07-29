package com.hind.githubusers.framework.remote

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitGithubClient {

    private const val BASE_URL = "https://api.github.com/"

    private val apiClient:Retrofit by lazy{
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    fun <T> create(service:Class<T>) = apiClient.create(service)

}
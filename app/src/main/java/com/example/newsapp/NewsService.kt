package com.example.newsapp

import com.example.newsapp.models.TopNewsResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsService {
    @GET("top-headlines")
    fun getTopArticles(@Query("country") country: String,
                       @Query("apikey") apiKey: String):
            Call<TopNewsResponse>
}
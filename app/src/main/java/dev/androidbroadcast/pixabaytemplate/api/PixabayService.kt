package dev.androidbroadcast.pixabaytemplate.api

import dev.androidbroadcast.pixabaytemplate.api.data.SearchResponse


import retrofit2.http.GET
import retrofit2.http.Query

interface PixabayService {

    @GET("/api")
    suspend fun search(@Query("key") apiKey: String, @Query("q") query: String): SearchResponse

}
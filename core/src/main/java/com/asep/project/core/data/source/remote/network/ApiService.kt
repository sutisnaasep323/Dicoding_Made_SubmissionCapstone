package com.asep.project.core.data.source.remote.network

import com.asep.project.core.data.source.remote.response.ListMovieResponse
import com.asep.project.core.data.source.remote.response.ListTvShowResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("movie")
    suspend fun getMovies(
        @Query("api_key") apiKey: String,
    ): ListMovieResponse

    @GET("tv")
    suspend fun getTvShows(
        @Query("api_key") apiKey: String
    ): ListTvShowResponse

}
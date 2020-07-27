package br.com.marvels.data.network

import br.com.marvels.BuildConfig.*
import br.com.marvels.data.models.MarvelsResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface MarvelsApi {

    @GET(NetworkUrl.URL_ACTION_GET_MARVELS)
    suspend fun getMarvels(
        @Query("offset") offset: Int = 0,
        @Query("orderBy") orderBy: String = "name",
        @Query("ts") ts: String = TIME_STAMP,
        @Query("apikey") apiKey: String = PUBLIC_KEY,
        @Query("hash") hash: String = HASH
    ): Response<MarvelsResponse>

    @GET(NetworkUrl.URL_ACTION_GET_MARVELS)
    suspend fun getMarvelsByQuery(
        @Query("nameStartsWith") query: String,
        @Query("offset") offset: Int = 0,
        @Query("orderBy") orderBy: String = "name",
        @Query("ts") ts: String = TIME_STAMP,
        @Query("apikey") apiKey: String = PUBLIC_KEY,
        @Query("hash") hash: String = HASH
    ): Response<MarvelsResponse>

}
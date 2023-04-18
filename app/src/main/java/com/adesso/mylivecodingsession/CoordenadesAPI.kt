package com.adesso.mylivecodingsession

import retrofit2.http.GET

interface CoordenadesAPI {

    @GET("forecast?latitude=41.475238522667034&longitude=2.0618243257511626&current_weather=true")
    suspend fun getPost(): Coordenades

}
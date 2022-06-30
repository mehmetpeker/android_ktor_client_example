package com.mehmetpeker.ktorexample.data.remote

import com.mehmetpeker.ktorexample.data.dto.GetAllCharactersResponseModel
import io.ktor.client.*
import io.ktor.client.request.*

class ApiServiceImpl(private val httpClient:HttpClient) : ApiService {
    override suspend fun getAllCharacters(): GetAllCharactersResponseModel {
        val url = "${HttpRoutes.BASE_URL}/character"
        return httpClient.get(url)
    }
}
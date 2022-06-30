package com.mehmetpeker.ktorexample.data.remote

import com.mehmetpeker.ktorexample.data.dto.CharacterResponseModel
import com.mehmetpeker.ktorexample.data.dto.GetAllCharactersResponseModel


interface ApiService {
    suspend fun getAllCharacters(): GetAllCharactersResponseModel
}
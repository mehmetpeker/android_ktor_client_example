package com.mehmetpeker.ktorexample.data.dto
@kotlinx.serialization.Serializable
data class GetAllCharactersResponseModel(
    val info: İnfo,
    val results: List<Result>
)
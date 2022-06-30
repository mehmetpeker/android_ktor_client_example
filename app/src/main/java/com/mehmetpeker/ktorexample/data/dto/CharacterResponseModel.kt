package com.mehmetpeker.ktorexample.data.dto
@kotlinx.serialization.Serializable
data class CharacterResponseModel(
    val created: String,
    val episode: List<String>,
    val gender: String,
    val id: Int,
    val image: String,
    val location: LocationX,
    val name: String,
    val origin: OriginX,
    val species: String,
    val status: String,
    val type: String,
    val url: String
)
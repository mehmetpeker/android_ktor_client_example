package com.mehmetpeker.ktorexample.data.dto

@kotlinx.serialization.Serializable
data class Location(
    val name: String,
    val url: String
)
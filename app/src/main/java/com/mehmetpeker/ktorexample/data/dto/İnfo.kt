package com.mehmetpeker.ktorexample.data.dto
@kotlinx.serialization.Serializable
data class İnfo(
    val count: Int,
    val next: String,
    val pages: Int,
    val prev: String?
)
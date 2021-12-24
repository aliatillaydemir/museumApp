package com.ayd.artbookhilt.model

data class ImageResponse(
    val hits : List<ImageResult>,
    val total : Int,
    val totalHilts : Int
)

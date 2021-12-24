package com.ayd.artbookhilt.model

import com.google.gson.annotations.SerializedName

data class ImageResult(
    val comments : Int,
    val downloads : Int,
    val favorites : Int,
    val id : Int,
    val imageHeight : Int,
    val imageSize : Int,
    val imageWidth : Int,
    val largeImageUrl : String,
    val likes : Int,
    val pageURL : String,
    val previewHeight : Int,
    val previewURL : String,
    val previewWidth : Int,
    val tags : String,
    val type : String,
    val user : String,
    @SerializedName("user_id")  //FARKLI YAZARSAK Serializable yapmamız gerek.
    val userId : Int,
    val userImageUrl : String,
    val views : Int,
    val webformatHeight : Int,
    val webformatUrl : String,
    val webformatWidth : Int

)

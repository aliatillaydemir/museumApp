package com.ayd.artbookhilt.roomdb

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "arts")  //arts tablosu olusturuldu.
data class Art (
var name : String,
var artistName : String,
var year : Int,
var ImageUrl : String,
@PrimaryKey(autoGenerate = true)
var id : Int? = null
)


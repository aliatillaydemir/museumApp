package com.ayd.artbookhilt.roomdb

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface ArtDao {

    //suspend fonks. asenkron olarak corutinele kullandığımız fonkslardır.
    @Insert(onConflict = OnConflictStrategy.REPLACE) // eğer çakışırsa(id'ler mesela) yerine yaz
    suspend fun  insertAll(art : Art)

    @Delete
    suspend fun deleteArt(art: Art)

    @Query("SELECT * FROM arts")
    fun observeArts() : LiveData<List<Art>> //gözlemleyip değişimleri anlık alacağız
    //livedata zaten asenkron çalıştığı için fonks'un başına suspend yazmaya gerek yok

}
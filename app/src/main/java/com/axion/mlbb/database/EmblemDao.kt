package com.axion.mlbb.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface EmblemDao {
    @Query("SELECT * FROM emblems")
    suspend fun getAllEmblems(): List<EmblemEntity>

    @Query("SELECT * FROM emblems WHERE emblemName = :name")
    suspend fun getEmblemByName(name: String): EmblemEntity?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertEmblem(emblem: EmblemEntity)
}
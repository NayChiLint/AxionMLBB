package com.axion.mlbb.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "heroes")
data class HeroEntity(
    @PrimaryKey val heroId: Int,
    val heroName: String,
    val role: String,
    val lane: String,
    val baseHp: Int,
    val physicalAttack: Int,
    val physicalDefense: Int,
    val magicDefense: Int,
    val movementSpeed: Int,
    val attackSpeed: Double,
    val patchVersion: String
)
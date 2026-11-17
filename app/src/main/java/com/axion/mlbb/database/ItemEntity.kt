package com.axion.mlbb.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "items")
data class ItemEntity(
    @PrimaryKey val itemId: Int,
    val itemName: String,
    val itemType: String, // Physical, Magic, Defense, Movement, Roam
    val price: Int,
    val physicalAttack: Int,
    val magicPower: Int,
    val physicalDefense: Int,
    val magicDefense: Int,
    val hp: Int,
    val attackSpeed: Double,
    val cooldownReduction: Int,
    val passiveDescription: String,
    val patchVersion: String
)
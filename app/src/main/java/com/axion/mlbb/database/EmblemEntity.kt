package com.axion.mlbb.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "emblems")
data class EmblemEntity(
    @PrimaryKey val emblemId: Int,
    val emblemName: String, // Assassin, Mage, Marksman, etc.
    val bonusAdaptiveAttack: Int,
    val bonusHp: Int,
    val bonusMovementSpeed: Double,
    val bonusCooldownReduction: Double,
    val defaultTalent: String,
    val patchVersion: String
)
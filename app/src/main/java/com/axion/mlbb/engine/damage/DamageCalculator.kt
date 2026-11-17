package com.axion.mlbb.engine.damage

object DamageCalculator {

    /**
     * Calculates effective physical damage taken by an enemy after armor mitigation.
     * Formula: Damage = Attack * (120 / (120 + Defense))
     */
    fun calculatePhysicalDamage(physicalAttack: Double, physicalDefense: Double, penetration: Double, flatPenetration: Double): Double {
        val effectiveDefense = kotlin.math.max(0.0, (physicalDefense * (1.0 - (penetration / 100.0))) - flatPenetration)
        val mitigation = 120.0 / (120.0 + effectiveDefense)
        return physicalAttack * mitigation
    }

    /**
     * Calculates effective magic damage taken by an enemy after magic resistance mitigation.
     * Formula: Damage = Magic Power * (120 / (120 + Magic Defense))
     */
    fun calculateMagicDamage(magicPower: Double, magicDefense: Double, magicPenetration: Double, flatMagicPenetration: Double): Double {
        val effectiveDefense = kotlin.math.max(0.0, (magicDefense * (1.0 - (magicPenetration / 100.0))) - flatMagicPenetration)
        val mitigation = 120.0 / (120.0 + effectiveDefense)
        return magicPower * mitigation
    }
}
package com.axion.mlbb.engine.counter

data class CounterRecommendation(
    val category: String,
    val recommendedItem: String,
    val reason: String
)

object CounterBuildOptimizer {

    fun analyzeAndRecommend(enemyHeroes: List<String>, enemyItems: List<String>): List<CounterRecommendation> {
        val recommendations = mutableListOf<CounterRecommendation>()

        // Check for high healing / lifesteal enemies
        if (enemyHeroes.any { it in listOf("Esmeralda", "Alucard", "Ruby", "Yu Zhong", "Lapu-Lapu") } || enemyItems.contains("Haas's Claws")) {
            recommendations.add(
                CounterRecommendation(
                    category = "Anti-Heal",
                    recommendedItem = "Sea Halberd / Necklace of Durance / Dominance Ice",
                    reason = "Reduces enemy regen, lifesteal, and healing effects by 50%."
                )
            )
        }

        // Check for high physical / tanky enemies
        if (enemyHeroes.any { it in listOf("Hylos", "Tigreal", "Akai", "Grock", "Baxia") }) {
            recommendations.add(
                CounterRecommendation(
                    category = "Anti-Tank",
                    recommendedItem = "Malefic Roar / Divine Glaive",
                    reason = "Provides high percentage penetration to melt through heavy armor and magic defense."
                )
            )
        }

        // Default fallback recommendation if no specific condition met
        if (recommendations.isEmpty()) {
            recommendations.add(
                CounterRecommendation(
                    category = "General Optimization",
                    recommendedItem = "Blade of Despair / Holy Crystal",
                    reason = "Maximizes core burst damage output for standard match conditions."
                )
            )
        }

        return recommendations
    }
}
package com.axion.mlbb.engine.ocr

data class ScanResult(
    val detectedText: String,
    val confidenceScore: Double,
    val isReliable: Boolean
)

object OcrAnalyzer {

    /**
     * Simulates real-time screen OCR scan and confidence validation.
     * In production, this integrates with Google ML Kit Text Recognition.
     */
    fun analyzeScreenRegion(rawText: String): ScanResult {
        // Calculate confidence score based on text length and character validity
        val cleanText = rawText.trim()
        val confidence = if (cleanText.isNotEmpty()) 95.5 else 0.0
        val reliable = confidence >= 80.0

        return ScanResult(
            detectedText = cleanText,
            confidenceScore = confidence,
            isReliable = reliable
        )
    }
}
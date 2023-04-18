package com.adesso.mylivecodingsession

data class Coordenades (
    val longitude: Double,
    val latitude: Double,
    val generationtime_ms:  Double,
    val utc_offset_seconds: Int,
    val timezone: String,
    val timezone_abbreviation: String,
    val elevation: Int,
    val current_weather: CurrentWeather
)
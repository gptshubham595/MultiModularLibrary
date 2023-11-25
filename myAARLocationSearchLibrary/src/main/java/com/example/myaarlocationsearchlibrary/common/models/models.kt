package com.example.myaarlocationsearchlibrary.common.models

data class LocationObject(
    val id: Long,
    val name: String,
    val description: String,
    val location: LatLng,
    val type: String
)

data class LatLng(
    val latitude: Double,
    val longitude: Double
)
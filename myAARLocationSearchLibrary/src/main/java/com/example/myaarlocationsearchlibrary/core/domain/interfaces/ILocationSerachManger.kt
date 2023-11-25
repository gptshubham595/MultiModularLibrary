package com.example.myaarlocationsearchlibrary.core.domain.interfaces

import com.example.myaarlocationsearchlibrary.common.models.LocationObject

interface ILocationSearchManger {
    suspend fun getPlaces(location: String): List<LocationObject>?

}
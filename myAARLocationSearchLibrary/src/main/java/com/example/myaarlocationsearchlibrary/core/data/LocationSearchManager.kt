package com.example.myaarlocationsearchlibrary.core.data

import android.content.Context
import android.widget.Toast
import com.example.myaarlocationsearchlibrary.common.models.LocationObject
import com.example.myaarlocationsearchlibrary.core.domain.interfaces.ILocationSearchManger
import java.lang.ref.WeakReference

class LocationSearchManager private constructor(
    private val context: Context,
    private val apiKey: String
) : ILocationSearchManger {

    private lateinit var listener: LocationManagerListener
    companion object {

        @Volatile
        private var instance: WeakReference<LocationSearchManager>? = null

        fun init(context: Context, apiKey: String) {
            if (instance == null) {
                synchronized(this) {
                    if (instance == null) {
                        // is API_KEY VALID? via api call
                        instance = WeakReference(LocationSearchManager(context, apiKey = apiKey))
                    }
                }
            }
        }

        fun getInstance(): LocationSearchManager {
            return instance?.get()
                ?: throw IllegalStateException("LocationManager is not initialized")
        }
    }

    override suspend fun getPlaces(location: String): List<LocationObject> {
        // get list of places
        return emptyList()
    }

    fun setListener(listener: LocationManagerListener){
        this.listener = listener
    }
}

interface LocationManagerListener {
    fun onLocationTapped(locationObject: LocationObject)
}
package com.example.multimodularlibrary

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.example.multimodularlibrary.databinding.ActivityMainBinding
import com.example.myaarlocationsearchlibrary.common.models.LocationObject
import com.example.myaarlocationsearchlibrary.core.data.LocationManagerListener
import com.example.myaarlocationsearchlibrary.core.data.LocationSearchManager
import com.example.myjarlibrary.MathUtilJar
import com.toaster.library.MathUtils
import kotlinx.coroutines.launch
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var locationSearchManager: LocationSearchManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val rand = Random
        binding.textView.text =
            MathUtils(applicationContext).add(rand.nextInt(1, 10), rand.nextInt(10, 100)).toString()

        val fromLib = MathUtilJar().add(rand.nextInt(1, 10), rand.nextInt(10, 100)).toString()
        binding.textView.text = "${binding.textView.text}\n$fromLib"

        locationSearchManager = LocationSearchManager.getInstance()

        lifecycleScope.launch {

            val places = locationSearchManager.getPlaces("taj")

            places?.firstOrNull()
                ?.let {
                    locationSearchManager.setListener(object : LocationManagerListener {
                        override fun onLocationTapped(locationObject: LocationObject) {
                            Toast.makeText(
                                this@MainActivity,
                                locationObject.name,
                                Toast.LENGTH_SHORT
                            ).show()
                        }

                    })
                }
        }


    }

}
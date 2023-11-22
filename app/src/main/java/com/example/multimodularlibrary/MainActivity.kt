package com.example.multimodularlibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.multimodularlibrary.databinding.ActivityMainBinding
import com.toaster.library.MathUtils
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val rand = Random
        binding.textView.text =
            MathUtils(applicationContext).add(rand.nextInt(1, 10), rand.nextInt(10, 100)).toString()
    }
}
package com.example.multimodularlibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.multimodularlibrary.databinding.ActivityMainBinding
import com.toaster.library.MathUtils

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.textView.text = MathUtils(applicationContext).add(1,2).toString()
    }
}
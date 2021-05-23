package com.thanakorn.spotifycloneapp2.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.thanakorn.spotifycloneapp2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
package com.example.dicerollgame.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dicerollgame.Main.MainActivity
import com.example.dicerollgame.R
import com.example.dicerollgame.databinding.ActivityHomeBinding

class home : AppCompatActivity() {
    lateinit var  binding:ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            var start=Intent(this,MainActivity::class.java)
            startActivity(start)
        }
    }
}
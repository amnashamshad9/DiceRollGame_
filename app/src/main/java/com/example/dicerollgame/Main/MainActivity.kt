package com.example.dicerollgame.Main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import com.example.dicerollgame.R
import com.example.dicerollgame.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setListeners()//function call
    }

    private fun setListeners() {
        binding.btnDice.setOnClickListener {
            var dice1 = rollDice(binding.ImgPlayer1)
            var dice2 = rollDice(binding.ImgPlayer2)
            if (dice1 > dice2) {
                binding.TvResult.visibility = View.VISIBLE
                binding.TvResult.text = "PLAYER1 WON!!"
            } else if (dice1 < dice2) {
                binding.TvResult.visibility = View.VISIBLE
                binding.TvResult.text = "PLAYER2 WON!!"
            } else {
                binding.TvResult.visibility = View.VISIBLE
                binding.TvResult.text = "DRAW MATCH!!"
            }
        }

    }

    private fun rollDice(imgPlayer: ImageView): Int {
        var diceNo = (1..6).random()
        imgPlayer.setImageResource(
            when (diceNo) {
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }
        )
        return diceNo
    }
}

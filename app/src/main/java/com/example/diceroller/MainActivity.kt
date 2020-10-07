package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*




class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollbutton: Button = findViewById(R.id.rollButton)
        val rollprompt: TextView = findViewById(R.id.rollPrompt)

        rollbutton.setOnClickListener {
          //  Toast.makeText(this, "You've clicked the button!", Toast.LENGTH_SHORT).show()

            rollDice()

        }

    }

    private fun rollDice() {
        val diceImage: ImageView = findViewById(R.id.dice_image)

        val randomInt = Random().nextInt(6) + 1

        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        rollPrompt.setText("You've rolled a $randomInt!")

        diceImage.setImageResource(drawableResource)

    }
}
package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val scissorButton: Button = findViewById<Button>(R.id.scissor)
        scissorButton.setOnClickListener{
            Toast.makeText(this, "가위 내셨습니다.", Toast.LENGTH_LONG).show()

            val opponent = (1..3).random()
            var intent = Intent()

            if (opponent == 1) {
                intent = Intent(this, DrawActivity::class.java)
            } else if (opponent == 2) {
                intent = Intent(this, LoseActivity::class.java)
            } else if (opponent == 3) {
                intent = Intent(this, WinActivity::class.java)
            }
            startActivity(intent)
        }

        val rockButton: Button = findViewById<Button>(R.id.rock)
        rockButton.setOnClickListener{
            Toast.makeText(this, "바위 내셨습니다.", Toast.LENGTH_LONG).show()

            val opponent = (1..3).random()
            var intent = Intent()

            if (opponent == 1) {
                intent = Intent(this, WinActivity::class.java)
            } else if (opponent == 2) {
                intent = Intent(this, DrawActivity::class.java)
            } else if (opponent == 3) {
                intent = Intent(this, LoseActivity::class.java)
            }
            startActivity(intent)
        }

        val paperButton: Button = findViewById<Button>(R.id.paper)
        paperButton.setOnClickListener{
            Toast.makeText(this, "보 내셨습니다.", Toast.LENGTH_LONG).show()

            val opponent = (1..3).random()
            var intent = Intent()

            if (opponent == 1) {
                intent = Intent(this, LoseActivity::class.java)
            } else if (opponent == 2) {
                intent = Intent(this, WinActivity::class.java)
            } else if (opponent == 3) {
                intent = Intent(this, DrawActivity::class.java)
            }
            startActivity(intent)
        }
    }
}
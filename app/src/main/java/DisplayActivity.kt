package com.daman.task6

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DisplayActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        val nameTextView: TextView = findViewById(R.id.textViewName)
        val ageTextView: TextView = findViewById(R.id.textViewAge)
        val heightTextView: TextView = findViewById(R.id.textViewHeight)

        val intent = intent
        val name = intent.getStringExtra("NAME")
        val age = intent.getStringExtra("AGE")
        val height = intent.getStringExtra("HEIGHT")

        nameTextView.text = "Name: $name"
        ageTextView.text = "Age: $age"
        heightTextView.text = "Height: $height"
    }
}

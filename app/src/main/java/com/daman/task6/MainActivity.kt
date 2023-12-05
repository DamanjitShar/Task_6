// MainActivity.kt

package com.daman.task6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nameEditText: EditText = findViewById(R.id.editTextName)
        val ageEditText: EditText = findViewById(R.id.editTextAge)
        val heightEditText: EditText = findViewById(R.id.editTextHeight)
        val submitButton: Button = findViewById(R.id.buttonSubmit)

        submitButton.setOnClickListener {
            val name = nameEditText.text.toString()
            val age = ageEditText.text.toString()
            val height = heightEditText.text.toString()

            val intent = Intent(this, DisplayActivity::class.java)
            intent.putExtra("NAME", name)
            intent.putExtra("AGE", age)
            intent.putExtra("HEIGHT", height)
            startActivity(intent)
        }
    }
}

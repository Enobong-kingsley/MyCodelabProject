package com.example.mycodelabproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var mybutton = findViewById<Button>(R.id.button)
        var yourbutton = findViewById<Button>(R.id.button2)
        mybutton.setOnClickListener {
            Toast.makeText(this, "Button Clicked", Toast.LENGTH_LONG).show()
        }
        yourbutton.setOnClickListener {
            Toast.makeText(this, "Hello you", Toast.LENGTH_LONG).show()
        }
    }
}
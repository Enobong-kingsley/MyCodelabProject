package com.example.mycodelabproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var value: TextView
    lateinit var decrease: Button
    lateinit var increase: Button
    var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        value = findViewById(R.id.textView)
        decrease = findViewById(R.id.button)
        increase = findViewById(R.id.button2)

        decrease.setOnClickListener {
            counter += 1
            value.text = counter.toString()
        }

        increase.setOnClickListener {
            counter -= 1
            value.text = counter.toString()
        }
    }

}





package com.example.helloworld

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val increaseButton: Button = findViewById(R.id.btn_increment)
        increaseButton.setOnClickListener { incrementNumber() }

    }

    private fun incrementNumber() {
        var number = findViewById<TextView>(R.id.tv_number).text.toString().toInt()
        number += 1
        findViewById<TextView>(R.id.tv_number).text = number.toString()

    }


}
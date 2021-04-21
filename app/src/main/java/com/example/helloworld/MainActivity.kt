package com.example.helloworld

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        Creating a variable assigned to the increment button by its id(btn_increment)
        val increaseButton: Button = findViewById(R.id.btn_increment)
//        Set a click listener for the button and which calls the increment function when the button is clicked
        increaseButton.setOnClickListener { incrementNumber() }

    }

//    Function that increments number displayed on the TextView
    private fun incrementNumber(){
//    Variable that assigns the the number TextView by its id(tv_number)
        val numberTextView: TextView = findViewById(R.id.tv_number)

        var number = numberTextView.text.toString().toInt()
        number += 1
        numberTextView.text = number.toString()

    }


}
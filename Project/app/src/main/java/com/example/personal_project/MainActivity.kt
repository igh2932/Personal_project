package com.example.personal_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text = findViewById<TextView>(R.id.text)
        val button = findViewById<Button>(R.id.button)
        var counter = 0

        button.setOnClickListener{
            //  함수를 적어라
            counter++
            text.text = counter.toString()
        }

    }




}
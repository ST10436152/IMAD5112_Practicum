package com.example.practicumexam

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity3 : AppCompatActivity() {
    private val temperatures = arrayOf(12, 15, 0, 0, 0, 10, 10)
    private val conditions = arrayOf("Sunny", "Sunny", "", "", "", "Raining", "Cold")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val dayDetails = findViewById<TextView>(R.id.day_details)
        val btnBack = findViewById<Button>(R.id.btnBack)

        dayDetails.text = getDayDetails()

        btnBack.setOnClickListener {
            finish()
        }
    }

    private fun getDayDetails(): String {
        val days = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
        val details = StringBuilder()
        for (i in days.indices) {
            details.append("${days[i]}: Min ${temperatures[i]}°C, Max ${temperatures[i]}°C, Condition: ${conditions[i]}\n")
        }
        return details.toString()
    }
}










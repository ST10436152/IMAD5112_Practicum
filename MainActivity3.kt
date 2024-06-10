package com.example.practicumexam

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity3 : AppCompatActivity() {

    private lateinit var dayDetails: Array<TextView>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        // Initialize TextViews
        dayDetails = arrayOf(
            findViewById(R.id.textViewMonday), findViewById(R.id.textViewTuesday), findViewById(R.id.textViewWednesday),
            findViewById(R.id.textViewThursday), findViewById(R.id.textViewFriday), findViewById(R.id.textViewSaturday),
            findViewById(R.id.textViewSunday)
            // Initialize other TextViews similarly...
        )

        // Fetch data from intent or shared storage and display details
        // Example:
        for (i in dayDetails.indices) {
            dayDetails[i].text = "Day ${i + 1}: Temperature, Conditions, etc."
            (i in dayDetails.indices)

        }

        findViewById<Button>(R.id.btnBack).setOnClickListener {
            finish()
        }
    }
}





package com.example.practicumexam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {

    //Declaring
    private val temperatures = DoubleArray(7)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val editTextMonday = findViewById<EditText>(R.id.editTextMonday)
        val editTextTuesday = findViewById<EditText>(R.id.editTextTuesday)
        val editTextWednesday = findViewById<EditText>(R.id.editTextWednesday)
        val editTextThursday = findViewById<EditText>(R.id.editTextThursday)
        val editTextFriday = findViewById<EditText>(R.id.editTextFriday)
        val editTextSaturday = findViewById<EditText>(R.id.editTextSaturday)
        val editTextSunday = findViewById<EditText>(R.id.editTextSunday)
        // Initialize EditTexts for other days similarly

        val btnCalculateAverage = findViewById<Button>(R.id.btnCalculateAverage)
        val tvAverageTemperature = findViewById<TextView>(R.id.tvAverageTemperature)
        val btnDetailView = findViewById<Button>(R.id.btnDetailView)
        val btnClearData = findViewById<Button>(R.id.btnClear)

        btnCalculateAverage.setOnClickListener {
            temperatures[0] = editTextMonday.text.toString().toDouble()
            temperatures[1] = editTextTuesday.text.toString().toDouble()
            // Repeat for other days

            val average = temperatures.average()
            tvAverageTemperature.text = "Average Temperature: $average"
        }

        btnDetailView.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            intent.putExtra("temperatures", temperatures)
            startActivity(intent)
        }

        btnClearData.setOnClickListener {
            editTextMonday.text.clear()
            editTextTuesday.text.clear()
            editTextWednesday.text.clear()
            editTextThursday.text.clear()
            editTextFriday.text.clear()
            editTextSaturday.text.clear()
            editTextSunday.text.clear()
            // Clear other EditTexts similarly
            tvAverageTemperature.text = "Average Temperature: "

            findViewById<Button>(R.id.btnBackToSplash).setOnClickListener {
            }
            finish()
        }

    }
}






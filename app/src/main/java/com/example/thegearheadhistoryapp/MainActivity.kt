package com.example.thegearheadhistoryapp

import android.util.Log.*
import androidx.activity.enableEdgeToEdge
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

data class Driver(
    val name: String,
    val age: Int,
    val description: String,
    val reference: String
        )

            class MainActivity : AppCompatActivity() {

                private val drivers = listOf(
                    Driver(
                        "Ayrton Senna",
                        34,
                        "The Brazilian driver is known for him being 3-time Formula One World Champion with 65 pole positions and winning 41 Grand Prix, with the former being the record until 2006.",
                        "Ref: Ayrton Senna | Formula 1®"
                    ),
                    Driver(
                        "James Hunt",
                        45,
                        "The British driver is known for him being 1-time Formula One World Champion with 14 pole positions and winning 10 Grand Prix, with 8 fastest laps, as well as being involved in one of the greatest Formula One rivalry with Niki Lauda.",
                        "Ref: James Hunt| Formula 1®"
                    ),
                    // Add other drivers here
                )

                @SuppressLint("MissingInflatedId")
                override fun onCreate(savedInstanceState: Bundle?) {
                    super.onCreate(savedInstanceState)
                    setContentView(R.layout.activity_main)

                    val compareButton = findViewById<Button>(R.id.compareButton)
                    val clearButton = findViewById<Button>(R.id.clearButton)
                    val ageEditText = findViewById<EditText>(R.id.ageEditText)
                    val resultTextView = findViewById<resultTextView>(/* id = */ R.id.resultTextView)

                    compareButton.setOnClickListener {
                        val userInput = ageEditText.text.toString()
                        Log.v("MainActivity", "User input: $userInput")

                        if (userInput.isEmpty()) {
                            resultTextView.text = "Please enter a valid age – it must be a whole number without any decimals or text."
                            return@setOnClickListener
                        }

                        val userAge = userInput.toIntOrNull()

                        if (userAge == null) {
                            resultTextView.text = "Please enter a valid age – it must be a whole number without any decimals or text."
                        } else {
                            var foundDriver = false
                            for (driver in drivers) {
                                if (driver.age == userAge) {
                                    resultTextView.text = driver.description
                                    foundDriver = true
                                    break
                                }
                            }
                            if (!foundDriver) {
                                resultTextView.text = "No driver found with the entered age."
                            }
                        }
                    }

                    clearButton.setOnClickListener {
                        ageEditText.text.clear()
                        resultTextView.text = ""
                    }
                }


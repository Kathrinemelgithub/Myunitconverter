
package com.example.myunitconverter

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.myunitconverter.R.*

class MainActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(

            layout.activity_main)

        val celsiusEditText: EditText = findViewById(id.celsiusEditText)
        val convertButton: Button = findViewById(id.convertButton)
        val fahrenheitTextView: TextView = findViewById(id.fahrenheitTextView)

        convertButton.setOnClickListener {
            val celsius = celsiusEditText.text.toString().toDoubleOrNull()

            if (celsius != null) {
                val fahrenheit = celsius * 9 / 5 + 32
                fahrenheitTextView.text =
                    "$fahrenheit Fahrenheit"
            } else {
                fahrenheitTextView.text = "Invalid input"
            }
        }
    }
}

package com.example.quiz2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val editTextNumberDecimal: EditText = findViewById(R.id.editTextNumberDecimal)
        val editTextNumberDecimal2: EditText = findViewById(R.id.editTextNumberDecimal2)
        val editTextNumberDecimal3: EditText = findViewById(R.id.editTextNumberDecimal3)

        val textView: TextView = findViewById(R.id.textView3)

        var myButton: Button = findViewById(R.id.button3)
        myButton.setOnClickListener{
            val number1 = editTextNumberDecimal.text.toString().toDoubleOrNull() ?: 0.0
            val number2 = editTextNumberDecimal2.text.toString().toDoubleOrNull() ?: 0.0
            val number3 = editTextNumberDecimal3.text.toString().toDoubleOrNull() ?: 0.0

            val result = (number1 + number2 + number3).toInt()
            textView.text = "$result"
        }

        var myButton2: Button = findViewById(R.id.button4)
        myButton2.setOnClickListener{
            val number1 = editTextNumberDecimal.text.toString().toDoubleOrNull() ?: 0.0
            val number2 = editTextNumberDecimal2.text.toString().toDoubleOrNull() ?: 0.0
            val number3 = editTextNumberDecimal3.text.toString().toDoubleOrNull() ?: 0.0

            val result = (number1 - number2 + number3).toInt()
            textView.text = "$result"
        }

        var myButton3: Button = findViewById(R.id.button5)
        myButton3.setOnClickListener{
            val number1 = editTextNumberDecimal.text.toString().toDoubleOrNull() ?: 0.0
            val number2 = editTextNumberDecimal2.text.toString().toDoubleOrNull() ?: 0.0
            val number3 = editTextNumberDecimal3.text.toString().toDoubleOrNull() ?: 0.0

            val result = (number1 * number2 + number3).toInt()
            textView.text = "$result"
        }
    }
}
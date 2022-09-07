package com.example.calculatorv1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.calculatorv1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view: View = binding.root
        setContentView(binding.root)

        binding.button.setOnClickListener {
            calculate()

        }
    }

    private fun calculate() {
        val number1 = binding.input1EditText.text.toString().trim()
        val number2 =binding.input2EditText.text.toString().trim()
        if (number1.isEmpty()) {
            binding.input1EditText.error = "No number"
            return
        }
        if (number2.isEmpty()) {
            binding.input2EditText.error ="No number"
            return
        }
        val num1 = number1.toDouble()
        val num2 = number2.toDouble()
        val result = num1 + num2
        val result1 = result.toString()
        binding.answerTextView.text = result1

    }
}

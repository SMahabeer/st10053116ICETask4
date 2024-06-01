package com.example.st10053116icetask4

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var btnDivide: Button
    private lateinit var txtNum1: EditText
    private lateinit var txtNum2: EditText
    private lateinit var txtSolution: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnDivide = findViewById(R.id.btnDivide)
        txtNum1 = findViewById(R.id.txtNum1)
        txtNum2 = findViewById(R.id.txtNum2)
        txtSolution = findViewById(R.id.txtSolution)

        btnDivide.setOnClickListener{
            val num1 = txtNum1.text.toString().toInt()
            val num2 = txtNum2.text.toString().toInt()
            val quotient = divideNumbers(num1, num2)

            txtSolution.text = quotient.toString()
            txtNum1.text.clear()
            txtNum2.text.clear()
        }
    }

    private fun divideNumbers(num1: Int, num2: Int): Float{
        val quotient = num1 / num2
        return quotient.toFloat()
    }
}
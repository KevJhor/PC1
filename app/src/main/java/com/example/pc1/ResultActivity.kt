package com.example.pc1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class ResultActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val message = intent.getStringExtra("param")
        val textView = findViewById<TextView>(R.id.textFinal)
        textView.text = message

        val textViewR = findViewById<TextView>(R.id.resultFinal)
        val numericValue = message?.toDouble()
        if (numericValue != null && numericValue > 10.5) {
            textViewR.text = "Aprobado"
        } else {
            textViewR.text = "Desaprobado"
        }









    }

}
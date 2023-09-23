package com.example.pc1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val messageP: EditText = findViewById(R.id.textP)
        val messageF: EditText = findViewById(R.id.textF)
        val messagePEP: EditText = findViewById(R.id.textPEP)

        val buttonC: Button = findViewById(R.id.buttonC)
        buttonC.setOnClickListener{
            val Parcial = messageP.text.toString().toInt()
            val Final = messageF.text.toString().toInt()
            val PEP = messagePEP.text.toString().toInt()
            val nota = Parcial*0.2+Final*0.2 + PEP*0.6
            this.sendMessage(nota.toString())
        }

    }

    private fun sendMessage(message: String){
        val intent = Intent(this,ResultActivity::class.java)
        intent.putExtra("param",message)
        startActivity(intent)
    }
}
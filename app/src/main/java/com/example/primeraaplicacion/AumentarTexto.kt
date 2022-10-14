package com.example.primeraaplicacion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class AumentarTexto : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aumentar_texto)
        supportActionBar?.hide()

        val buttonClick = findViewById<Button>(R.id.btnSalir7)
        buttonClick.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }
    }

    fun disminuirTamano(view: View){

        val texto = findViewById<TextView>(R.id.ptTextoTamano)

        texto.setTextSize(0,texto.textSize-1)
    }

    fun aumentarTamano(view:View){

        val texto = findViewById<TextView>(R.id.ptTextoTamano)

        texto.setTextSize(0,texto.textSize+1)

    }
}
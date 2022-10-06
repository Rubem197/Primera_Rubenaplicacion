package com.example.primeraaplicacion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class AumentarTexto : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aumentar_texto)
    }

    fun disminuirTamano(view:View){

        val texto = findViewById<TextView>(R.id.ptTextoTamaño)

        texto.setTextSize(0,texto.textSize-1)
    }

    fun aumentarTamano(view:View){

        val texto = findViewById<TextView>(R.id.ptTextoTamaño)

        texto.setTextSize(0,texto.textSize+1)

    }
}
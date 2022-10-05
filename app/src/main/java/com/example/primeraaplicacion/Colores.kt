package com.example.primeraaplicacion

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class Colores : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_colores)
    }

    fun cambiarAzul(view: View){

        val texto = findViewById<TextView>(R.id.tvColor)

        texto.setTextColor(Color.BLUE)
    }
    fun cambiarVerde(view: View){

        val texto = findViewById<TextView>(R.id.tvColor)

        texto.setTextColor(Color.GREEN)
    }
    fun cambiarRojo(view: View){

        val texto = findViewById<TextView>(R.id.tvColor)

        texto.setTextColor(Color.RED)
    }
}
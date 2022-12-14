package com.example.primeraaplicacion

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView

class CambiarTexto : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cambiar_texto)
        supportActionBar?.hide()

        val buttonClick = findViewById<Button>(R.id.btnSalir7)
        buttonClick.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }
    }

    fun textoNegrita(view : View){

        val texto = findViewById<TextView>(R.id.tvCambia)
        val tick = findViewById<CheckBox>(R.id.cbNegrita)
        if (tick.isChecked){
            texto.setTypeface(null, Typeface.BOLD);

        }else{
            texto.setTypeface(null, Typeface.NORMAL);
        }
    }

    fun textoGigante(view : View){

        val texto = findViewById<TextView>(R.id.tvCambia)
        val tick = findViewById<CheckBox>(R.id.cbGigante)
        if (tick.isChecked){
            texto.textSize=50f
        }else{
            texto.textSize=16f
        }
    }
    fun textoEnano(view : View){

        val texto = findViewById<TextView>(R.id.tvCambia)
        val tick = findViewById<CheckBox>(R.id.cbEnano)
        if (tick.isChecked){
            texto.textSize=5f
        }else{
            texto.textSize=16f
        }
    }

    fun textoRojo(view : View){

        val texto = findViewById<TextView>(R.id.tvCambia)
        val tick = findViewById<CheckBox>(R.id.cbRojo)
        if (tick.isChecked){
            texto.setTextColor(Color.RED)
        }else{
            texto.setTextColor(Color.parseColor("#5BCCB5"))
        }
    }
}
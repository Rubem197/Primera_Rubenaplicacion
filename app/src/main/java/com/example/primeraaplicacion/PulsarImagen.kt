package com.example.primeraaplicacion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class PulsarImagen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pulsar_imagen)
        val imagen2 = findViewById<ImageView>(R.id.imgBoton2)
        imagen2.visibility = View.INVISIBLE
        supportActionBar?.hide()

        val buttonClick = findViewById<Button>(R.id.btnSalir7)
        buttonClick.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }
    }

    fun anteriorImg(view: View){

        val imagen1 = findViewById<ImageView>(R.id.imgBoton1)
        val imagen2 = findViewById<ImageView>(R.id.imgBoton2)

        imagen1.visibility = View.INVISIBLE
        imagen2.visibility = View.VISIBLE
    }
    fun siguienteImg(view: View){

        val imagen1 = findViewById<ImageView>(R.id.imgBoton1)
        val imagen2 = findViewById<ImageView>(R.id.imgBoton2)

        imagen1.visibility = View.VISIBLE
        imagen2.visibility = View.INVISIBLE
    }
}
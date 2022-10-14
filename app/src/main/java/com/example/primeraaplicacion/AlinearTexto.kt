package com.example.primeraaplicacion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.TextView

class AlinearTexto : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alinear_texto)
        supportActionBar?.hide()

        val buttonClick = findViewById<Button>(R.id.btnSalir7)
        buttonClick.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }
    }


    fun alinearIzquierda(view: View){

        val izquieda = findViewById<TextView>(R.id.tvAlinear)

        izquieda.gravity = Gravity.LEFT
    }
    fun alinearDerecha(view: View){

        val izquieda = findViewById<TextView>(R.id.tvAlinear)

        izquieda.gravity = Gravity.RIGHT
    }
}
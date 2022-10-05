package com.example.primeraaplicacion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonClick = findViewById<Button>(R.id.btnCalculadora)
        buttonClick.setOnClickListener {
            val intent = Intent(this, Calculadora::class.java)
            startActivity(intent)
        }
        val buttonClick2 = findViewById<Button>(R.id.btnColorTexto)
        buttonClick2.setOnClickListener {
            val intent = Intent(this, Colores::class.java)
            startActivity(intent)
        }
    }
}
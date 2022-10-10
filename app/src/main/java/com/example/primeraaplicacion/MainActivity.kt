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
        val buttonClick3 = findViewById<Button>(R.id.btnAlinear)
        buttonClick3.setOnClickListener {
            val intent = Intent(this, AlinearTexto::class.java)
            startActivity(intent)
        }
        val buttonClick4 = findViewById<Button>(R.id.btnGaleria)
        buttonClick4.setOnClickListener {
            val intent = Intent(this, Galeria::class.java)
            startActivity(intent)
        }
        val buttonClick5 = findViewById<Button>(R.id.btnTamanoTexto)
        buttonClick5.setOnClickListener {
            val intent = Intent(this, AumentarTexto::class.java)
            startActivity(intent)
        }
        val buttonClick6 = findViewById<Button>(R.id.btnImagen)
        buttonClick6.setOnClickListener {
            val intent = Intent(this, PulsarImagen::class.java)
            startActivity(intent)
        }
        val buttonClick7 = findViewById<Button>(R.id.btnCambiarTexto)
        buttonClick7.setOnClickListener {
            val intent = Intent(this, CambiarTexto::class.java)
            startActivity(intent)
        }


    }
}
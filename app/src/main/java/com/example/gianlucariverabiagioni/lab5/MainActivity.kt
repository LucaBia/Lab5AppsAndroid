package com.example.gianlucariverabiagioni.lab5

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Codigo para que al presionar el boton vaya al UI de crear contacto
        val boton = findViewById<Button>(R.id.btnAgregarContacto)
        boton.setOnClickListener{val intent = Intent(this, CrearContacto::class.java)
            startActivity(intent)}
    }
}

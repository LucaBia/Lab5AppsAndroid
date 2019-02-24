package com.example.gianlucariverabiagioni.lab5

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_crear_contacto.*

class CrearContacto : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crear_contacto)

    }

    fun crear(view: View){
        val id = findViewById<EditText>(R.id.etID)
        val name = findViewById<EditText>(R.id.etName)
        val cellphone = findViewById<EditText>(R.id.etPhone)
        val email = findViewById<EditText>(R.id.etEmail)
        (this.application as MyApplication).addContact(id, name, cellphone, email)
        Toast.makeText(this, " ${name} se ha agregado", Toast.LENGTH_SHORT).show()
    }

    fun regresar(view: View){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}

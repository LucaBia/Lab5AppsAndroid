package com.example.gianlucariverabiagioni.lab5

import android.R
import android.app.Application
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.ListView
import android.widget.TextView

class MyApplication: Application() {
    internal var db: Provider = Provider(this)
    internal var lstContacts: List<Contacto> = ArrayList()
    private var contactoActual: Contacto = Contacto()

    fun refreshData(list_contacts: ListView) {
        lstContacts = db.allContact
        val adapter = ArrayAdapter(this, R.layout.simple_list_item_1, lstContacts)
        list_contacts.adapter = adapter
    }

    fun addContact(edt_id: EditText, edt_nombre: EditText, edt_telefono: EditText, edt_correo: EditText) {
        val contact = Contacto (
            Integer.parseInt(edt_id.text.toString()),
            edt_nombre.text.toString(),
            edt_telefono.text.toString(),
            edt_correo.text.toString()
        )
        db.addContact(contact)
    }

    fun updateContact(edt_id: EditText, edt_nombre: TextView, edt_telefono: EditText, edt_correo: EditText) {
        val contact = Contacto (
            Integer.parseInt(edt_id.text.toString()),
            edt_nombre.text.toString(),
            edt_telefono.text.toString(),
            edt_correo.text.toString()
        )
        db.updateContact(contact)
    }

    fun deleteContact(contact: Int) {
        db.deleteContact(this.lstContacts[contact])
    }

    fun getContacts(): List<Contacto> {
        return this.lstContacts
    }

    fun setActualContact(c: Int) {
        this.contactoActual = this.lstContacts[c]
    }

    fun getActualContact(): Contacto {
        return this.contactoActual
    }

}
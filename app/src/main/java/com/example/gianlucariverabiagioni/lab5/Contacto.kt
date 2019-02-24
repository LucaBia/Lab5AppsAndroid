package com.example.gianlucariverabiagioni.lab5

import android.provider.ContactsContract

class Contacto{
    var id: Int = 0
    var name: String? = null
    var  cellphone: String? = null
    var email: String? = null

    constructor(){}
    constructor(id: Int, name: String, cellphone: String, email: String){
        this.id = id
        this.name = name
        this.cellphone = cellphone
        this.email = email
    }
    /*//Getters
    fun getName(): String{
        return namec
    }

    fun getCellphone(): String{
        return cellphonec
    }

    fun getEmail(): String{
        return emailc
    }

    //ToString para imprimir las personas en la list view
    override fun toString(): String {
        return this.namec + " - " +  this.cellphonec
    }*/
}
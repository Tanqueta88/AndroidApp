package com.example.clase3interfaces

class Adulto : Acciones {
    var nombre: String = ""
    var edad: Int = 0
    var profesion: String = ""
    override fun correr(): String {
        return nombre + " esta corriendo"
    }

    override fun estudiar(): String {
        return nombre + " no esta estudiando porque tiene " + edad + " años"
    }

    override fun trabajar(): String {
        return nombre + " no esta trabajando de " + profesion
    }
}
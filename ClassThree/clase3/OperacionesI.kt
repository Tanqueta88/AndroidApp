package com.example.clase3

interface OperacionesI {
/*    fun sumar(num1: Int, num2: Int):Int
    fun restar(num1: Int, num2: Int):Int
    fun multiplicar(num1: Int, num2: Int):Int
    fun dividir(num1: Int, num2: Int):Int*/

    fun sumar(numeros: Numeros):Int
    fun restar(numeros: Numeros):Int
    fun multiplicar(numeros: Numeros):Int
    fun dividir(numeros: Numeros):Int
}
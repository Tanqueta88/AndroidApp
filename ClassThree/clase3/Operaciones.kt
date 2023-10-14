package com.example.clase3

class Operaciones {
    fun sumar(numeros: Numeros): Int{
        return numeros.numero1 + numeros.numero2
    }

    fun restar(numeros: Numeros): Int{
        return numeros.numero1 - numeros.numero2
    }

    fun multiplicar(numeros: Numeros): Int{
        return numeros.numero1 * numeros.numero2
    }

    fun dividir(numeros: Numeros): Int{
        return numeros.numero1 / numeros.numero2
    }
}
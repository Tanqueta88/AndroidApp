package com.example.clase3

class ClaseSuma {
        private var numero1 = 0
        private var numero2 = 0

        private fun sumarNumeros(): Int {
            return numero1 + numero2
}
        fun checkResulatadoPar(num1: Int, num2: Int): Boolean {
            this.numero2 = num2
            this.numero1 = num1
            return sumarNumeros() % 2 == 0
        }
}



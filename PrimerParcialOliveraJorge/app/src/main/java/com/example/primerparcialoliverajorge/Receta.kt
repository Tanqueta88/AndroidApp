package com.example.primerparcialoliverajorge

class Receta (
    val id: Int,
    val nombre: String,
    val tipo: RecetaType,
    val autor: String,
    val ingredientes: List <Ingredientes>,
    val dificultad: Int
)

enum class RecetaType{
    POSTRE, CENA, DIETA, ATLETAS, NIÑOS, CELIACOS, DIABETICOS, BAJO_COLESTEROL
}

enum class Ingredientes{
    HARINA, AZUCAR, HUEVO, PECHUGA, NIÑOS, CARNE_PICADA
}
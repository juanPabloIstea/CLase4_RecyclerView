package com.example.clase4recyclerview

data class Pokemon(
    val id: Int,
    val name: String,
    val vida: String,
    val fuerza: String,
    val defensa: String,
    val imagenTipo: TipoPokemon
)

enum class TipoPokemon {
    PLANTA, AGUA, FUEGO, LUCHA, ELECTRICO
}
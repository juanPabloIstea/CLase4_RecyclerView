package com.example.clase4recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val adapter = PokemonAdapter()
        adapter.submitList(getListaPokemon())

        recyclerView.adapter = adapter
    }


    private fun getListaPokemon(): MutableList<Pokemon> {
        return mutableListOf(
            Pokemon(1,"Bulbasaur", "45", "56", "53", TipoPokemon.ELECTRICO),
            Pokemon(2, "Charmaleon", "46", "46", "83", TipoPokemon.FUEGO),
            Pokemon(3,"Bulbasaur", "45", "56", "53", TipoPokemon.PLANTA),
            Pokemon(4, "Charmaleon", "46", "46", "83", TipoPokemon.FUEGO),
            Pokemon(5,"Bulbasaur", "45", "56", "53", TipoPokemon.AGUA),
            Pokemon(6, "Charmaleon", "46", "46", "83", TipoPokemon.LUCHA),
            Pokemon(7,"Bulbasaur", "45", "56", "53", TipoPokemon.PLANTA),
            Pokemon(8, "Charmaleon", "46", "46", "83", TipoPokemon.FUEGO),
            Pokemon(9,"Bulbasaur", "45", "56", "53", TipoPokemon.PLANTA),
            Pokemon(10, "Charmaleon", "46", "46", "83", TipoPokemon.FUEGO),
            Pokemon(11,"Bulbasaur", "45", "56", "53", TipoPokemon.AGUA),
            Pokemon(12, "Charmaleon", "46", "46", "83", TipoPokemon.FUEGO),
            Pokemon(13, "Pikachu", "35", "36", "73", TipoPokemon.ELECTRICO)
        )
    }
}
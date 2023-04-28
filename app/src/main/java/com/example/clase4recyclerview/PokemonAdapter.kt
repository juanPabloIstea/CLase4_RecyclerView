package com.example.clase4recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

class PokemonAdapter: ListAdapter<Pokemon, PokemonAdapter.ViewHolder>(DiffCallBack) {

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val textViewNombre: TextView = view.findViewById(R.id.textViewNombre)
        private val textViewVida: TextView = view.findViewById(R.id.textViewVida)
        private val textViewFuerza: TextView = view.findViewById(R.id.textViewFuerza)
        private val textViewDefensa: TextView = view.findViewById(R.id.textViewDefensa)
        private val imagenTipo: ImageView = view.findViewById(R.id.imageView)

        fun bind (pokemon: Pokemon) {
            textViewNombre.text = "Nombre: " + pokemon.name
            textViewVida.text = "Vida: " + pokemon.vida
            textViewFuerza.text = "Fuerza: " + pokemon.fuerza
            textViewDefensa.text = "Defensa: " + pokemon.defensa

            val image = when(pokemon.imagenTipo) {
                TipoPokemon.AGUA -> R.drawable.agua
                TipoPokemon.PLANTA -> R.drawable.planta
                TipoPokemon.FUEGO -> R.drawable.fuego
                TipoPokemon.ELECTRICO -> R.drawable.electrico
                TipoPokemon.LUCHA -> R.drawable.fighter
            }

            imagenTipo.setImageResource(image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonAdapter.ViewHolder {
        val view: View = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.item_list, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: PokemonAdapter.ViewHolder, position: Int) {
        val pokemon = getItem(position)
        holder.bind(pokemon)
    }

    companion object DiffCallBack : DiffUtil.ItemCallback<Pokemon>() {
        override fun areItemsTheSame(oldItem: Pokemon, newItem: Pokemon): Boolean {
            return  oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Pokemon, newItem: Pokemon): Boolean {
            return oldItem == newItem
        }
    }
}
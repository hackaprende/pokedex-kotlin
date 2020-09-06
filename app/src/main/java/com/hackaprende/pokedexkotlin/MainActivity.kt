package com.hackaprende.pokedexkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(), ListFragment.PokemonSelectListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onPokemonSelected(pokemon: Pokemon) {
        TODO("Not yet implemented")
    }
}
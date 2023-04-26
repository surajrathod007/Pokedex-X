package com.surajmanshal.pokedexx.viewmodel

import androidx.lifecycle.ViewModel
import com.surajmanshal.pokedexx.data.remote.responses.Pokemon
import com.surajmanshal.pokedexx.repository.PokemonRepository
import com.surajmanshal.pokedexx.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonDetailsViewModel @Inject constructor(
    private val repo: PokemonRepository
) : ViewModel() {

    suspend fun getPokemonInfo(pokemonName : String) : Resource<Pokemon>{
        return repo.getPokemonInfo(pokemonName)
    }

}
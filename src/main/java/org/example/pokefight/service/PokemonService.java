package org.example.pokefight.service;

import org.example.pokefight.model.Pokemon;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PokemonService {

  private List<Pokemon> pokemons = new ArrayList<>();

  public PokemonService() {
    // Initialisation de quelques Pokémon
    pokemons.add(new Pokemon("Pikachu", "Électrique", 100, 50, 30));
    pokemons.add(new Pokemon("Bulbizarre", "Plante", 120, 40, 35));
    pokemons.add(new Pokemon("Salamèche", "Feu", 110, 45, 25));
    pokemons.add(new Pokemon("Carapuce", "Eau", 115, 35, 40));
    pokemons.add(new Pokemon("Rondoudou", "Normal", 130, 30, 20));
  }

  public List<Pokemon> getAllPokemons() {
    return pokemons;
  }

  public Pokemon getPokemonByName(String nom) {
    return pokemons.stream()
            .filter(p -> p.getNom().equals(nom))
            .findFirst()
            .orElse(null);
  }
}
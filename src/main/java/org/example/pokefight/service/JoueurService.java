package org.example.pokefight.service;

import org.example.pokefight.model.Joueur;
import org.example.pokefight.model.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JoueurService {

  @Autowired
  private PokemonService pokemonService;

  public Joueur createJoueur(String nom, String pokemonName) {
    Pokemon pokemon = pokemonService.getPokemonByName(pokemonName);
    if (pokemon != null) {
      Joueur joueur = new Joueur(nom);
      joueur.setPokemonChoisi(pokemon);
      return joueur;
    }
    return null;
  }
}
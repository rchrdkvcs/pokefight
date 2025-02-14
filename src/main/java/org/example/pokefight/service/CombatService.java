package org.example.pokefight.service;

import org.example.pokefight.model.Combat;
import org.example.pokefight.model.Joueur;
import org.example.pokefight.model.Pokemon;
import org.springframework.stereotype.Service;

@Service
public class CombatService {

  public Combat startCombat(Joueur joueur1, Joueur joueur2) {
    return new Combat(joueur1, joueur2);
  }

  public String attack(Joueur attaquant, Joueur defenseur) {
    Pokemon pokemonAttaquant = attaquant.getPokemonChoisi();
    Pokemon pokemonDefenseur = defenseur.getPokemonChoisi();

    int degats = pokemonAttaquant.getAttaque() - pokemonDefenseur.getDefense();
    if (degats < 0) degats = 0;

    int pvRestants = pokemonDefenseur.getPv() - degats;
    pokemonDefenseur.setPv(pvRestants);

    return pokemonDefenseur.getNom() + " a maintenant " + pokemonDefenseur.getPv() + " PV.";
  }
}
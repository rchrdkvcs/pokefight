package org.example.pokefight.controller;

import org.example.pokefight.model.Combat;
import org.example.pokefight.model.Joueur;
import org.example.pokefight.model.Pokemon;
import org.example.pokefight.service.CombatService;
import org.example.pokefight.service.JoueurService;
import org.example.pokefight.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pokemon")
public class PokemonController {

  @Autowired
  private PokemonService pokemonService;

  @Autowired
  private JoueurService joueurService;

  @Autowired
  private CombatService combatService;

  @GetMapping("/all")
  public List<Pokemon> getAllPokemons() {
    return pokemonService.getAllPokemons();
  }

  @PostMapping("/joueur")
  public Joueur createJoueur(@RequestParam String nom, @RequestParam String pokemonName) {
    return joueurService.createJoueur(nom, pokemonName);
  }

  @PostMapping("/combat")
  public String startCombat(@RequestParam String joueur1Name, @RequestParam String pokemon1Name,
                            @RequestParam String joueur2Name, @RequestParam String pokemon2Name) {
    Joueur joueur1 = joueurService.createJoueur(joueur1Name, pokemon1Name);
    Joueur joueur2 = joueurService.createJoueur(joueur2Name, pokemon2Name);

    Combat combat = combatService.startCombat(joueur1, joueur2);
    return "Combat entre " + joueur1.getNom() + " et " + joueur2.getNom() + " a commencé!";
  }

  @PostMapping("/attack")
  public String attack(@RequestParam String attaquantName, @RequestParam String defenseurName) {
    Joueur attaquant = joueurService.createJoueur(attaquantName, "");
    Joueur defenseur = joueurService.createJoueur(defenseurName, "");

    return combatService.attack(attaquant, defenseur);
  }
}
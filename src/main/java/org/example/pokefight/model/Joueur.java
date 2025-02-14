package org.example.pokefight.model;

public class Joueur {
  private String nom;
  private Pokemon pokemonChoisi;

  // Constructeur
  public Joueur(String nom) {
    this.nom = nom;
  }

  // Getters et Setters
  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public Pokemon getPokemonChoisi() {
    return pokemonChoisi;
  }

  public void setPokemonChoisi(Pokemon pokemonChoisi) {
    this.pokemonChoisi = pokemonChoisi;
  }
}
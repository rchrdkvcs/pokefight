package org.example.pokefight.model;

public class Combat {
  private Joueur joueur1;
  private Joueur joueur2;

  // Constructeur
  public Combat(Joueur joueur1, Joueur joueur2) {
    this.joueur1 = joueur1;
    this.joueur2 = joueur2;
  }

  // Getters et Setters
  public Joueur getJoueur1() {
    return joueur1;
  }

  public void setJoueur1(Joueur joueur1) {
    this.joueur1 = joueur1;
  }

  public Joueur getJoueur2() {
    return joueur2;
  }

  public void setJoueur2(Joueur joueur2) {
    this.joueur2 = joueur2;
  }
}
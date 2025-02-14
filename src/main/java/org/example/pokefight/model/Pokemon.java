package org.example.pokefight.model;

public class Pokemon {
  private String nom;
  private String type;
  private int pv;
  private int attaque;
  private int defense;

  // Constructeur
  public Pokemon(String nom, String type, int pv, int attaque, int defense) {
    this.nom = nom;
    this.type = type;
    this.pv = pv;
    this.attaque = attaque;
    this.defense = defense;
  }

  // Getters et Setters
  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public int getPv() {
    return pv;
  }

  public void setPv(int pv) {
    this.pv = pv;
  }

  public int getAttaque() {
    return attaque;
  }

  public void setAttaque(int attaque) {
    this.attaque = attaque;
  }

  public int getDefense() {
    return defense;
  }

  public void setDefense(int defense) {
    this.defense = defense;
  }

  @Override
  public String toString() {
    return "Pokemon{" +
            "nom='" + nom + '\'' +
            ", type='" + type + '\'' +
            ", pv=" + pv +
            ", attaque=" + attaque +
            ", defense=" + defense +
            '}';
  }
}
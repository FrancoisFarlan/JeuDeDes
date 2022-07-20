package controller;

import java.util.Random;

public class Joueur {
	
	Random r = new Random();
	private String nom; 
	private int score;
	/**
	 * @param nom
	 * @param score
	 */
	public Joueur(String nom) {
		this.nom = nom;
		this.score = 0;
	}
	public int getScore() {
		return this.score;
	} 
	
	public String getNom() {
		return nom;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int lancerDe(int nbFaces) {
		int tirage = r.nextInt(nbFaces) +1; 
		return tirage;
	}
	
	
	
}

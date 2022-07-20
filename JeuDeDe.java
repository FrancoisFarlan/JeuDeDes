package controller;

public class JeuDeDe {

	public static final int NB_LANCERS = 10; 
	
	public static void main(String[] args) {
		
		// création du dé
		De De1 = new De(6); 
		
		// récupération du nb de faces
		int nbFaces = De1.getNbFaces();
		
		// création des joueurs
		Joueur j1 = new Joueur("Francois"); 
		Joueur j2 = new Joueur("Cecile"); 
		
		int tirage;
		int i = 1; 
		do {
			//tour J1
			tirage = j1.lancerDe(nbFaces); 
			j1.setScore(j1.getScore() + tirage);
			System.out.printf("Le joueur 1 (%s) lance le De et fait un %d", j1.getNom(), tirage);
			System.out.println();
			System.out.printf("Le score de %s est de %d", j1.getNom(), j1.getScore());
			System.out.println();
		
			tirage = j2.lancerDe(nbFaces); 
			j2.setScore(j2.getScore() + tirage);
			System.out.printf("Le joueur 2 (%s) lance le De et fait un %d", j2.getNom(), tirage);
			System.out.println();
			System.out.printf("Le score de %s est de %d", j2.getNom(), j2.getScore());
			System.out.println();
		
		i++;
	
		} while(i <= NB_LANCERS);
		
		System.out.println();
		if(j1.getScore() > j2.getScore()) {
			System.out.printf("%s a gagné !", j1.getNom());
		} else if(j2.getScore() > j2.getScore()) {
			System.out.printf("%s a gagné !", j2.getNom());
		} else {
			System.out.println("Egalité !");
		}
			
		
	}

}

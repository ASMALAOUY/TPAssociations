//EXERCICE1
package com.example.tp;


public class Main {
	public static void main(String[] args) {
		Etudiant e1=new Etudiant("asma"," laouy");
		Etudiant e2=new Etudiant("salma"," laouy");
	
	e1.ajouterNote(14.50);
	e1.ajouterNote(15.50);
	e1.ajouterNote(10.0);
	e2.ajouterNote(11.50);
	e2.ajouterNote(9.50);
	e2.ajouterNote(17.75);
	e1.afficheNotes();
    System.out.print(e1);
    e2.afficheNotes();
    System.out.print(e2);
	}
}
/*
//EXERCICE2
package com.example.tp;

public class Main {
    public static void main(String[] args) {
        // 1. Création des filières
        Filiere info   = new Filiere("Informatique");
        Filiere genie  = new Filiere("Génie Civil");

        // 2. Création des étudiants (noms marocains)
        Etudiant e1 = new Etudiant("El Amrani",   "Youssef");
        Etudiant e2 = new Etudiant("Bennani",     "Asma");
        Etudiant e3 = new Etudiant("Lkhal",       "Omar");
        Etudiant e4 = new Etudiant("Bouchaib",    "Imane");
        Etudiant e5 = new Etudiant("Tazi",        "Ayoub");
        Etudiant e6 = new Etudiant("Aarab",       "Sara");

        // 3. Association étudiants ↔ filières
        info.ajouterEtudiant(e1);
        info.ajouterEtudiant(e2);
        info.ajouterEtudiant(e3);
        info.ajouterEtudiant(e4);
        info.ajouterEtudiant(e5);
        // force l’agrandissement du tableau
        info.ajouterEtudiant(e6);

        genie.ajouterEtudiant(new Etudiant("Ouazzani", "Khadija"));
        genie.ajouterEtudiant(new Etudiant("Sbai", "Walid"));

        // 4. Affichage
        System.out.println(info);
        info.afficherEtudiants();
        System.out.println();

        System.out.println(genie);
        genie.afficherEtudiants();
        System.out.println();

        // 5. Détail d’un étudiant
        System.out.println("Détail de e3 : " + e3);
    }
}
*/
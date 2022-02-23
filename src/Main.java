import java.util.Collections;

/*******************************************************************************
 * Copyright (c) 2022.
 * Auteur : Stephane Brisse
 * Mail   : stephanebrisse@gmail.com
 * https://2020stephane.github.io/stephane
 * -------------------------------------------
 * IDE : INTELLIJ IDEA
 * Language : JAVA
 * Projet : TP_COMPARATOR
 * Créer le :22/02/2022
 * Nom du fichier : Main.java
 * Last Modified : 22/02/2022 20:00
 ******************************************************************************/

public class Main {

    Societe entreprise;

    public Main() {

        Etudiant etudiant1 = new Etudiant("Dupont", "Albert", 22);
        Etudiant etudiant2 = new Etudiant("DUPONT", "albert", 22);
        Etudiant etudiant3 = new Etudiant("Mercier", "Jean", 55);
        Etudiant etudiant4 = new Etudiant("MERCIER", "Jean", 55);

        if (etudiant1.equals(etudiant2)) {
            print("etudiant1 et etudiant2 sont le meme etudiant");
        } else { print("etudiant1 et etudiant2 sont deux etudiants differents"); }

        if (etudiant1.equals(etudiant3)) {
            print("etudiant1 et etudiant3 sont le meme etudiant");
        } else { print("etudiant1 et etudiant3 sont deux etudiants differents"); }

        if (etudiant1.equals(etudiant4)) {
            print("etudiant1 et etudiant4 sont le meme etudiant");
        } else { print("etudiant1 et etudiant4 sont deux etudiants differents"); }

        if (etudiant3.equals(etudiant4)) {
            print("etudiant3 et etudiant4 sont le meme etudiant");
        } else { print("etudiant3 et etudiant4 sont deux etudiants differents"); }
        print(etudiant1.toString());
        print(etudiant2.toString());
        print(etudiant3.toString());
        print(etudiant4.toString());
        print("---------------------------------FIN EXO 1----------------------------------------");
        entreprise = new Societe();
        Etudiant pers = new Etudiant ("Durand","Michel",55);
        entreprise.recruter(new Etudiant( "Mercier", "Jean",50 ) );
        entreprise.recruter(new Etudiant( "Mercier", "Jeanne",50 ) );
        entreprise.recruter( new Etudiant( "Morin", "Nathalie",35 ) );
        entreprise.recruter( new Etudiant( "Martin", "Louis",35 ) );
        entreprise.recruter( new Etudiant( "Dupont", "Josette",25 ) );
        entreprise.recruter( new Etudiant( "Charpentier", "Pierre",35 ) );
        entreprise.recruter( new Etudiant( "Charpentier", "Pierre",25 ) );

        entreprise.recruter( pers );
        printseparator();
        afficher();
        printseparator();
        print(entreprise.congedier( pers ));
        afficher();
        entreprise.getListePersonnel().sort(new CompareEtudiant());
        printseparator();
        afficher();
        printseparator();
        Collections.reverse(entreprise.getListePersonnel());
        afficher();
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(Main::new);
    }
    public void afficher() {

        for (Etudiant e : entreprise.getListePersonnel()) {
            print(e);
        }
    }
    public void print(Object o) {
        System.out.println(o);
    }
    public void printseparator() {
        System.out.println("----------------------------------------------------------------------");
    }
}
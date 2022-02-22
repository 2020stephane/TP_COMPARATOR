/*******************************************************************************
 * Copyright (c) 2022.
 * Auteur : Stephane Brisse
 * Mail   : stephanebrisse@gmail.com
 * https://2020stephane.github.io/stephane
 * -------------------------------------------
 * IDE : INTELLIJ IDEA
 * Language : JAVA
 * Projet : TP_COMPARATOR
 * Créer le :22/02/2022 18:34
 * Nom du fichier : Main.java
 * Last Modified : 22/02/2022 18:34
 ******************************************************************************/

public class Main {

    public Main() {

        Etudiant etudiant1 = new Etudiant("Dupont", "Albert", 22);
        Etudiant etudiant2 = new Etudiant("DUPONT", "albert", 22);
        Etudiant etudiant3 = new Etudiant("Mercier", "Jean", 55);
        Etudiant etudiant4 = new Etudiant("MERCIER", "Jean", 55);
        if (etudiant1.equals(etudiant2)) {
            System.out.println("etudiant1 et etudiant2 sont le meme etudiant");
        }

    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(Main::new);
    }
}
import java.util.ArrayList;

/*******************************************************************************
 * Copyright (c) 2022.
 * Auteur : Stephane Brisse
 * Mail   : stephanebrisse@gmail.com
 * https://2020stephane.github.io/stephane
 * -------------------------------------------
 * IDE : INTELLIJ IDEA
 * Language : JAVA
 * Projet : TP_COMPARATOR
 * Créer le : 22/02/2022
 * Nom du fichier : Societe.java
 * Last Modified : 22/02/2022 22:19
 ******************************************************************************/

public class Societe {

    private ArrayList<Etudiant> ListePersonnel;
    private String messcongedier;

    /**
     * Constructor Societe
     * @param listePersonnel
     */

    public Societe(ArrayList<Etudiant> listePersonnel) {
        ListePersonnel = listePersonnel;
    }

    /**
     * Methode recruter
     * @param e
     */

    public void recruter(Etudiant e) {
        ListePersonnel.add(e);
    }
    public void congedier(Etudiant e) {
        ListePersonnel.remove(e);
        messcongedier = e.getPrenom() + " " + e.getNom() +" quitte l'entreprise";
    }

}

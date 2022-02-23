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
 * Last Modified : 23/02/2022 07:39
 ******************************************************************************/

import java.util.ArrayList;

public class Societe {

    private ArrayList<Etudiant> ListePersonnel;
    private String messcongedier;

    /**
     * Constructors
     *
     */

    public Societe() {
        ListePersonnel = new ArrayList<>();
    }


    /**
     * Methode
     *
     */

    public ArrayList<Etudiant> getListePersonnel() {
        return ListePersonnel;
    }


    public void recruter(Etudiant e) {
        ListePersonnel.add(e);
    }
    public String congedier(Etudiant e) {
        ListePersonnel.remove(e);
        messcongedier = e.getPrenom() + " " + e.getNom() +" quitte l'entreprise";
        return messcongedier;
    }

}

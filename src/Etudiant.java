/*******************************************************************************
 * Copyright (c) 2022.
 * Auteur : Stephane Brisse
 * Mail   : stephanebrisse@gmail.com
 * https://2020stephane.github.io/stephane
 * -------------------------------------------
 * IDE : INTELLIJ IDEA
 * Language : JAVA
 * Projet : TP_COMPARATOR
 * Créer le :22/02/2022 18:20
 * Nom du fichier : Etudiant.java
 * Last Modified : 22/02/2022 18:20
 ******************************************************************************/

public class Etudiant {

    private String prenom;
    private String nom;
    private int age;

    /**
     * Constructors
     */
    public Etudiant(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }
    /**
     * Methodes
     */
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public boolean equals(Etudiant e) {
        if (this.getNom() == e.getNom() & this.getPrenom() == e.getPrenom() & this.getAge() == e.getAge()) {
            return true;
        } else { return false; }
    }
}

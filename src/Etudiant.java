
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
 * Nom du fichier : Etudiant.java
 * Last Modified : 23/02/2022 10:15
 ******************************************************************************/

public class Etudiant implements Comparable{

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
    @Override
    public boolean equals(Object e) {

        Etudiant etudiant = (Etudiant) e;
        return this.nom.equalsIgnoreCase(etudiant.getNom()) & this.prenom.equalsIgnoreCase(etudiant.getPrenom()) &
                this.age == etudiant.age;
    }
    public String toString() {
        return "Identite de l'etudiant ------> " + this.getNom() + " " + this.getPrenom() +
                " " + this.getAge() + " " + "ans";
    }

    @Override
    public int compareTo(Object o) {
       Etudiant e = (Etudiant) o;
       if ( (this.getNom().compareToIgnoreCase(e.getNom()) == 0)) {
           if ((this.getPrenom().compareToIgnoreCase(e.getPrenom()) == 0)) {
               if ( (this.getAge() == e.getAge()) ) {
                   return 0;
               } else {
                   if (this.getAge() < e.getAge() ) {
                      return -1;
                   }else return 1;
               }
           } else { return this.getPrenom().compareToIgnoreCase(e.getPrenom()); }
        } else { return this.getNom().compareToIgnoreCase(e.getNom()); }
    }
}

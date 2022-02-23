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
 * Nom du fichier : CompareEtudiant.java
 * Last Modified : 23/02/2022 10:42
 ******************************************************************************/

import java.util.Comparator;

public class CompareEtudiant implements Comparator<Etudiant> {

    /**
     * Constructors
     */

    public CompareEtudiant() {  }

    /**
     * Methodes
     */

    @Override
    public int compare(Etudiant o1, Etudiant o2) { return o1.compareTo(o2);  }
}

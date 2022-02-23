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
 * Nom du fichier : MyMain.java
 * Last Modified : 23/02/2022 10:44
 ******************************************************************************/

public class MyMain {

    private static void createAndShowGUI() {

        MyFrame myframe = new MyFrame();
    }

    public static void main(String[] args) {

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
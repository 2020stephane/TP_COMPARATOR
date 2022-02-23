import javax.swing.*;
import java.awt.*;
import java.util.Objects;

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
 * Nom du fichier : MyFrame.java
 * Last Modified : 23/02/2022 10:44
 ******************************************************************************/

public class MyFrame extends JFrame {

    MyPanel mypanel;

    public MyFrame() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon logo = new ImageIcon(Objects.requireNonNull(getClass().getResource(
                "/icon/moon.png")));
        setIconImage(logo.getImage());

        this.setTitle(" TP-COMPARATOR ");
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        int height = dim.height;
        int width = dim.width;
        this.setLocation(width / 4, height / 4);
        this.setSize(width / 2, height / 2);
        mypanel = new MyPanel();
        this.add(mypanel, BorderLayout.CENTER);
        this.setVisible(true);
    }

}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author juanfelipemurcia
 */
public class img extends javax.swing.JPanel {

    private String ruta;

    public img(int alto, int ancho, String ruta) {
        this.setSize(ancho, alto);
        this.ruta = ruta;
    }

    @Override
    public void paint(Graphics g) {

        Dimension tamano = getSize();
        //ImageIcon img = new ImageIcon(getClass().getResource(ruta));
        Image img = new ImageIcon(ruta).getImage();
        g.drawImage(img,
                0,
                0,
                tamano.width,
                tamano.height,
                this);
       setOpaque(false);
       super.paintComponent(g);

    }

}

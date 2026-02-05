
package com.gustavo.reproductor.app;

import com.gustavo.reproductor.vista.ReproductorVistaJF;
import javax.swing.SwingUtilities;


public class ReproductorMultimediaJava {
    
    public static void main(String[] args){
        SwingUtilities.invokeLater(() -> {
            new ReproductorVistaJF().setVisible(true);
            System.out.println("Reproductor iniciado");
        });
    }
    
}

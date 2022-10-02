/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

import javax.swing.JOptionPane;

/**
 *
 * @author Leonardo Córdoba
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                int dado1, dado2, dado3;
        dado1 = (int)(Math.random()*6)+1;
        JOptionPane.showMessageDialog(null,"Dado1 = "+dado1);
        dado2 = (int)(Math.random()*6)+1;
        JOptionPane.showMessageDialog(null,"Dado2 = "+dado2);
        dado3 = (int)(Math.random()*6)+1;
        JOptionPane.showMessageDialog(null,"Dado3 = "+dado3);
        
        if (dado1 == 6 || dado2 == 6 || dado3 == 6) {
            JOptionPane.showMessageDialog(null, "Justo");
        }
        if (dado1 == 6 && dado2 == 6 || dado1 == 6 && dado3 == 6 || dado2
                == 6 && dado3 == 6) {
            JOptionPane.showMessageDialog(null,
                    "Muy Bueno");
        }
        if (dado1 == 6 && dado2 == 6 && dado3 == 6) {
            JOptionPane.showMessageDialog(null,
                    "Genial");

        } else {
            JOptionPane.showMessageDialog(null,
                    "miedo");
            
        }
        }
            
    
}
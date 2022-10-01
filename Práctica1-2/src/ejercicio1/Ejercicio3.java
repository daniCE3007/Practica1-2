package com.mycompany.practica2_3;

/**
 *
 * @author andrew
 */
import javax.swing.JOptionPane;

public class Ejercicio3 {

    public static void main(String[] args) {
        int temperature = Integer.parseInt(JOptionPane.showInputDialog(
                null, "Ingrese la temperatura en "
                + "grados centígrados"));

        if (temperature <= 10) {
            JOptionPane.showMessageDialog(null, "El clima esta "
                    + "frio");
        } else if (10 < temperature && temperature <= 20) {
            JOptionPane.showMessageDialog(null, "El clima esta "
                    + "Nublado");
        } else if (20 < temperature && temperature <= 30) {
            JOptionPane.showMessageDialog(null, "El clima esta "
                    + "Caluroso");
        } else {
            JOptionPane.showMessageDialog(null, "El clima es "
                    + "Tropical");
        }
    }
}

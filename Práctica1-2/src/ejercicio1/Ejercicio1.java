/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;
import javax.swing.JOptionPane;

/**
 *
 * @author danic
 * Daniela Cubillo
 * Leonardo Cordoba
 * Andrew Bocker
 * Kevin Ramirez
 */
public class Ejercicio1 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Solicitudes al usuario
        float anti= Float.parseFloat(JOptionPane.showInputDialog(
                "Digite cuantos años de antiguedad tiene:"));
        float horas= Float.parseFloat(JOptionPane.showInputDialog(
                "Ingrese la cantidad de horas laboradas por semana:"));
        float salario= Float.parseFloat(JOptionPane.showInputDialog(
                "Ingrese su salario por hora:"));
        
        //Cálculos:
        
        float salbruto = horas * salario;
        
        if (anti > 10) {
            salbruto = (float)(salbruto + (0.20 * salbruto));
            JOptionPane.showMessageDialog(null, "el salario "
                    + "total es: " + salbruto);
            if (salbruto > 1000 && salbruto < 2000) {
                salbruto = (float) (salbruto - (0.10 * salbruto));
                JOptionPane.showMessageDialog(null, "el salario "
                        + "supera los 1000 dolares procede a reducir un 10% de"
                        + " su salario total: " + salbruto);
            } else if (salbruto > 2000) {
                salbruto = (float) (salbruto - (0.15 * salbruto));
                JOptionPane.showMessageDialog(null, "el salario "
                        + "supera los 2000 dolares, se le procede a reducir "
                        + "un 15% de su salario total: " + salbruto);
                }
        }else {
            JOptionPane.showMessageDialog(null,"Su salario bruto "
                    + "es de"+salbruto);
            }
        }
    }
        

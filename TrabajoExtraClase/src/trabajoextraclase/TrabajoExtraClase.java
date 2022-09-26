/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajoextraclase;
import javax.swing.JOptionPane;

/**
 *
 * @author danic
 */
public class TrabajoExtraClase {
    

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
    if (anti > 10){
        salario = (float) (salario+(0.20*salario));
            JOptionPane.showMessageDialog(null,"el salario "
            + "total es: "+salario);
        if (salario > 1000 && salario < 2000){
            salario = (float) (salario-(0.10*salario));
            JOptionPane.showMessageDialog(null,"el salario supera los 1000 dolares "
            + ", se le procede a reducir un 10% de su salario total: "+salario);
        }
        if (salario > 2000){
            salario = (float) (salario-(0.15*salario));
            JOptionPane.showMessageDialog(null,"el salario supera los 2000 dolares "
            + ", se le procede a reducir un 15% de su salario total: "+salario);
        }
    }
    }
    }
    

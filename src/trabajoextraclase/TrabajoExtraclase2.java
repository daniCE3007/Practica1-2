/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajoextraclase;
import javax.swing.JOptionPane;

/**
 *
 * @author kramirez
 */
public class TrabajoExtraclase2 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Variables de usuario
        float monto = 0f;

        //Variables de sistema
        float descuento = 0f;
        float recargo = 0f;
        float total = 0f;

        //Variable de control de menu
        byte opcion = 0;

        //Ejecucion de menu
        do {
            opcion = Byte.parseByte(JOptionPane.showInputDialog(null, 
                    "Bienvenido al sistema de pago de Farmacia La Bomba\n"
                    + "Seleccione el método de pago:\n"
                    + "1. Efectivo\n"
                    + "2. Tarjeta\n"
                    + "3. Salir"));

            //Efectivo
            if (opcion == 1) {
                monto = Float.parseFloat(JOptionPane.showInputDialog(null, 
                        "Ingrese el monto total de los artículos:"));
                descuento = monto * 0.05f; //5% de descuento
                total = monto - descuento;
                JOptionPane.showMessageDialog(null, "Monto de los artículos: $" 
                        + monto + "\n"
                        + "Descuento por pago en efectivo: $" + descuento + "\n"
                        + "Total a pagar: $" + total);

            //Tarjeta
            } else if (opcion == 2) {
                monto = Float.parseFloat(JOptionPane.showInputDialog(null, 
                        "Ingrese el monto total de los artículos:"));
                recargo = monto * 0.03f; //3% de recargo
                total = monto + recargo;
                JOptionPane.showMessageDialog(null, "Monto de los artículos: $"
                        + monto + "\n"
                        + "Recargo por pago con tarjeta: $" + recargo + "\n"
                        + "Total a pagar: $" + total);

            //Salir
            } else if (opcion == 3) {
                JOptionPane.showMessageDialog(null, "Gracias por usar el "
                        + "sistema de pago de Farmacia La Bomba");

            //Opcion invalida
            } else {
                JOptionPane.showMessageDialog(null, "Opción inválida, "
                        + "intente de nuevo");
            }
        } while (opcion != 3);
        
    }
    
}

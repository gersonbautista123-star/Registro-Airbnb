/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package registrodehotel;

import java.util.Scanner;

/**
 *
 * @author Gerson
 */
public class RegistrodeHotel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       
       System.out.print("Ingrese el nombres: ");
       String nombre = teclado.nextLine();
       
       System.out.print("Ingrese el pago por noche (S/): ");
       float pagoPorNoche = teclado.nextFloat();
       
       System.out.print("Ingrese la cantidad de noches: ");
       int cantidadNoches = teclado.nextInt();
       
       Registro habitacion = new Registro(nombre, pagoPorNoche, cantidadNoches);
       
       System.out.println("\n--- REGISTRO DEL USUARIO ---");
       
       System.out.println("Nombre del huésped: " + habitacion.getNombre());
       System.out.println("Monto bruto: S/" + habitacion.getMontoBase());
       System.out.println("Descuento: S/" + habitacion.getDescuento());
       System.out.println("Monto neto: S/" + habitacion.getMontoNeto());
        // TODO code application logic here
    }
    
}

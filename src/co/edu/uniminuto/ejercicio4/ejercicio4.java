
package co.edu.uniminuto.ejercicio4;

import co.edu.uniminuto.entity.cotizacion;
import co.edu.uniminuto.entity.vehiculo;
import java.util.Scanner;

public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los datos del vehiculo:");
        System.out.print("Marca: ");
        String marca = scanner.nextLine();
        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();
        System.out.print("Color: ");
        String color = scanner.nextLine();
        System.out.print("Añdo: ");
        int año = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Motivo de Reparacion: ");
        String motivoReparacion = scanner.nextLine();

        vehiculo vehiculo = new vehiculo(marca, modelo, color, año, motivoReparacion);

        System.out.println("Ingrese los costos:");
        System.out.print("Mano de Obra: $");
        double manoObra = scanner.nextDouble();
        System.out.print("Precio Total de Repuestos: $");
        double precioRepuestos = scanner.nextDouble();

        cotizacion cotizacion = new cotizacion(vehiculo, manoObra, precioRepuestos);
        cotizacion.imprimirCotizacion();

        scanner.close();
    }
    
}

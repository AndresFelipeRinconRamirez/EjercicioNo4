
package co.edu.uniminuto.entity;

public class cotizacion {
    private vehiculo vehiculo;
    private double manoObra;
    private double precioRepuestos;
    private double gastosAdministrativos;
    private double total;

    public cotizacion(vehiculo vehiculo, double manoObra, double precioRepuestos) {
        this.vehiculo = vehiculo;
        this.manoObra = manoObra;
        this.precioRepuestos = precioRepuestos;
        this.gastosAdministrativos = calcularGastosAdministrativos();
        this.total = calcularTotal();
    }

    private double calcularGastosAdministrativos() {
        return 0.15 * (manoObra + precioRepuestos);
    }

    private double calcularTotal() {
        return manoObra + precioRepuestos + gastosAdministrativos;
    }

    public void imprimirCotizacion() {
        System.out.println("----Datos del Vehiculo----:");
        System.out.println(vehiculo);
        System.out.println("-----Detalle de la Cotizacion-----:");
        System.out.println("Mano de Obra: $" + manoObra);
        System.out.println("Precio de Repuestos: $" + precioRepuestos);
        System.out.println("Gastos Administrativos: $" + gastosAdministrativos);
        System.out.println("Monto Total: $" + total);
    }    
}   
    


package co.edu.uniminuto.entity;

public class vehiculo {
    private String marca;
    private String modelo;
    private String color;
    private int año;
    private String motivoReparacion;

    public vehiculo(String marca, String modelo, String color, int año, String motivoReparacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.año = año;
        this.motivoReparacion = motivoReparacion;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public int getAño() {
        return año;
    }

    public String getMotivoReparacion() {
        return motivoReparacion;
    }

    @Override
    public String toString() {
        return "Vehiculo [Marca=" + marca + ", Modelo=" + modelo + ", Color=" + color + ", Año=" + año + ", Motivo de Reparación=" + motivoReparacion + "]";
    }
}

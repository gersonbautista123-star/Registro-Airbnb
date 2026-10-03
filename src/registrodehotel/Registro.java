/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registrodehotel;

/**
 *
 * @author Gerson
 */
public class Registro {
    private String nombre; // ingreso de nombre del cliente
    private double pagoPorNoche; // ingreso de pago por noche
    private int cantidadNoches; // ingreso de noches hospedadas
    private double montoBase; // ingreso del Monto Base
    private double descuento; // ingreso del Descuento
    private double montoNeto; // Ingreso del Monto Neto
    
    
    public Registro(String nombre, double pagoPorNoche, int cantidadNoches, double descuentoCalculado){
            this.nombre = nombre;
            this.pagoPorNoche = pagoPorNoche;
            this.cantidadNoches = cantidadNoches;
            this.descuento = descuentoCalculado;
            
            //Calculo que hara el sistema
            this.montoBase = this.pagoPorNoche * this.cantidadNoches;          
            this.montoNeto = this.montoBase - this.descuento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPagoPorNoche() {
        return pagoPorNoche;
    }

    public void setPagoPorNoche(double pagoPorNoche) {
        this.pagoPorNoche = pagoPorNoche;
    }

    public int getCantidadNoches() {
        return cantidadNoches;
    }

    public void setCantidadNoches(int cantidadNoches) {
        this.cantidadNoches = cantidadNoches;
    }

    public double getMontoBase() {
        return montoBase;
    }

    public void setMontoBase(double montoBase) {
        this.montoBase = montoBase;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getMontoNeto() {
        return montoNeto;
    }

    public void setMontoNeto(double montoNeto) {
        this.montoNeto = montoNeto;
    }
}

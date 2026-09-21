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
    private float pagoPorNoche; // ingreso de pago por noche
    private int cantidadNoches; // ingreso de noches hospedadas
    private float montoBase; // ingreso del Monto Base
    private float descuento; // ingreso del Descuento
    private float montoNeto; // Ingreso del Monto Neto
    
    public Registro(String nombre, float pagoPorNoche, int cantidadNoches){
            this.nombre = nombre;
            this.pagoPorNoche = pagoPorNoche;
            this.cantidadNoches = cantidadNoches;
            
            //Calculo que hara el sistema
            this.montoBase = cantidadNoches * pagoPorNoche;
            this.descuento = (float) (this.montoBase * 0.10);
            this.montoNeto = this.montoBase - this.descuento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPagoPorNoche() {
        return pagoPorNoche;
    }

    public void setPagoPorNoche(float pagoPorNoche) {
        this.pagoPorNoche = pagoPorNoche;
    }

    public int getCantidadNoches() {
        return cantidadNoches;
    }

    public void setCantidadNoches(int cantidadNoches) {
        this.cantidadNoches = cantidadNoches;
    }

    public float getMontoBase() {
        return montoBase;
    }

    public void setMontoBase(float montoBase) {
        this.montoBase = montoBase;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    public float getMontoNeto() {
        return montoNeto;
    }

    public void setMontoNeto(float montoNeto) {
        this.montoNeto = montoNeto;
    }          
}

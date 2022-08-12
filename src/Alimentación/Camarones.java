/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Alimentación;

import javax.swing.JOptionPane;


/**
 *
 * @author joans
 */
public class Camarones {
    protected int CantidadDeAlimentación;
    protected int Precio;
    protected int Disponibilidad;

    public Camarones(int CantidadDeAlimentacion, int Precio) {
     this.CantidadDeAlimentación=CantidadDeAlimentacion;
     this.Precio=Precio;
     
    }

    public Camarones() {
        this.Precio=100;
        this.Disponibilidad=0;
        this.CantidadDeAlimentación=10;
    }
    

    public void setDisponibilidad(int Disponibilidad) {
        if (this.Disponibilidad<0)
            this.Disponibilidad=0;
        else
        this.Disponibilidad -= Disponibilidad;
    }

    public int getDisponibilidad() {
        return Disponibilidad;
    }

    public int getPrecio() {
        return Precio;
    }

    public int getCantidadDeAlimentación() {
        return CantidadDeAlimentación;
    }
    
 
    private int Compra(int cantidad, int Dinero){
    int PrecioTotal=cantidad*this.Precio;
    if(PrecioTotal<=Dinero){
    Dinero-=PrecioTotal;
    this.Disponibilidad+=cantidad;
    }else{
    JOptionPane.showMessageDialog(null, "No tienes sufiente dinero");
    Dinero=0;
    }
    return Dinero;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Alimentación;

/**
 *
 * @author joans
 */
public class Medicina {
    private String Nombre;
    private int Precio;
    private int CantidadDeSalud;
    private boolean Disponiblidad;

    public String getNombre() {
        return Nombre;
    }

    public int getPrecio() {
        return Precio;
    }

    public int getCantidadDeSalud() {
        return CantidadDeSalud;
    }

    public boolean isDisponiblidad() {
        return Disponiblidad;
    }

    public Medicina() {
        this.Nombre = "Orra";
        this.Precio = 400;
        this.CantidadDeSalud = 100;
        this.Disponiblidad=false;
    }
    
    private int Compra(int Dinero){
    if (Dinero>=Precio){
    Dinero-=Precio;
    this.Disponiblidad=true;
    }else{
    Dinero=0;
    this.Disponiblidad=false;
    }
    return Dinero;
    }
    
    
}

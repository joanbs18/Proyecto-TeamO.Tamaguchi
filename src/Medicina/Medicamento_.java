/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Medicina;

/**
 *
 * @author Ale Anchía
 */
public class Medicamento_ {
      protected String Nombre;
    protected int CantidadDeSalud;
    protected int Energia;
    protected int precio;
    protected int tiempo;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCantidadDeSalud() {
        return CantidadDeSalud;
    }

    public void setCantidadDeSalud(int CantidadDeSalud) {
        this.CantidadDeSalud = CantidadDeSalud;
    }

    public int getEnergia() {
        return Energia;
    }

    public void setEnergia(int Energia) {
        this.Energia = Energia;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public Medicamento_() {
        this.Nombre= "Jarabe de Alga";
        this.CantidadDeSalud=200;
        this.precio=400;
    }  
    
        
}


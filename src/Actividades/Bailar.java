/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividades;

/**
 *
 * @author joans
 */
public class Bailar {
    private int Energía;
    private int aburrimiento;
    private int Tiempo;

    public Bailar(int Energía, int aburrimiento, int Tiempo) {
        this.Energía = Energía;
        this.aburrimiento = aburrimiento;
        this.Tiempo = Tiempo;
    }

    public Bailar() {
        this.Energía = 20;
        this.aburrimiento = 20;
        this.Tiempo = 30;
    }
    
    
    
    

    public int getEnergía() {
        return Energía;
    }

    public void setEnergía(int Energía) {
        this.Energía = Energía;
    }

    public int getAburrimiento() {
        return aburrimiento;
    }

    public void setAburrimiento(int aburrimiento) {
        this.aburrimiento = aburrimiento;
    }

    public int getTiempo() {
        return Tiempo;
    }

    public void setTiempo(int Tiempo) {
        this.Tiempo = Tiempo;
    }
    
   // public void bajar
  
}

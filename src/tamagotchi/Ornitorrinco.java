/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tamagotchi;

/**
 *
 * @author joans
 */
public class Ornitorrinco {
    private String Nombre;
    private int Salud;
    private int Aburrimiento;
    private int Energía;
    private int Hambre;
    private boolean Estado;

    public Ornitorrinco(String Nombre) {
        this.Nombre=Nombre;
        Salud=100;
        Aburrimiento=100;
        Energía=100;
        Hambre=0;
        Estado=true;
    }

    public int getSalud() {
     this.EstadoDeSalud();
        return Salud;
    }

    public int getAburrimiento() {
        return Aburrimiento;
    }

    public int getEnergía() {
        return Energía;
    }

    public int getHambre() {
        return Hambre;
    }
    
    private void EstadoDeSalud(){
    if (Salud==0){
    Estado=false;
    
    }
    }
    
    
    
}

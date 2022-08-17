/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tamagotchi;

/**
 *
 * @author joans
 */
public class Cronometro {
     private int Segundos;
    private int Minutos;

    public int getSegundos() {
        return Segundos;
    }

    public int getMinutos() {
        return Minutos;
    }

    public Cronometro() {
        this.Segundos = 0;
        this.Minutos = 0;
    }
    
    public void contar(){
    Segundos++;
    if (this.Segundos==60){
    Minutos++;
    Segundos=0;
    }
    }
    public void reiniciar(){
    this.Minutos=0;
    this.Segundos=0;
    }

    @Override
    public String toString() {
      
      return  Minutos +":"+ Segundos;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tamagotchi;

/**
 *
 * @author joans
 */
public class Jugador {

    private String Nombre;
    private int Dinero;
    private int Puntos;
    private boolean Estado;

    public Jugador(String Nombre) {
        this.Nombre = Nombre;
        Estado = true;
        Dinero=1000;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getDinero() {
        return Dinero;
    }

    public void setDinero(int Dinero) {
        if (this.Dinero <= 0) {
            this.Dinero = 0;
        } else {
            this.Dinero = Dinero;
        }
    }

    public int getPuntos() {
        return Puntos;
    }

    public void setPuntos(int Puntos) {
        if (this.Puntos <= 0) {
            this.Puntos = 0;
        } else {
            this.Puntos = Puntos;
        }
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }
    
    

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tamagotchi;

import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JButton;
import javax.swing.JOptionPane;

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
    private String[] Cedad = {"Huevo", "Bebe", "Joven", "Adulto"};

    public Ornitorrinco(String Nombre) {
        this.Nombre = Nombre;
        Salud = 100;
        Aburrimiento = 0;
        Energía = 100;
        Hambre = 0;
        Estado = true;

    }

    public void setSalud(int Salud) {
        if (this.Salud <= 10) {
            JOptionPane.showMessageDialog(null, "Peligra la salud");
        } else {
            this.Salud = Salud;
        }
    }

    public void setAburrimiento(int Aburrimiento) {
        this.Aburrimiento = Aburrimiento;
    }

    public void setEnergía(int Energía) {
        this.Energía = Energía;
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

    public void setHambre(int Hambre) {
        if (this.Hambre < 0) {
            this.Hambre = 0;
        } else {
            this.Hambre += Hambre;
        }
    }

    private void EstadoDeSalud() {
      
        if (Salud <5) {
            Estado = false;
        }
    }

    public String[] getEdad() {
        return Cedad;
    }

    public String EdadMascota(int i) {
        return Cedad[i];
    }

    public void quitarHambre(int comida) {
        if (this.Hambre > 0) {
            this.Hambre -= comida;
        } else {
            JOptionPane.showMessageDialog(null, "Tu " + Nombre + " No tiene Hambre");
        }
    }

    public void subidaEnSalud(int salud) {
        if (this.Salud < 100) {
            this.Salud += salud;
        } else {
            JOptionPane.showMessageDialog(null, "Esta bien de Salud");
        }
    }

}

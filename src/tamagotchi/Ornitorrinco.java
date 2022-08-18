/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tamagotchi;

import javax.swing.JOptionPane;

/**
 *
 * @author joans
 */
public class Ornitorrinco {

    private String Nombre;
    private boolean Salud;
    private int Aburrimiento;
    private int Energía;
    private int Necesidad;
    private int Hambre;
    private boolean Estado;
    private boolean Dormir;
    private String[] Cedad = {"Huevo", "Bebe", "Joven", "Adulto"};

    public Ornitorrinco(String Nombre) {
        this.Nombre = Nombre;
        Salud = true;
        Aburrimiento = 0;
        Energía = 100;
        Hambre = 0;
        Dormir = false;
        Necesidad = 0;
        Estado = true;

    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }

    public int getNecesidad() {
        return Necesidad;
    }

    public void setNecesidad(int Necesidad) {
        if (this.Necesidad >= 100) {
            this.Salud = false;
        } else {
            this.Necesidad += Necesidad;
        }
        if (this.Necesidad >= 80) {
            this.Estado = false;
           
        }
        
    }

    public boolean isDormir() {
        return Dormir;
    }

    public void setDormir(boolean Dormir) {
        if (Dormir) {
            this.Energía += 50;
        }
        this.Dormir = false;

    }

    public boolean isSalud() {
        return Salud;
    }

    public void setSalud(boolean Salud) {
        this.Salud = Salud;
    }

    public void setAburrimiento(int Aburrimiento) {
        if (this.Aburrimiento >= 100) {
            this.Salud = false;
        } else {
            this.Aburrimiento += Aburrimiento;
        }
        if (this.Aburrimiento >= 80) {
            this.Estado = false;
           
        }
       

    }

    public void setEnergía(int Energía) {
        if (this.Energía < 0) {
            this.Energía = 0;
           
        } else {
            this.Energía -= Energía;
        }
        if (this.Energía <= 20) {
            this.Estado = false;
            
        }
        if (this.Energía<=0){
        this.Salud = false;
        }
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
        if (this.Hambre >= 80) {
            this.Estado = false;
       
            
        }
        if (this.Hambre>=100){
        this.Salud = false;
        }
    }

    public String getNombre() {
        return Nombre;
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

    public void bajarAburrimiento(int menosaAburrimiento) {
        if (this.Aburrimiento < 0) {
            this.Aburrimiento = 0;

        } else {
            this.Aburrimiento -= menosaAburrimiento;
        }
    }

    public void subirEnergía(int Energía) {
        if (this.Energía >= 100) {
            this.Energía = 100;
        } else {
            this.Energía += Energía;
        }
    }

    public void bajarNecesidad() {
        if (this.Necesidad > 0) {
            this.Necesidad = 0;
        }
    }

    public void EstadoSalud() {
        if (this.Hambre >= 100) {
            this.Salud = false;
        }
        if (this.Aburrimiento >= 100) {
            this.Salud = false;
        }
        if (this.Energía <= 0) {
            this.Salud = false;
        }
    }

   

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Medicina;

import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JButton;

/**
 *
 * @author Ale Anchía
 */
public class Medicamento {

    private String Nombre;
    private int Hambre;
    private int Energia;
    private int tiempo;
    private int Necesidad;
    private int Aburrimiento;
    
public Medicamento() {
        this.Nombre = "Jarabe de Alga";
        this.Energia = 45;
        this.tiempo = 5;
        this.Necesidad = 45;
        this.Hambre = 45;
        Aburrimiento=45;

    }

    public int getAburrimiento() {
        return Aburrimiento;
    }

    public void setAburrimiento(int Aburrimiento) {
        this.Aburrimiento = Aburrimiento;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getHambre() {
        return Hambre;
    }

    public int getNecesidad() {
        return Necesidad;
    }

    public int getEnergia() {
        return Energia;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    

    static int conta;

    public void tiempoOcultar(JButton boton, int time) {
        int tiempo = time * 60000;
        Timer timer;
        TimerTask timerTask;
        timerTask = new TimerTask() {

            @Override
            public void run() {
                switch (conta) {
                    case 0:
                        conta++;
                        boton.setEnabled(false);
                        break;
                    case 1:
                        conta = 0;
                        boton.setEnabled(true);
                        cancel();
                        break;

                }

            }

        };

        timer = new Timer();
        timer.schedule(timerTask, 0, tiempo);
    }

}

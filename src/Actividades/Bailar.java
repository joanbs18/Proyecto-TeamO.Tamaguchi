/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividades;

import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JButton;

/**
 *
 * @author joans
 */
public class Bailar {
    protected int Energía;
    protected int aburrimiento;
    protected int Tiempo;

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
    static int conta;
 public void tiempoOcultar(JButton boton, int time) {
        int tiempo = time * 10000;
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

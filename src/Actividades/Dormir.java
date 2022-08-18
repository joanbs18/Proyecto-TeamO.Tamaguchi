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
public class Dormir {
private int Energia;
private int tiempo;

    public Dormir() {
        tiempo=45;
        Energia=20;
    }


    public int getEnergia() {
        return Energia;
    }

    public void setEnergia(int Energia) {
        this.Energia = Energia;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
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

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Alimentación;

import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JButton;

/**
 *
 * @author joans
 */
public class Camarones {

    protected int CantidadDeAlimentación;
    protected int Energia;
    protected int Tiempo;

    public int getEnergia() {
        return Energia;
    }

    public Camarones(int CantidadDeAlimentación, int Energia, int Tiempo) {
        this.CantidadDeAlimentación = CantidadDeAlimentación;
        this.Energia = Energia;
        this.Tiempo = Tiempo;
    }

    public Camarones() {
        this.CantidadDeAlimentación = 30;
        this.Energia = 5;
        this.Tiempo = 10;
    }

    public int getTiempo() {
        return Tiempo;
    }

    public void setTiempo(int Tiempo) {
        this.Tiempo = Tiempo;
    }

    public int getCantidadDeAlimentación() {
        return CantidadDeAlimentación;
    }
    static int conta;
  public void tiempoOcultar(JButton boton, int time) {
        int tiempo = time * 1000;
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

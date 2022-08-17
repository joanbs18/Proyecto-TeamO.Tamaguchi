/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Graficos;

import Alimentación.Algas;
import Alimentación.Camarones;
import Alimentación.Moluzcos;
import Alimentación.Pez;
import Alimentación.Renacuajos;
import java.awt.event.ActionEvent;
import java.util.TimerTask;
import java.util.Timer;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import tamagotchi.Cronometro;
import tamagotchi.Ornitorrinco;

/**
 *
 * @author joans
 */
public class JuegoPrincipal extends javax.swing.JFrame {
//ATRIBUTOS------------------------------------

    private int contadorDías;
    private String Nombre;
    Cronometro cron;
    static int cont = 0;//ES PARA BOTONES
    static int conte = 0;//ES PARA MOSTRAR LAS EDADES
    static int conta = 0;//ES PARA MOSTRAR LAS EDADES
    static int contaS = 0;//ES PARA MOSTRAR LAS EDADES
//OBJECTOS-------------------------------------
    Ornitorrinco or = new Ornitorrinco(Nombre);
    Camarones cam = new Camarones();
    Renacuajos ren = new Renacuajos();
    Algas al = new Algas();
    Moluzcos mol = new Moluzcos();
    Pez pez = new Pez();

//---------------------------------------------
    /**
     * Creates new form JuegoPrincipal
     */
    public JuegoPrincipal() {
        initComponents();
        deshabilitarBotones();
        MostrarDiaNoche(this.fondoDia, this.fondoNoche); // Esto hace un cambio de dia a noche y viceversa
        barrasBar();
        cron = new Cronometro();
        timer.start();

    }
    javax.swing.Timer timer = new javax.swing.Timer(1000, (ActionEvent e) -> {
        //this.tiempo.setText(cron.toString());
        this.cron.contar();
    });

    private void barrasBar() {
        this.pSalud.setValue(or.getSalud());
        this.pAburrimiento.setValue(or.getAburrimiento());
        this.pEnergía.setValue(or.getEnergía());
        this.pHambre.setValue(or.getHambre());

    }

    private void deshabilitarBotones() {
        this.btnAlgas.setEnabled(false);
        this.btnCamarones.setEnabled(false);
        this.btnMoluzco.setEnabled(false);
        this.btnPez.setEnabled(false);
        this.btnRenacuajo.setEnabled(false);
        //-------------------------jlabel-----------------------
        this.Bebe.setVisible(false);
        this.Joven.setVisible(false);
        this.JEnfermo.setVisible(false);
    }

    private void habilitarBotones(int contadorDías) {
        if (contadorDías == 2) {
            this.btnCamarones.setEnabled(true);

        }
        if (contadorDías == 3) {
            this.btnRenacuajo.setEnabled(true);
        }
        if (contadorDías == 4) {
            this.btnAlgas.setEnabled(true);
        }
        if (contadorDías == 15) {
            this.btnMoluzco.setEnabled(true);
        }
        if (contadorDías == 16) {
            this.btnPez.setEnabled(true);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        JEnfermo = new javax.swing.JLabel();
        Joven = new javax.swing.JLabel();
        tEdad = new javax.swing.JLabel();
        Bebe = new javax.swing.JLabel();
        btnCamarones = new javax.swing.JButton();
        btnRenacuajo = new javax.swing.JButton();
        btnAlgas = new javax.swing.JButton();
        btnMoluzco = new javax.swing.JButton();
        btnPez = new javax.swing.JButton();
        btnMedicina = new javax.swing.JButton();
        pHambre = new javax.swing.JProgressBar();
        pEnergía = new javax.swing.JProgressBar();
        pAburrimiento = new javax.swing.JProgressBar();
        pSalud = new javax.swing.JProgressBar();
        Brilo = new javax.swing.JLabel();
        Huevo = new javax.swing.JLabel();
        fondoDia = new javax.swing.JLabel();
        fondoNoche = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BAILARBTN1.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BAILARBTN2.png"))); // NOI18N
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 160, -1, -1));

        jButton2.setText("jButton1");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 270, -1, -1));

        jButton3.setText("jButton1");
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 200, -1, -1));

        jButton4.setText("jButton1");
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 200, -1, -1));

        jButton5.setText("jButton1");
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 200, -1, -1));

        JEnfermo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/termometro (1).gif"))); // NOI18N
        jPanel1.add(JEnfermo, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 340, 360, 400));

        Joven.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Joven.gif"))); // NOI18N
        jPanel1.add(Joven, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, 730, 350));

        tEdad.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        tEdad.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(tEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 120, 30));

        Bebe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bebe (1).gif"))); // NOI18N
        jPanel1.add(Bebe, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, 550, 490));

        btnCamarones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/camarones.png"))); // NOI18N
        btnCamarones.setContentAreaFilled(false);
        btnCamarones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCamaronesActionPerformed(evt);
            }
        });
        jPanel1.add(btnCamarones, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        btnRenacuajo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/renacuajo.png"))); // NOI18N
        btnRenacuajo.setContentAreaFilled(false);
        btnRenacuajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRenacuajoActionPerformed(evt);
            }
        });
        jPanel1.add(btnRenacuajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        btnAlgas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/algas.png"))); // NOI18N
        btnAlgas.setContentAreaFilled(false);
        btnAlgas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlgasActionPerformed(evt);
            }
        });
        jPanel1.add(btnAlgas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        btnMoluzco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/moluzcos.png"))); // NOI18N
        btnMoluzco.setContentAreaFilled(false);
        btnMoluzco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoluzcoActionPerformed(evt);
            }
        });
        jPanel1.add(btnMoluzco, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, -1, -1));

        btnPez.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pez.png"))); // NOI18N
        btnPez.setContentAreaFilled(false);
        btnPez.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPezActionPerformed(evt);
            }
        });
        jPanel1.add(btnPez, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, -1, -1));

        btnMedicina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconfinder-basket-4341280_120547.png"))); // NOI18N
        btnMedicina.setContentAreaFilled(false);
        btnMedicina.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/comprar-verde.png"))); // NOI18N
        jPanel1.add(btnMedicina, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 620, 100, 80));

        pHambre.setBackground(new java.awt.Color(51, 255, 51));
        pHambre.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        pHambre.setForeground(new java.awt.Color(255, 255, 255));
        pHambre.setToolTipText("");
        pHambre.setOpaque(false);
        pHambre.setString("HAMBRE");
        pHambre.setStringPainted(true);
        jPanel1.add(pHambre, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 10, 170, 20));

        pEnergía.setBackground(new java.awt.Color(51, 255, 51));
        pEnergía.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        pEnergía.setForeground(new java.awt.Color(255, 255, 255));
        pEnergía.setToolTipText("");
        pEnergía.setOpaque(false);
        pEnergía.setString("ENERGÍA");
        pEnergía.setStringPainted(true);
        jPanel1.add(pEnergía, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, 170, 20));

        pAburrimiento.setBackground(new java.awt.Color(51, 255, 51));
        pAburrimiento.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        pAburrimiento.setForeground(new java.awt.Color(255, 255, 255));
        pAburrimiento.setToolTipText("");
        pAburrimiento.setOpaque(false);
        pAburrimiento.setString("ABURRIMIENTO");
        pAburrimiento.setStringPainted(true);
        jPanel1.add(pAburrimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 170, 20));

        pSalud.setBackground(new java.awt.Color(51, 255, 51));
        pSalud.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        pSalud.setForeground(new java.awt.Color(255, 255, 255));
        pSalud.setToolTipText("");
        pSalud.setOpaque(false);
        pSalud.setString("SALUD");
        pSalud.setStringPainted(true);
        jPanel1.add(pSalud, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 170, 20));

        Brilo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/brillo.gif"))); // NOI18N
        jPanel1.add(Brilo, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 330, 370, 360));

        Huevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/huevo.png"))); // NOI18N
        jPanel1.add(Huevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 340, 380, 360));

        fondoDia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        jPanel1.add(fondoDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        fondoNoche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo4.jpg"))); // NOI18N
        jPanel1.add(fondoNoche, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCamaronesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCamaronesActionPerformed
///OCULTA EL BOTON DE CAMARONES
        or.quitarHambre(cam.getCantidadDeAlimentación());
        tiempoOcultar(this.btnCamarones, cam.getTiempo());
        System.out.println(cam.getTiempo());
        barrasBar();
       
        


    }//GEN-LAST:event_btnCamaronesActionPerformed

    private void btnRenacuajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRenacuajoActionPerformed
        or.setHambre(ren.getCantidadDeAlimentación());
        tiempoOcultar(this.btnRenacuajo, ren.getTiempo());
    }//GEN-LAST:event_btnRenacuajoActionPerformed

    private void btnAlgasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlgasActionPerformed
        
        or.quitarHambre(al.getCantidadDeAlimentación());
        tiempoOcultar(this.btnAlgas, al.getTiempo());
        barrasBar();
    }//GEN-LAST:event_btnAlgasActionPerformed

    private void btnMoluzcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoluzcoActionPerformed
        or.quitarHambre(mol.getCantidadDeAlimentación());
        tiempoOcultar(this.btnMoluzco, mol.getTiempo());
        barrasBar();
    }//GEN-LAST:event_btnMoluzcoActionPerformed

    private void btnPezActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPezActionPerformed
        or.quitarHambre(pez.getCantidadDeAlimentación());
        tiempoOcultar(this.btnPez, pez.getTiempo());
        barrasBar();
        
    }//GEN-LAST:event_btnPezActionPerformed
    private void tiempoOcultar(JButton boton, int time) {
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

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JuegoPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JuegoPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JuegoPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JuegoPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JuegoPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bebe;
    private javax.swing.JLabel Brilo;
    private javax.swing.JLabel Huevo;
    private javax.swing.JLabel JEnfermo;
    private javax.swing.JLabel Joven;
    private javax.swing.JButton btnAlgas;
    private javax.swing.JButton btnCamarones;
    private javax.swing.JButton btnMedicina;
    private javax.swing.JButton btnMoluzco;
    private javax.swing.JButton btnPez;
    private javax.swing.JButton btnRenacuajo;
    private javax.swing.JLabel fondoDia;
    private javax.swing.JLabel fondoNoche;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar pAburrimiento;
    private javax.swing.JProgressBar pEnergía;
    private javax.swing.JProgressBar pHambre;
    private javax.swing.JProgressBar pSalud;
    private javax.swing.JLabel tEdad;
    // End of variables declaration//GEN-END:variables

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    private void MostrarDiaNoche(JLabel label1, JLabel label2) {
        int tiempo = 1 * 10000;
        Timer timer;
        TimerTask timerTask = new TimerTask() {

            @Override
            public void run() {

                switch (cont) {

                    case 0:
                        cont++;
                        label1.setVisible(true);
                        label2.setVisible(false);
                        contadorDías++;
                        contaS++;
                        habilitarBotones(contadorDías);
                        tipoEdad(contadorDías);
                        bajasEnHambre(contaS);
                        System.out.println(contaS);
                        

                        break;
                    case 1:
                        cont = 0;
                        label1.setVisible(false);
                        label2.setVisible(true);

                        break;

                }

            }

        };

        timer = new Timer();
        timer.schedule(timerTask, 0, tiempo);
    }

    private void tipoEdad(int contadorDías) {//MUESTRA SI ES HUEVO,JOVEN,ADULTO
        if (contadorDías == 2) {
            this.Huevo.setVisible(false);
            this.Brilo.setVisible(false);
            this.Bebe.setVisible(true);
            this.tEdad.setText(or.EdadMascota(1));
        }

        if (contadorDías == 10) {
            this.Bebe.setVisible(false);
            this.Joven.setVisible(true);
            this.tEdad.setText(or.EdadMascota(3));
        }
        if (contadorDías == 15) {
            this.Joven.setVisible(false);
            this.tEdad.setText(or.EdadMascota(3));
        }
    }

    private void bajasEnHambre(int contador) {
        if (contador == 3) {
            contaS=0;
            or.setHambre(15);
            bajasEnSalud();
            barrasBar();
            System.out.println(or.getHambre());
            if (or.getHambre() >= 90) {
                JOptionPane.showMessageDialog(rootPane, "Tiene Hambre");
            }

        }
        

    }
    private void bajasEnSalud(){
    if (or.getHambre()>60) {
            or.setSalud(30);
            barrasBar();
            if (or.getSalud() <=10) {
                JOptionPane.showMessageDialog(rootPane, "Problemas en Salud");
                this.JEnfermo.setVisible(true);
            }else{
            this.JEnfermo.setVisible(false);
            }

        }
    }
    private void bajasEnEnergía(){
    
    }
}

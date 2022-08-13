/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Graficos;

import Alimentación.Camarones;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.util.TimerTask;
import java.util.Timer;

import tamagotchi.Cronometro;
import tamagotchi.Ornitorrinco;

/**
 *
 * @author joans
 */
public class JuegoPrincipal extends javax.swing.JFrame {
//ATRIBUTOS------------------------------------

    private String Nombre;
    Cronometro cron;
    static int cont = 0;
//OBJECTOS-------------------------------------
    Ornitorrinco or = new Ornitorrinco(Nombre);
    Camarones cam = new Camarones();
//---------------------------------------------

    /**
     * Creates new form JuegoPrincipal
     */
    public JuegoPrincipal() {
        initComponents();
        deshabilitarBotones();
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
        this.btnCamarones.setEnabled(true);
        this.btnMoluzco.setEnabled(false);
        this.btnPez.setEnabled(false);
        this.btnRenacuajo.setEnabled(false);
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
        btnCamarones = new javax.swing.JButton();
        btnRenacuajo = new javax.swing.JButton();
        btnAlgas = new javax.swing.JButton();
        btnMoluzco = new javax.swing.JButton();
        btnPez = new javax.swing.JButton();
        btnComprar = new javax.swing.JButton();
        pHambre = new javax.swing.JProgressBar();
        pEnergía = new javax.swing.JProgressBar();
        pAburrimiento = new javax.swing.JProgressBar();
        pSalud = new javax.swing.JProgressBar();
        Brilo = new javax.swing.JLabel();
        Huevo = new javax.swing.JLabel();
        fondoDia = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel1.add(btnRenacuajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        btnAlgas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/algas.png"))); // NOI18N
        btnAlgas.setContentAreaFilled(false);
        jPanel1.add(btnAlgas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        btnMoluzco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/moluzcos.png"))); // NOI18N
        btnMoluzco.setContentAreaFilled(false);
        jPanel1.add(btnMoluzco, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, -1, -1));

        btnPez.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pez.png"))); // NOI18N
        btnPez.setContentAreaFilled(false);
        jPanel1.add(btnPez, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, -1, -1));

        btnComprar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconfinder-basket-4341280_120547.png"))); // NOI18N
        btnComprar.setContentAreaFilled(false);
        btnComprar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/comprar-verde.png"))); // NOI18N
        jPanel1.add(btnComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 620, 100, 80));

        pHambre.setBackground(new java.awt.Color(51, 255, 51));
        pHambre.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        pHambre.setForeground(new java.awt.Color(255, 255, 255));
        pHambre.setToolTipText("");
        pHambre.setOpaque(false);
        pHambre.setString("HAMBRE");
        pHambre.setStringPainted(true);
        jPanel1.add(pHambre, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 10, 170, 20));

        pEnergía.setBackground(new java.awt.Color(51, 255, 51));
        pEnergía.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        pEnergía.setForeground(new java.awt.Color(255, 255, 255));
        pEnergía.setToolTipText("");
        pEnergía.setOpaque(false);
        pEnergía.setString("ENERGÍA");
        pEnergía.setStringPainted(true);
        jPanel1.add(pEnergía, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, 170, 20));

        pAburrimiento.setBackground(new java.awt.Color(51, 255, 51));
        pAburrimiento.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        pAburrimiento.setForeground(new java.awt.Color(255, 255, 255));
        pAburrimiento.setToolTipText("");
        pAburrimiento.setOpaque(false);
        pAburrimiento.setString("ABURRIMIENTO");
        pAburrimiento.setStringPainted(true);
        jPanel1.add(pAburrimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 170, 20));

        pSalud.setBackground(new java.awt.Color(51, 255, 51));
        pSalud.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        pSalud.setForeground(new java.awt.Color(255, 255, 255));
        pSalud.setToolTipText("");
        pSalud.setOpaque(false);
        pSalud.setString("SALUD");
        pSalud.setStringPainted(true);
        jPanel1.add(pSalud, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 170, 20));

        Brilo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/brillo.gif"))); // NOI18N
        jPanel1.add(Brilo, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 330, 370, 360));

        Huevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/huevo.png"))); // NOI18N
        jPanel1.add(Huevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 340, 380, 360));

        fondoDia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        jPanel1.add(fondoDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

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
     or.setHambre(cam.getCantidadDeAlimentación());
        int tiempo = 10 * 1000;
        Timer timer;
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                switch (cont) {
                    case 0:
                        cont++;
                        btnCamarones.setEnabled(false);
                        break;
                    case 1:
                        cont = 0;
                        btnCamarones.setEnabled(true);
                        break;
                }
            }
        };

        timer = new Timer();
        timer.schedule(timerTask, 0, tiempo);
    }//GEN-LAST:event_btnCamaronesActionPerformed

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
    private javax.swing.JLabel Brilo;
    private javax.swing.JLabel Huevo;
    private javax.swing.JButton btnAlgas;
    private javax.swing.JButton btnCamarones;
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnMoluzco;
    private javax.swing.JButton btnPez;
    private javax.swing.JButton btnRenacuajo;
    private javax.swing.JLabel fondoDia;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar pAburrimiento;
    private javax.swing.JProgressBar pEnergía;
    private javax.swing.JProgressBar pHambre;
    private javax.swing.JProgressBar pSalud;
    // End of variables declaration//GEN-END:variables

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

}

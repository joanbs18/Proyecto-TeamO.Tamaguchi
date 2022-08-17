/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Graficos;

/**
 *
 * @author joans
 */
public class JuegoInicio extends javax.swing.JFrame {
private int acumulador=0;
    /**
     * Creates new form JuegoInicio
     */
    public JuegoInicio() {
        initComponents();
      this.setResizable(false);
       ocultar();
    }
    
    private void ocultar(){ //OCULTA LOS SUBTITULOS
       this.Sub1.setVisible(true);
       this.Sub2.setVisible(false);
       this.Sub3.setVisible(false);
       this.Sub4.setVisible(false);
       this.Flecha.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FondoPrincipal = new javax.swing.JPanel();
        Flecha = new javax.swing.JLabel();
        Sub4 = new javax.swing.JLabel();
        Sub3 = new javax.swing.JLabel();
        Sub2 = new javax.swing.JLabel();
        Sub1 = new javax.swing.JLabel();
        btnSiguiente = new javax.swing.JButton();
        DuffHablando = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 720));

        FondoPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Flecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Red-Arrow-PNG-Photo.png"))); // NOI18N
        FondoPrincipal.add(Flecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 610, -1, -1));

        Sub4.setFont(new java.awt.Font("Ebrima", 0, 24)); // NOI18N
        Sub4.setForeground(new java.awt.Color(255, 153, 0));
        Sub4.setText("Toca el Botón de SIGUIENTE para continuar");
        FondoPrincipal.add(Sub4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 610, -1, -1));

        Sub3.setFont(new java.awt.Font("Ebrima", 0, 24)); // NOI18N
        Sub3.setForeground(new java.awt.Color(255, 153, 0));
        Sub3.setText("Puedes ponerle el nombre que tu quieras, que tal si empezamos a ponerle un nombre?");
        FondoPrincipal.add(Sub3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 610, -1, -1));

        Sub2.setFont(new java.awt.Font("Ebrima", 0, 24)); // NOI18N
        Sub2.setForeground(new java.awt.Color(255, 153, 0));
        Sub2.setText("El es un Ornitorrinco Unico, tienes que cuidarlo, darle de comer, llevarlo al baño... etc");
        FondoPrincipal.add(Sub2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 610, -1, -1));

        Sub1.setFont(new java.awt.Font("Ebrima", 0, 24)); // NOI18N
        Sub1.setForeground(new java.awt.Color(255, 153, 0));
        Sub1.setText("Hola Soy Duff, te presento este increible Juego se llama Tamagochí, donde vas a tener que cuiadar a un Ornitorrinco ");
        FondoPrincipal.add(Sub1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, -1, -1));

        btnSiguiente.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        FondoPrincipal.add(btnSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 670, 100, 30));

        DuffHablando.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mi video.gif"))); // NOI18N
        FondoPrincipal.add(DuffHablando, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
       acumulador++;
       if (acumulador==1){
       this.Sub1.setVisible(false);
       this.Sub2.setVisible(true);
       this.Sub3.setVisible(false);
       this.Sub4.setVisible(false);
       }
       if(acumulador==2){
       this.Sub2.setVisible(false);
       this.Sub3.setVisible(true);
       }
       if(acumulador==3){
       this.Sub3.setVisible(false);
       this.Sub4.setVisible(true);
       this.Flecha.setVisible(true);
       }
       if(acumulador==4){
         JuegoNombre juego = new JuegoNombre();
       juego.setVisible(true);
        this.dispose();
       }
       
    }//GEN-LAST:event_btnSiguienteActionPerformed

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
            java.util.logging.Logger.getLogger(JuegoInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JuegoInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JuegoInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JuegoInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JuegoInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DuffHablando;
    private javax.swing.JLabel Flecha;
    private javax.swing.JPanel FondoPrincipal;
    private javax.swing.JLabel Sub1;
    private javax.swing.JLabel Sub2;
    private javax.swing.JLabel Sub3;
    private javax.swing.JLabel Sub4;
    private javax.swing.JButton btnSiguiente;
    // End of variables declaration//GEN-END:variables
}

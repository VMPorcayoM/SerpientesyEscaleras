package serpientesyescaleras;

import javax.swing.JOptionPane;

public class Usuarios extends javax.swing.JFrame {
    private Inicio origen;
    private String modo;
    private int posIconoJug1, posIconoJug2;
    public Usuarios(String modo) {
        this.modo=modo;               
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setLayout(null);        
        this.setSize(450, 520);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoJugador1 = new javax.swing.ButtonGroup();
        grupoJugador2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombre1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombre2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        icono1Jug1 = new javax.swing.JToggleButton();
        icono2Jug1 = new javax.swing.JToggleButton();
        icono3Jug1 = new javax.swing.JToggleButton();
        icono4Jug1 = new javax.swing.JToggleButton();
        btnContinuar = new javax.swing.JButton();
        icono4Jug2 = new javax.swing.JToggleButton();
        icono3Jug2 = new javax.swing.JToggleButton();
        icono2Jug2 = new javax.swing.JToggleButton();
        icono1Jug2 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Personaliza Jugadores");

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 16)); // NOI18N
        jLabel1.setText("Personaliza a jugadores");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Jugador 1");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setText("Nickname");

        txtNombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombre1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Jugador 2");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel5.setText("Nickname");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel6.setText("Elige un icono para el jugador 2");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel7.setText("Elige un icono para el jugador 1");

        grupoJugador1.add(icono1Jug1);
        icono1Jug1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/0.png"))); // NOI18N
        icono1Jug1.setBorder(null);
        icono1Jug1.setBorderPainted(false);
        icono1Jug1.setOpaque(false);

        grupoJugador1.add(icono2Jug1);
        icono2Jug1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1.png"))); // NOI18N
        icono2Jug1.setBorderPainted(false);
        icono2Jug1.setOpaque(false);

        grupoJugador1.add(icono3Jug1);
        icono3Jug1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/2.png"))); // NOI18N
        icono3Jug1.setBorderPainted(false);
        icono3Jug1.setOpaque(false);
        icono3Jug1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                icono3Jug1ActionPerformed(evt);
            }
        });

        grupoJugador1.add(icono4Jug1);
        icono4Jug1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/3.png"))); // NOI18N
        icono4Jug1.setBorderPainted(false);
        icono4Jug1.setOpaque(false);

        btnContinuar.setText("Continuar");
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });

        grupoJugador2.add(icono4Jug2);
        icono4Jug2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/3.png"))); // NOI18N
        icono4Jug2.setBorderPainted(false);
        icono4Jug2.setOpaque(false);

        grupoJugador2.add(icono3Jug2);
        icono3Jug2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/2.png"))); // NOI18N
        icono3Jug2.setBorderPainted(false);
        icono3Jug2.setOpaque(false);

        grupoJugador2.add(icono2Jug2);
        icono2Jug2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1.png"))); // NOI18N
        icono2Jug2.setBorderPainted(false);
        icono2Jug2.setOpaque(false);

        grupoJugador2.add(icono1Jug2);
        icono1Jug2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/0.png"))); // NOI18N
        icono1Jug2.setBorderPainted(false);
        icono1Jug2.setOpaque(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(icono1Jug1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(icono2Jug1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(icono3Jug1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(icono4Jug1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(icono1Jug2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(icono2Jug2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(icono3Jug2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(icono4Jug2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnContinuar))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(icono1Jug1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(icono2Jug1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(icono3Jug1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(icono4Jug1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(icono1Jug2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(icono2Jug2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(icono3Jug2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(icono4Jug2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnContinuar)
                .addGap(0, 17, Short.MAX_VALUE))
        );

        icono1Jug1.getAccessibleContext().setAccessibleName("0");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void icono3Jug1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_icono3Jug1ActionPerformed
        
    }//GEN-LAST:event_icono3Jug1ActionPerformed

    private void txtNombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombre1ActionPerformed
       
    }//GEN-LAST:event_txtNombre1ActionPerformed

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        if(txtNombre1.getText().isEmpty() || txtNombre2.getText().isEmpty() || txtNombre1.getText().equals(txtNombre2.getText())){
            JOptionPane.showMessageDialog(null, "¡Nombra a ambos jugadores!", "Información erronea", JOptionPane.WARNING_MESSAGE);
            return;
        }  
        if(iconosSeleccionados()==false){
            JOptionPane.showMessageDialog(null, "¡Elige distintos iconos!", "Información erronea", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Tablero t=new Tablero(modo, posIconoJug1, posIconoJug2);   
        Juego j=new Juego();        
        t.setVisible(true);
        j.setVisible(true);
        t.setOrigen(origen);
        t.setJ(j);
        j.setOrigen(t);
        j.setNombresIconos(txtNombre1.getText(), txtNombre2.getText(), posIconoJug1, posIconoJug2);                
        t.setNombre1(txtNombre1.getText());
        t.setNombre2(txtNombre2.getText());
        this.dispose();
    }//GEN-LAST:event_btnContinuarActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {    
                
            }
        });
    }
    private boolean iconosSeleccionados(){
        if(grupoJugador1.getSelection()==icono1Jug1.getModel())
            posIconoJug1=0;
        else if(grupoJugador1.getSelection()==icono2Jug1.getModel())
            posIconoJug1=1;
        else if(grupoJugador1.getSelection()==icono3Jug1.getModel())
            posIconoJug1=2;
        else if(grupoJugador1.getSelection()==icono4Jug1.getModel()){
            posIconoJug1=3;
        }
        if(grupoJugador2.getSelection()==icono1Jug2.getModel())
            posIconoJug2=0;
        else if(grupoJugador2.getSelection()==icono2Jug2.getModel())
            posIconoJug2=1;
        else if(grupoJugador2.getSelection()==icono3Jug2.getModel())
            posIconoJug2=2;
        else if(grupoJugador2.getSelection()==icono4Jug2.getModel())
            posIconoJug2=3;
        
        return posIconoJug1 != posIconoJug2;
    }
    public Inicio getOrigen() {
        return origen;
    }
    public void setOrigen(Inicio origen) {
        this.origen = origen;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContinuar;
    private javax.swing.ButtonGroup grupoJugador1;
    private javax.swing.ButtonGroup grupoJugador2;
    private javax.swing.JToggleButton icono1Jug1;
    private javax.swing.JToggleButton icono1Jug2;
    private javax.swing.JToggleButton icono2Jug1;
    private javax.swing.JToggleButton icono2Jug2;
    private javax.swing.JToggleButton icono3Jug1;
    private javax.swing.JToggleButton icono3Jug2;
    private javax.swing.JToggleButton icono4Jug1;
    private javax.swing.JToggleButton icono4Jug2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtNombre1;
    private javax.swing.JTextField txtNombre2;
    // End of variables declaration//GEN-END:variables
}

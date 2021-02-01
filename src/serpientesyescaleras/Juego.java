package serpientesyescaleras;
import dado.Dado;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
public class Juego extends javax.swing.JFrame {
    
    private Tablero origen;
    private String jugador1, jugador2;     
    private int avanza;
    private String turnoActual;    
    public Juego() {
        initComponents();
        this.setLocation(1090, 14);    
        turnoActual=jugador1;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblJugador1 = new javax.swing.JLabel();
        lblJugador2 = new javax.swing.JLabel();
        lblIcono2 = new javax.swing.JLabel();
        lblIcono1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblTurno = new javax.swing.JLabel();
        btnLanzar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblDado = new javax.swing.JLabel();
        lblEscaleraSerpiente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(500, 100));

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 20)); // NOI18N
        jLabel1.setText("Progreso de juego");

        lblJugador1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblJugador1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJugador1.setAutoscrolls(true);
        lblJugador1.setMaximumSize(new java.awt.Dimension(100, 0));

        lblJugador2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblJugador2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJugador2.setMaximumSize(new java.awt.Dimension(100, 0));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Es turno de ");

        lblTurno.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        btnLanzar.setText("Lanzar Dado");
        btnLanzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLanzarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Avanza: ");

        lblDado.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblDado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        lblEscaleraSerpiente.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblEscaleraSerpiente.setForeground(new java.awt.Color(255, 0, 0));
        lblEscaleraSerpiente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(lblJugador1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblJugador2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblIcono2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblIcono1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblDado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnLanzar)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblEscaleraSerpiente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(lblJugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)
                        .addComponent(lblJugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblIcono1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblIcono2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(lblTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnLanzar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblDado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEscaleraSerpiente, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLanzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLanzarActionPerformed
        
        avanza=Dado.lanzar(6);
        lblDado.setText(avanza+" para "+turnoActual);
        origen.moverIcono(turnoActual, avanza);
        if(turnoActual.equals(jugador1))
            turnoActual=jugador2;
        else
            turnoActual=jugador1;
        lblTurno.setText(turnoActual);
        btnLanzar.setText("Lanzar dado de "+turnoActual);
        
    }//GEN-LAST:event_btnLanzarActionPerformed
    public void setLblEscaleraSerpiente(String text){
        lblEscaleraSerpiente.setText(text);
    }
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {                
            }
        });
    }
    public void setNombresIconos(String n1, String n2, int i1, int i2){
        jugador1=n1;
        jugador2=n2;
        lblJugador1.setText(n1);
        lblJugador2.setText(n2);
        lblIcono1.setIcon(new ImageIcon("src\\iconos\\"+i1+".png"));
        lblIcono2.setIcon(new ImageIcon("src\\iconos\\"+i2+".png"));  
        turno(n1);    
        turnoActual=jugador1;
        btnLanzar.setText("Lanzar dado de "+turnoActual);
    }

    public Tablero getOrigen() {
        return origen;
    }

    public void setOrigen(Tablero tablero) {
        this.origen = tablero;
    }
    private void turno(String turno){
        lblTurno.setText(turno);        
    }    

    public JLabel getLblEscaleraSerpiente() {
        return lblEscaleraSerpiente;
    }


    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLanzar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblDado;
    private javax.swing.JLabel lblEscaleraSerpiente;
    private javax.swing.JLabel lblIcono1;
    private javax.swing.JLabel lblIcono2;
    private javax.swing.JLabel lblJugador1;
    private javax.swing.JLabel lblJugador2;
    private javax.swing.JLabel lblTurno;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

/**
 *
 * @author Sergio Ramos
 */
public class TelaOpcao extends javax.swing.JFrame {

    public TelaOpcao() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonCarPol = new javax.swing.JButton();
        jButtonPolCar = new javax.swing.JButton();
        jButtonCarEsf = new javax.swing.JButton();
        jButtonEsfCar = new javax.swing.JButton();
        jButtonCarCil = new javax.swing.JButton();
        jButtonCilCar = new javax.swing.JButton();
        jLabelTextTela = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabelFundoOpcao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButtonCarPol.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonCarPol.setText("Cartesianas p/ Polares");
        jButtonCarPol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCarPolActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCarPol);
        jButtonCarPol.setBounds(280, 110, 270, 60);

        jButtonPolCar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonPolCar.setText("Polares p/ Cartesianas");
        jButtonPolCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPolCarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPolCar);
        jButtonPolCar.setBounds(610, 110, 270, 60);

        jButtonCarEsf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonCarEsf.setText("Cartesianas p/ Esfericas");
        jButtonCarEsf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCarEsfActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCarEsf);
        jButtonCarEsf.setBounds(280, 240, 270, 60);

        jButtonEsfCar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonEsfCar.setText("Esfericas p/ Cartesianas");
        jButtonEsfCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEsfCarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEsfCar);
        jButtonEsfCar.setBounds(610, 240, 270, 60);

        jButtonCarCil.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonCarCil.setText("Cartesianas p/ Cilindricas");
        jButtonCarCil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCarCilActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCarCil);
        jButtonCarCil.setBounds(280, 390, 270, 60);

        jButtonCilCar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonCilCar.setText("Cilindricas p/ Cartesianas");
        jButtonCilCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCilCarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCilCar);
        jButtonCilCar.setBounds(610, 390, 270, 60);

        jLabelTextTela.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        jLabelTextTela.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        jLabelTextTela.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTextTela.setText("Conversão de Coordenadas");
        jLabelTextTela.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jLabelTextTela);
        jLabelTextTela.setBounds(360, 30, 480, 40);

        jLabel1.setFont(new java.awt.Font("MV Boli", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Powered by Sergio Ramos");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(850, 560, 310, 30);

        jLabelFundoOpcao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo2.png"))); // NOI18N
        getContentPane().add(jLabelFundoOpcao);
        jLabelFundoOpcao.setBounds(0, 0, 1170, 589);

        setSize(new java.awt.Dimension(1188, 628));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCilCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCilCarActionPerformed
        Selecao6 tela = new Selecao6();
        tela.setVisible(true);
    }//GEN-LAST:event_jButtonCilCarActionPerformed

    private void jButtonCarCilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCarCilActionPerformed
        Selecao5 tela = new Selecao5();
        tela.setVisible(true);
    }//GEN-LAST:event_jButtonCarCilActionPerformed

    private void jButtonCarEsfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCarEsfActionPerformed
        Selecao3 tela = new Selecao3();
        tela.setVisible(true);
    }//GEN-LAST:event_jButtonCarEsfActionPerformed

    private void jButtonEsfCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEsfCarActionPerformed
        Selecao4 tela = new Selecao4();
        tela.setVisible(true);
    }//GEN-LAST:event_jButtonEsfCarActionPerformed

    private void jButtonCarPolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCarPolActionPerformed
        Selecao1 tela = new Selecao1();
        tela.setVisible(true);
    }//GEN-LAST:event_jButtonCarPolActionPerformed

    private void jButtonPolCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPolCarActionPerformed
        Selecao2 tela = new Selecao2();
        tela.setVisible(true);
    }//GEN-LAST:event_jButtonPolCarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaOpcao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaOpcao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaOpcao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaOpcao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaOpcao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCarCil;
    private javax.swing.JButton jButtonCarEsf;
    private javax.swing.JButton jButtonCarPol;
    private javax.swing.JButton jButtonCilCar;
    private javax.swing.JButton jButtonEsfCar;
    private javax.swing.JButton jButtonPolCar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelFundoOpcao;
    private javax.swing.JLabel jLabelTextTela;
    // End of variables declaration//GEN-END:variables
}

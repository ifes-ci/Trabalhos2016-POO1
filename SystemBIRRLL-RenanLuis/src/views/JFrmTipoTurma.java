/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

/**
 *
 * @author Lamon's House
 */
public class JFrmTipoTurma extends javax.swing.JFrame {

    /**
     * Creates new form JFrmTipoTurma
     */
    public JFrmTipoTurma() {
        initComponents();
        btExcluirTipoTurma.setOpaque(false);
        btExcluirTipoTurma.setContentAreaFilled(false);
        btExcluirTipoTurma.setBorderPainted(false);
        btAddTipoTurma.setOpaque(false);
        btAddTipoTurma.setContentAreaFilled(false);
        btAddTipoTurma.setBorderPainted(false);
        btAlterarTipoTurma.setOpaque(false);
        btAlterarTipoTurma.setContentAreaFilled(false);
        btAlterarTipoTurma.setBorderPainted(false);
        btListarTiposTurma.setOpaque(false);
        btListarTiposTurma.setContentAreaFilled(false);
        btListarTiposTurma.setBorderPainted(false);
        btVoltar.setOpaque(false);
        btVoltar.setContentAreaFilled(false);
        btVoltar.setBorderPainted(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btAddTipoTurma = new javax.swing.JButton();
        btExcluirTipoTurma = new javax.swing.JButton();
        btAlterarTipoTurma = new javax.swing.JButton();
        btListarTiposTurma = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
        });

        btAddTipoTurma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/AddTipoTurma.png"))); // NOI18N
        btAddTipoTurma.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btAddTipoTurma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btAddTipoTurmaMouseEntered(evt);
            }
        });
        btAddTipoTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddTipoTurmaActionPerformed(evt);
            }
        });

        btExcluirTipoTurma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/ExcluirTipoTurma.png"))); // NOI18N
        btExcluirTipoTurma.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btExcluirTipoTurma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btExcluirTipoTurmaMouseEntered(evt);
            }
        });
        btExcluirTipoTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirTipoTurmaActionPerformed(evt);
            }
        });

        btAlterarTipoTurma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/TipoTurmaAtualiza.png"))); // NOI18N
        btAlterarTipoTurma.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btAlterarTipoTurma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btAlterarTipoTurmaMouseEntered(evt);
            }
        });
        btAlterarTipoTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarTipoTurmaActionPerformed(evt);
            }
        });

        btListarTiposTurma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/ListarTipoTurma.png"))); // NOI18N
        btListarTiposTurma.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btListarTiposTurma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btListarTiposTurmaMouseEntered(evt);
            }
        });
        btListarTiposTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListarTiposTurmaActionPerformed(evt);
            }
        });

        btVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/Voltar.png"))); // NOI18N
        btVoltar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btVoltarMouseEntered(evt);
            }
        });
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Adicionar Tipo Turma");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Alterar Tipo Turma");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Excluir Tipo Turma");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Listar Tipos Turma");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btVoltar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(btExcluirTipoTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(btAddTipoTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btListarTiposTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAlterarTipoTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addGap(48, 48, 48))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btAlterarTipoTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btAddTipoTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btExcluirTipoTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btListarTiposTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(btVoltar)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btAlterarTipoTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarTipoTurmaActionPerformed
        // TODO add your handling code here:
        this.dispose();
        JFrmAlterarTipoTurma att = new JFrmAlterarTipoTurma();
        att.setVisible(true);
    }//GEN-LAST:event_btAlterarTipoTurmaActionPerformed

    private void btListarTiposTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListarTiposTurmaActionPerformed
        // TODO add your handling code here:
        this.dispose();
        JFrmListarTipoTurma lc = new JFrmListarTipoTurma();
        lc.setVisible(true);
    }//GEN-LAST:event_btListarTiposTurmaActionPerformed

    private void btAddTipoTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddTipoTurmaActionPerformed
        // TODO add your handling code here:
        this.dispose();
        JFrmAddTipoTurma tp = new JFrmAddTipoTurma();
        tp.setVisible(true);
    }//GEN-LAST:event_btAddTipoTurmaActionPerformed

    private void btExcluirTipoTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirTipoTurmaActionPerformed
        // TODO add your handling code here:
        this.dispose();
        JFrmExcluirTipoTurma etp = new JFrmExcluirTipoTurma();
        etp.setVisible(true);
    }//GEN-LAST:event_btExcluirTipoTurmaActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        // TODO add your handling code here:
        this.dispose();
        JFrmMenu m = new JFrmMenu();
        m.setVisible(true);
    }//GEN-LAST:event_btVoltarActionPerformed

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        // TODO add your handling code here:
        btExcluirTipoTurma.setOpaque(false);
        btExcluirTipoTurma.setContentAreaFilled(false);
        btExcluirTipoTurma.setBorderPainted(false);
        btAddTipoTurma.setOpaque(false);
        btAddTipoTurma.setContentAreaFilled(false);
        btAddTipoTurma.setBorderPainted(false);
        btAlterarTipoTurma.setOpaque(false);
        btAlterarTipoTurma.setContentAreaFilled(false);
        btAlterarTipoTurma.setBorderPainted(false);
        btListarTiposTurma.setOpaque(false);
        btListarTiposTurma.setContentAreaFilled(false);
        btListarTiposTurma.setBorderPainted(false);
        btVoltar.setOpaque(false);
        btVoltar.setContentAreaFilled(false);
        btVoltar.setBorderPainted(false);
    }//GEN-LAST:event_formMouseEntered

    private void btAddTipoTurmaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAddTipoTurmaMouseEntered
        // TODO add your handling code here:
        btAddTipoTurma.setOpaque(true);
        btAddTipoTurma.setContentAreaFilled(true);
        btAddTipoTurma.setBorderPainted(true);
        btAddTipoTurma.setBackground(java.awt.Color.GRAY);
    }//GEN-LAST:event_btAddTipoTurmaMouseEntered

    private void btAlterarTipoTurmaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAlterarTipoTurmaMouseEntered
        // TODO add your handling code here:
        btAlterarTipoTurma.setOpaque(true);
        btAlterarTipoTurma.setContentAreaFilled(true);
        btAlterarTipoTurma.setBorderPainted(true);
        btAlterarTipoTurma.setBackground(java.awt.Color.GRAY);
    }//GEN-LAST:event_btAlterarTipoTurmaMouseEntered

    private void btExcluirTipoTurmaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btExcluirTipoTurmaMouseEntered
        // TODO add your handling code here:
        btExcluirTipoTurma.setOpaque(true);
        btExcluirTipoTurma.setContentAreaFilled(true);
        btExcluirTipoTurma.setBorderPainted(true);
        btExcluirTipoTurma.setBackground(java.awt.Color.GRAY);
    }//GEN-LAST:event_btExcluirTipoTurmaMouseEntered

    private void btListarTiposTurmaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btListarTiposTurmaMouseEntered
        // TODO add your handling code here:
        btListarTiposTurma.setOpaque(true);
        btListarTiposTurma.setContentAreaFilled(true);
        btListarTiposTurma.setBorderPainted(true);
        btListarTiposTurma.setBackground(java.awt.Color.GRAY);
    }//GEN-LAST:event_btListarTiposTurmaMouseEntered

    private void btVoltarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btVoltarMouseEntered
        // TODO add your handling code here:
        btVoltar.setOpaque(true);
        btVoltar.setContentAreaFilled(true);
        btVoltar.setBorderPainted(true);
        btVoltar.setBackground(java.awt.Color.GRAY);
    }//GEN-LAST:event_btVoltarMouseEntered

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
            java.util.logging.Logger.getLogger(JFrmTipoTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrmTipoTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrmTipoTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrmTipoTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrmTipoTurma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAddTipoTurma;
    private javax.swing.JButton btAlterarTipoTurma;
    private javax.swing.JButton btExcluirTipoTurma;
    private javax.swing.JButton btListarTiposTurma;
    private javax.swing.JButton btVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}

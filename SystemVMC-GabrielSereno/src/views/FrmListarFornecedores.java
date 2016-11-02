/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package views;

import crud.FornecedorCRUD;
import domain.Fornecedor;
import java.util.ArrayList;
import models.FornecedorTableModel;



/**
 *
 * @author Gabriel dos Santos Sereno <gabrielf2@live.com>
 */
public class FrmListarFornecedores extends javax.swing.JFrame {

    /**
     * Creates new form ListarClientes
     */
    public FrmListarFornecedores() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfProcurarFornecedor = new javax.swing.JTextField();
        btProcurarFornecedor = new javax.swing.JButton();
        btListarTodos = new javax.swing.JButton();
        btCadastrarFornecedor = new javax.swing.JButton();
        btAlterarFornecedor = new javax.swing.JButton();
        btExcluirFornecedor = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tFornecedor = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1166, 700));

        btProcurarFornecedor.setText("Procurar Fornecedor");
        btProcurarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProcurarFornecedorActionPerformed(evt);
            }
        });

        btListarTodos.setText("Listar Todos");
        btListarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListarTodosActionPerformed(evt);
            }
        });

        btCadastrarFornecedor.setText("Cadastrar Fornecedor");
        btCadastrarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarFornecedorActionPerformed(evt);
            }
        });

        btAlterarFornecedor.setText("Alterar Fornecedor");
        btAlterarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarFornecedorActionPerformed(evt);
            }
        });

        btExcluirFornecedor.setText("Excluir Fornecedor");
        btExcluirFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirFornecedorActionPerformed(evt);
            }
        });

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(tFornecedor);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfProcurarFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btProcurarFornecedor)
                        .addGap(40, 40, 40)
                        .addComponent(btListarTodos))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btCadastrarFornecedor)
                            .addGap(31, 31, 31)
                            .addComponent(btAlterarFornecedor)
                            .addGap(35, 35, 35)
                            .addComponent(btExcluirFornecedor)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1087, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfProcurarFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btProcurarFornecedor)
                    .addComponent(btListarTodos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrarFornecedor)
                    .addComponent(btAlterarFornecedor)
                    .addComponent(btExcluirFornecedor)
                    .addComponent(btSair))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
   
    private void btListarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListarTodosActionPerformed
         tFornecedor.setModel(new FornecedorTableModel(FornecedorCRUD.listar()));
    }//GEN-LAST:event_btListarTodosActionPerformed

    private void btCadastrarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarFornecedorActionPerformed
        FrmCadastrarFornecedor addFornecedor = new FrmCadastrarFornecedor();
        addFornecedor.setVisible(true);
    }//GEN-LAST:event_btCadastrarFornecedorActionPerformed

    private void btAlterarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarFornecedorActionPerformed
        Fornecedor fornecedor;
        fornecedor = new Fornecedor();
        fornecedor = ((FornecedorTableModel)tFornecedor.getModel()).getFornecedor(tFornecedor.getSelectedRow());
        FrmAlterarFornecedor altFornecedor = new FrmAlterarFornecedor(fornecedor);
        altFornecedor.setVisible(true);
    }//GEN-LAST:event_btAlterarFornecedorActionPerformed

    private void btExcluirFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirFornecedorActionPerformed
        Fornecedor fornecedor = new Fornecedor();
        fornecedor = ((FornecedorTableModel)tFornecedor.getModel()).getFornecedor(tFornecedor.getSelectedRow());
        FornecedorCRUD.excluir(fornecedor);
    }//GEN-LAST:event_btExcluirFornecedorActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void btProcurarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProcurarFornecedorActionPerformed
        String nome = tfProcurarFornecedor.getText();
        Fornecedor fornecedor = new Fornecedor();
        fornecedor = FornecedorCRUD.listar(nome);
        ArrayList <Fornecedor> aux = new ArrayList<>();
        aux.add(fornecedor);
        tFornecedor.setModel(new FornecedorTableModel(aux));
    }//GEN-LAST:event_btProcurarFornecedorActionPerformed

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
            java.util.logging.Logger.getLogger(FrmListarFornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmListarFornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmListarFornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmListarFornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmListarFornecedores().setVisible(true);
            
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterarFornecedor;
    private javax.swing.JButton btCadastrarFornecedor;
    private javax.swing.JButton btExcluirFornecedor;
    private javax.swing.JButton btListarTodos;
    private javax.swing.JButton btProcurarFornecedor;
    private javax.swing.JButton btSair;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tFornecedor;
    private javax.swing.JTextField tfProcurarFornecedor;
    // End of variables declaration//GEN-END:variables
}
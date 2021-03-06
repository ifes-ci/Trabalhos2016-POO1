/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import javax.swing.JOptionPane;
import Crud.CrudFuncao;


/**
 *
 * @author Thiago Mendes, Marlon Linhares
 */
public class IFrmNovaFuncao extends javax.swing.JInternalFrame {

    /**
     * Creates new form IFrmNovaFunçao
     */
    public IFrmNovaFuncao() {
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

        jLabel1 = new javax.swing.JLabel();
        jlDescFuncao = new javax.swing.JLabel();
        jlSalario = new javax.swing.JLabel();
        tfDescFunc = new javax.swing.JTextField();
        jbCancelarFunc = new javax.swing.JButton();
        jbCadastrarFunc = new javax.swing.JButton();
        tfSalarioFunc = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Informe os dados da nova Função");

        jlDescFuncao.setText("Descrição");

        jlSalario.setText("Salário");

        jbCancelarFunc.setText("Cancelar");
        jbCancelarFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarFuncActionPerformed(evt);
            }
        });

        jbCadastrarFunc.setText("Cadastrar");
        jbCadastrarFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastrarFuncActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(100, 100, 100))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlSalario)
                            .addComponent(jlDescFuncao))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfDescFunc)
                            .addComponent(tfSalarioFunc, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE))
                        .addGap(81, 81, 81))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbCancelarFunc)
                        .addGap(29, 29, 29)
                        .addComponent(jbCadastrarFunc)
                        .addGap(36, 36, 36))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDescFuncao)
                    .addComponent(tfDescFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlSalario)
                    .addComponent(tfSalarioFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCancelarFunc)
                    .addComponent(jbCadastrarFunc))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCadastrarFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarFuncActionPerformed
        CrudFuncao crudFuncao = new CrudFuncao();
        crudFuncao.novaFuncao(tfDescFunc.getText(), Double.parseDouble(tfSalarioFunc.getText()));
        JOptionPane.showMessageDialog(null, "Nova Função Cadastrada!");
        this.dispose();
    }//GEN-LAST:event_jbCadastrarFuncActionPerformed

    private void jbCancelarFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarFuncActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbCancelarFuncActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbCadastrarFunc;
    private javax.swing.JButton jbCancelarFunc;
    private javax.swing.JLabel jlDescFuncao;
    private javax.swing.JLabel jlSalario;
    private javax.swing.JTextField tfDescFunc;
    private javax.swing.JTextField tfSalarioFunc;
    // End of variables declaration//GEN-END:variables
}

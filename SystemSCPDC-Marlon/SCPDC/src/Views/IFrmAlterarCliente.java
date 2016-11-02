/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import javax.swing.JOptionPane;
import Crud.CrudCliente;
import Domain.Cliente;

/**
 *
 * @author thiag
 */
public class IFrmAlterarCliente extends javax.swing.JInternalFrame {
    Cliente c;
    /**
     * Creates new form IFrmNovoCliente
     */
    public IFrmAlterarCliente(Cliente cliente) {
        initComponents();
        this.c = cliente;
        tfAlterarNomeCliente.setText(c.getNome());
        tfAlterarCNPJ.setText(c.getCnpj());
        tfAlterarTelefoneCliente.setText(c.getTelefone());
        tfAlterarUF.setText(c.getUf());
        tfAlterarCidadeCliente.setText(c.getCidade());
        tfAlterarBairroCliente.setText(c.getBairro());
        tfAlterarRuaCliente.setText(c.getRua());
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
        tfAlterarNomeCliente = new javax.swing.JTextField();
        lbAlterarNomeCliente = new javax.swing.JLabel();
        lbAlterarCNPJ = new javax.swing.JLabel();
        tfAlterarCNPJ = new javax.swing.JTextField();
        lbAlterarTelefoneCliente = new javax.swing.JLabel();
        tfAlterarTelefoneCliente = new javax.swing.JTextField();
        lbAlterarUF = new javax.swing.JLabel();
        tfAlterarUF = new javax.swing.JTextField();
        lbAlterarCidadeCliente = new javax.swing.JLabel();
        tfAlterarCidadeCliente = new javax.swing.JTextField();
        lbAlterarBairroCliente = new javax.swing.JLabel();
        lbAlterarRuaCliente = new javax.swing.JLabel();
        tfAlterarBairroCliente = new javax.swing.JTextField();
        tfAlterarRuaCliente = new javax.swing.JTextField();
        btAlterarCliente = new javax.swing.JButton();
        btCancelarAlterarCliente = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setTitle("Alterar Cliente");

        lbAlterarNomeCliente.setText("Nome");

        lbAlterarCNPJ.setText("CNPJ");

        lbAlterarTelefoneCliente.setText("Telefone");

        lbAlterarUF.setText("UF");

        lbAlterarCidadeCliente.setText("Cidade");

        lbAlterarBairroCliente.setText("Bairro");

        lbAlterarRuaCliente.setText("Rua");

        tfAlterarRuaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAlterarRuaClienteActionPerformed(evt);
            }
        });

        btAlterarCliente.setText("Alterar");
        btAlterarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarClienteActionPerformed(evt);
            }
        });

        btCancelarAlterarCliente.setText("Cancelar");
        btCancelarAlterarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarAlterarClienteActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Informe os dados do Cliente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbAlterarNomeCliente)
                            .addComponent(lbAlterarCNPJ)
                            .addComponent(lbAlterarTelefoneCliente)
                            .addComponent(lbAlterarUF)
                            .addComponent(lbAlterarCidadeCliente)
                            .addComponent(lbAlterarBairroCliente)
                            .addComponent(lbAlterarRuaCliente))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfAlterarNomeCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                            .addComponent(tfAlterarCidadeCliente)
                            .addComponent(tfAlterarBairroCliente)
                            .addComponent(tfAlterarRuaCliente)
                            .addComponent(tfAlterarUF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tfAlterarTelefoneCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                .addComponent(tfAlterarCNPJ, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 234, Short.MAX_VALUE)
                        .addComponent(btCancelarAlterarCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btAlterarCliente)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfAlterarNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAlterarNomeCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfAlterarCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAlterarCNPJ))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfAlterarTelefoneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAlterarTelefoneCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfAlterarUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAlterarUF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAlterarCidadeCliente)
                    .addComponent(tfAlterarCidadeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfAlterarBairroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAlterarBairroCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfAlterarRuaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAlterarRuaCliente))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAlterarCliente)
                    .addComponent(btCancelarAlterarCliente))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAlterarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarClienteActionPerformed
        CrudCliente crudCliente = new CrudCliente();
        crudCliente.AlterarCliente(c, tfAlterarNomeCliente.getText(), tfAlterarCNPJ.getText(), 
            tfAlterarTelefoneCliente.getText(), tfAlterarUF.getText(), 
            tfAlterarCidadeCliente.getText(), tfAlterarBairroCliente.getText(), 
            tfAlterarRuaCliente.getText());
        JOptionPane.showMessageDialog(null, "Cliente Alterado!");
        this.dispose();
    }//GEN-LAST:event_btAlterarClienteActionPerformed

    private void btCancelarAlterarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarAlterarClienteActionPerformed
        JOptionPane.showMessageDialog(null, "Cancelado!");
        this.dispose();
    }//GEN-LAST:event_btCancelarAlterarClienteActionPerformed

    private void tfAlterarRuaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAlterarRuaClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAlterarRuaClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterarCliente;
    private javax.swing.JButton btCancelarAlterarCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbAlterarBairroCliente;
    private javax.swing.JLabel lbAlterarCNPJ;
    private javax.swing.JLabel lbAlterarCidadeCliente;
    private javax.swing.JLabel lbAlterarNomeCliente;
    private javax.swing.JLabel lbAlterarRuaCliente;
    private javax.swing.JLabel lbAlterarTelefoneCliente;
    private javax.swing.JLabel lbAlterarUF;
    private javax.swing.JTextField tfAlterarBairroCliente;
    private javax.swing.JTextField tfAlterarCNPJ;
    private javax.swing.JTextField tfAlterarCidadeCliente;
    private javax.swing.JTextField tfAlterarNomeCliente;
    private javax.swing.JTextField tfAlterarRuaCliente;
    private javax.swing.JTextField tfAlterarTelefoneCliente;
    private javax.swing.JTextField tfAlterarUF;
    // End of variables declaration//GEN-END:variables
}

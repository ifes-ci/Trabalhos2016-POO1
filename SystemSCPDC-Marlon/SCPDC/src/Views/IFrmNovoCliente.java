/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import javax.swing.JOptionPane;
import Crud.CrudCliente;

/**
 *
 * @author thiag
 */
public class IFrmNovoCliente extends javax.swing.JInternalFrame {

    /**
     * Creates new form IFrmNovoCliente
     */
    public IFrmNovoCliente() {
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
        tfNomeCliente = new javax.swing.JTextField();
        lbNomeCliente = new javax.swing.JLabel();
        lbCNPJ = new javax.swing.JLabel();
        tfCNPJ = new javax.swing.JTextField();
        lbTelefoneCliente = new javax.swing.JLabel();
        tfTelefoneCliente = new javax.swing.JTextField();
        lbUF = new javax.swing.JLabel();
        tfUF = new javax.swing.JTextField();
        lbCidadeCliente = new javax.swing.JLabel();
        tfCidadeCliente = new javax.swing.JTextField();
        lbBairroCliente = new javax.swing.JLabel();
        lbRuaCliente = new javax.swing.JLabel();
        tfBairroCliente = new javax.swing.JTextField();
        tfRuaCliente = new javax.swing.JTextField();
        btCadastrarCliente = new javax.swing.JButton();
        btCancelarCadastroCliente = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setTitle("Cadastro de Novo Cliente");

        lbNomeCliente.setText("Nome");

        lbCNPJ.setText("CNPJ");

        lbTelefoneCliente.setText("Telefone");

        lbUF.setText("UF");

        lbCidadeCliente.setText("Cidade");

        lbBairroCliente.setText("Bairro");

        lbRuaCliente.setText("Rua");

        btCadastrarCliente.setText("Cadastrar");
        btCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarClienteActionPerformed(evt);
            }
        });

        btCancelarCadastroCliente.setText("Cancelar");
        btCancelarCadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarCadastroClienteActionPerformed(evt);
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
                            .addComponent(lbNomeCliente)
                            .addComponent(lbCNPJ)
                            .addComponent(lbTelefoneCliente)
                            .addComponent(lbUF)
                            .addComponent(lbRuaCliente)
                            .addComponent(lbCidadeCliente)
                            .addComponent(lbBairroCliente))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfNomeCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                            .addComponent(tfCidadeCliente)
                            .addComponent(tfBairroCliente)
                            .addComponent(tfRuaCliente)
                            .addComponent(tfUF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tfCNPJ, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                                .addComponent(tfTelefoneCliente, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 218, Short.MAX_VALUE)
                        .addComponent(btCancelarCadastroCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btCadastrarCliente)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(117, 117, 117)
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
                    .addComponent(tfNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNomeCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCNPJ))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfTelefoneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTelefoneCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbUF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCidadeCliente)
                    .addComponent(tfCidadeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfBairroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbBairroCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfRuaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbRuaCliente))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrarCliente)
                    .addComponent(btCancelarCadastroCliente))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarClienteActionPerformed
        CrudCliente crudCliente = new CrudCliente();
        crudCliente.novoCliente(tfNomeCliente.getText(), tfCNPJ.getText(), 
                tfTelefoneCliente.getText(), tfUF.getText(), tfCidadeCliente.getText(), 
                tfBairroCliente.getText(), tfRuaCliente.getText());
        JOptionPane.showMessageDialog(null, "Cliente Cadastrado!");
        this.dispose();
    }//GEN-LAST:event_btCadastrarClienteActionPerformed

    private void btCancelarCadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarCadastroClienteActionPerformed
        JOptionPane.showMessageDialog(null, "Cancelado!");
        this.dispose();
    }//GEN-LAST:event_btCancelarCadastroClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrarCliente;
    private javax.swing.JButton btCancelarCadastroCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbBairroCliente;
    private javax.swing.JLabel lbCNPJ;
    private javax.swing.JLabel lbCidadeCliente;
    private javax.swing.JLabel lbNomeCliente;
    private javax.swing.JLabel lbRuaCliente;
    private javax.swing.JLabel lbTelefoneCliente;
    private javax.swing.JLabel lbUF;
    private javax.swing.JTextField tfBairroCliente;
    private javax.swing.JTextField tfCNPJ;
    private javax.swing.JTextField tfCidadeCliente;
    private javax.swing.JTextField tfNomeCliente;
    private javax.swing.JTextField tfRuaCliente;
    private javax.swing.JTextField tfTelefoneCliente;
    private javax.swing.JTextField tfUF;
    // End of variables declaration//GEN-END:variables
}

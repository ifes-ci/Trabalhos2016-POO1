/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Domain.Cliente;
import javax.swing.JLabel;

/**
 *
 * @author thiag
 */
public class IFrmVisualizarCliente extends javax.swing.JInternalFrame {

    /**
     * Creates new form IFrmVisualizarCliente
     */
    public IFrmVisualizarCliente(Cliente c) {
        initComponents();
        lbIdCliente.setText(Integer.toString(c.getId()));
        lbNomeCliente.setText(c.getNome());
        lbCnpjCliente.setText(c.getCnpj());
        lbTelefoneCliente.setText(c.getTelefone());
        lbUfCliente.setText(c.getUf());
        lbCidadeCliente.setText(c.getCidade());
        lbBairroCliente.setText(c.getBairro());
        lbRuaCliente.setText(c.getRua());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbCliente = new javax.swing.JLabel();
        lbNome = new javax.swing.JLabel();
        lbNomeCliente = new javax.swing.JLabel();
        lbCNPJ = new javax.swing.JLabel();
        lbIdCliente = new javax.swing.JLabel();
        lbID = new javax.swing.JLabel();
        lbCidadeCliente = new javax.swing.JLabel();
        lbCnpjCliente = new javax.swing.JLabel();
        lbUF = new javax.swing.JLabel();
        lbTelefone = new javax.swing.JLabel();
        lbCidade = new javax.swing.JLabel();
        lbTelefoneCliente = new javax.swing.JLabel();
        lbUfCliente = new javax.swing.JLabel();
        lbBairro = new javax.swing.JLabel();
        lbBairroCliente = new javax.swing.JLabel();
        lbRua = new javax.swing.JLabel();
        lbRuaCliente = new javax.swing.JLabel();
        btVoltar = new javax.swing.JButton();

        setTitle("Visualizar Cliente");

        lbCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbCliente.setText("Cliente");

        lbNome.setText("Nome:");

        lbNomeCliente.setText("jLabel2");

        lbCNPJ.setText("CNPJ:");

        lbIdCliente.setText("jLabel4");

        lbID.setText("ID:");

        lbCidadeCliente.setText("jLabel6");

        lbCnpjCliente.setText("jLabel7");

        lbUF.setText("UF:");

        lbTelefone.setText("Telefone:");

        lbCidade.setText("Cidade:");

        lbTelefoneCliente.setText("jLabel11");

        lbUfCliente.setText("jLabel12");

        lbBairro.setText("Bairro:");

        lbBairroCliente.setText("jLabel2");

        lbRua.setText("Rua:");

        lbRuaCliente.setText("jLabel2");

        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(170, 170, 170)
                                .addComponent(lbCliente))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbID, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbCNPJ)
                                    .addComponent(lbNome)
                                    .addComponent(lbTelefone)
                                    .addComponent(lbUF)
                                    .addComponent(lbCidade)
                                    .addComponent(lbBairro)
                                    .addComponent(lbRua))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbRuaCliente)
                                    .addComponent(lbCidadeCliente)
                                    .addComponent(lbUfCliente)
                                    .addComponent(lbTelefoneCliente)
                                    .addComponent(lbCnpjCliente)
                                    .addComponent(lbNomeCliente)
                                    .addComponent(lbIdCliente)
                                    .addComponent(lbBairroCliente))))
                        .addGap(0, 175, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btVoltar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbCliente)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbIdCliente)
                    .addComponent(lbID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNomeCliente)
                    .addComponent(lbNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCnpjCliente)
                    .addComponent(lbCNPJ))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTelefoneCliente)
                    .addComponent(lbTelefone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbUfCliente)
                    .addComponent(lbUF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCidadeCliente)
                    .addComponent(lbCidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbBairro)
                    .addComponent(lbBairroCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbRua)
                    .addComponent(lbRuaCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(btVoltar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btVoltarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btVoltar;
    private javax.swing.JLabel lbBairro;
    private javax.swing.JLabel lbBairroCliente;
    private javax.swing.JLabel lbCNPJ;
    private javax.swing.JLabel lbCidade;
    private javax.swing.JLabel lbCidadeCliente;
    private javax.swing.JLabel lbCliente;
    private javax.swing.JLabel lbCnpjCliente;
    private javax.swing.JLabel lbID;
    private javax.swing.JLabel lbIdCliente;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbNomeCliente;
    private javax.swing.JLabel lbRua;
    private javax.swing.JLabel lbRuaCliente;
    private javax.swing.JLabel lbTelefone;
    private javax.swing.JLabel lbTelefoneCliente;
    private javax.swing.JLabel lbUF;
    private javax.swing.JLabel lbUfCliente;
    // End of variables declaration//GEN-END:variables
}

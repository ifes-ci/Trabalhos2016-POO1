/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Crud.CrudVenda;
import Domain.Venda;

/**
 *
 * @author thiag
 */
public class IFrmVisualizarVenda extends javax.swing.JInternalFrame {
    Venda v;
    /**
     * Creates new form IFrmVisualizarVenda
     */
    public IFrmVisualizarVenda(Venda venda) {
        initComponents();
        this.v = venda;
        CrudVenda crudVenda = new CrudVenda();
        lbIdVenda.setText(Integer.toString(v.getId()));
        lbDataVenda.setText(v.getDataVenda());
        lbClienteVenda.setText(v.getCliente().getNome());
        lbFuncionarioVenda.setText(v.getFunc().getNome());
        lbProdutoVenda.setText(v.getProd().getNome());
        lbQuantidadeVenda.setText(Integer.toString(v.getQuantidade()));
        lbRotaVenda.setText(v.getRota());
        lbPrevisaoEntregaVenda.setText(v.getPrevisaoEntrega());
        lbValorTotalVenda.setText(Double.toString(crudVenda.ValorTotal(v)));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbVenda = new javax.swing.JLabel();
        lbData = new javax.swing.JLabel();
        lbCliente = new javax.swing.JLabel();
        lbFuncionario = new javax.swing.JLabel();
        lbProduto = new javax.swing.JLabel();
        lbQuantidade = new javax.swing.JLabel();
        lbRota = new javax.swing.JLabel();
        lbPrevisaoEntrega = new javax.swing.JLabel();
        lbValorTotal = new javax.swing.JLabel();
        lbDataVenda = new javax.swing.JLabel();
        lbClienteVenda = new javax.swing.JLabel();
        lbFuncionarioVenda = new javax.swing.JLabel();
        lbProdutoVenda = new javax.swing.JLabel();
        lbQuantidadeVenda = new javax.swing.JLabel();
        lbRotaVenda = new javax.swing.JLabel();
        lbPrevisaoEntregaVenda = new javax.swing.JLabel();
        lbValorTotalVenda = new javax.swing.JLabel();
        btVoltar = new javax.swing.JButton();
        lbID = new javax.swing.JLabel();
        lbIdVenda = new javax.swing.JLabel();

        setTitle("Visualizar Venda");

        lbVenda.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbVenda.setText("Venda");

        lbData.setText("Data:");

        lbCliente.setText("Cliente:");

        lbFuncionario.setText("Vendedor:");

        lbProduto.setText("Produto:");

        lbQuantidade.setText("Quantidade:");

        lbRota.setText("Rota:");

        lbPrevisaoEntrega.setText("Previsão de Entrega:");

        lbValorTotal.setText("Valor Total:");

        lbDataVenda.setText("jLabel1");

        lbClienteVenda.setText("jLabel2");

        lbFuncionarioVenda.setText("jLabel3");

        lbProdutoVenda.setText("jLabel4");

        lbQuantidadeVenda.setText("jLabel5");

        lbRotaVenda.setText("jLabel7");

        lbPrevisaoEntregaVenda.setText("jLabel8");

        lbValorTotalVenda.setText("jLabel9");

        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        lbID.setText("ID:");

        lbIdVenda.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbID)
                    .addComponent(lbPrevisaoEntrega)
                    .addComponent(lbQuantidade)
                    .addComponent(lbFuncionario)
                    .addComponent(lbCliente)
                    .addComponent(lbData)
                    .addComponent(lbValorTotal)
                    .addComponent(lbProduto)
                    .addComponent(lbRota))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 182, Short.MAX_VALUE)
                                .addComponent(btVoltar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbDataVenda)
                                    .addComponent(lbClienteVenda)
                                    .addComponent(lbFuncionarioVenda)
                                    .addComponent(lbProdutoVenda)
                                    .addComponent(lbQuantidadeVenda)
                                    .addComponent(lbRotaVenda)
                                    .addComponent(lbPrevisaoEntregaVenda)
                                    .addComponent(lbIdVenda)
                                    .addComponent(lbValorTotalVenda))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(lbVenda)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbVenda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(41, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbID)
                            .addComponent(lbIdVenda))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbData)
                    .addComponent(lbDataVenda))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCliente)
                    .addComponent(lbClienteVenda))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbFuncionario)
                    .addComponent(lbFuncionarioVenda))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbProduto)
                    .addComponent(lbProdutoVenda))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbQuantidade)
                    .addComponent(lbQuantidadeVenda))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbRotaVenda)
                    .addComponent(lbRota))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPrevisaoEntregaVenda)
                    .addComponent(lbPrevisaoEntrega))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbValorTotalVenda)
                    .addComponent(lbValorTotal))
                .addGap(26, 26, 26)
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
    private javax.swing.JLabel lbCliente;
    private javax.swing.JLabel lbClienteVenda;
    private javax.swing.JLabel lbData;
    private javax.swing.JLabel lbDataVenda;
    private javax.swing.JLabel lbFuncionario;
    private javax.swing.JLabel lbFuncionarioVenda;
    private javax.swing.JLabel lbID;
    private javax.swing.JLabel lbIdVenda;
    private javax.swing.JLabel lbPrevisaoEntrega;
    private javax.swing.JLabel lbPrevisaoEntregaVenda;
    private javax.swing.JLabel lbProduto;
    private javax.swing.JLabel lbProdutoVenda;
    private javax.swing.JLabel lbQuantidade;
    private javax.swing.JLabel lbQuantidadeVenda;
    private javax.swing.JLabel lbRota;
    private javax.swing.JLabel lbRotaVenda;
    private javax.swing.JLabel lbValorTotal;
    private javax.swing.JLabel lbValorTotalVenda;
    private javax.swing.JLabel lbVenda;
    // End of variables declaration//GEN-END:variables
}
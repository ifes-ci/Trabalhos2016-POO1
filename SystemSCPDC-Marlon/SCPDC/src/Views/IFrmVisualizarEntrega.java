/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Domain.Entrega;

/**
 *
 * @author thiag
 */
public class IFrmVisualizarEntrega extends javax.swing.JInternalFrame {

    /**
     * Creates new form IFrmVisualizarEntrega
     */
    public IFrmVisualizarEntrega(Entrega e) {
        initComponents();
        lbIdEntrega.setText(Integer.toString(e.getId()));
        lbRotaEntrega.setText(e.getRota());
        lbDataEntrega.setText(e.getData());
        lbPlacaVeiculoEntrega.setText(e.getPlacaVeiculo());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbID = new javax.swing.JLabel();
        lbRota = new javax.swing.JLabel();
        lbData = new javax.swing.JLabel();
        lbPlacaVeiculo = new javax.swing.JLabel();
        lbIdEntrega = new javax.swing.JLabel();
        lbRotaEntrega = new javax.swing.JLabel();
        lbDataEntrega = new javax.swing.JLabel();
        lbPlacaVeiculoEntrega = new javax.swing.JLabel();
        lbEntrega = new javax.swing.JLabel();
        btVoltarEntrega = new javax.swing.JButton();

        setTitle("Visualizar Entrega");
        setPreferredSize(new java.awt.Dimension(410, 316));

        lbID.setText("ID:");

        lbRota.setText("Rota:");

        lbData.setText("Data:");

        lbPlacaVeiculo.setText("Placa do Veículo:");

        lbIdEntrega.setText("jLabel2");

        lbRotaEntrega.setText("jLabel3");

        lbDataEntrega.setText("jLabel4");

        lbPlacaVeiculoEntrega.setText("jLabel5");

        lbEntrega.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbEntrega.setText("Entrega");

        btVoltarEntrega.setText("Voltar");
        btVoltarEntrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarEntregaActionPerformed(evt);
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
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbID)
                                    .addComponent(lbData)
                                    .addComponent(lbPlacaVeiculo)
                                    .addComponent(lbRota))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbIdEntrega)
                                    .addComponent(lbRotaEntrega)
                                    .addComponent(lbDataEntrega)
                                    .addComponent(lbPlacaVeiculoEntrega)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(164, 164, 164)
                                .addComponent(lbEntrega)))
                        .addGap(0, 172, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btVoltarEntrega)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbEntrega)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbID)
                    .addComponent(lbIdEntrega))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbRotaEntrega)
                    .addComponent(lbRota))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDataEntrega)
                    .addComponent(lbData))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPlacaVeiculoEntrega)
                    .addComponent(lbPlacaVeiculo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(btVoltarEntrega)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btVoltarEntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarEntregaActionPerformed
        this.dispose();
    }//GEN-LAST:event_btVoltarEntregaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btVoltarEntrega;
    private javax.swing.JLabel lbData;
    private javax.swing.JLabel lbDataEntrega;
    private javax.swing.JLabel lbEntrega;
    private javax.swing.JLabel lbID;
    private javax.swing.JLabel lbIdEntrega;
    private javax.swing.JLabel lbPlacaVeiculo;
    private javax.swing.JLabel lbPlacaVeiculoEntrega;
    private javax.swing.JLabel lbRota;
    private javax.swing.JLabel lbRotaEntrega;
    // End of variables declaration//GEN-END:variables
}

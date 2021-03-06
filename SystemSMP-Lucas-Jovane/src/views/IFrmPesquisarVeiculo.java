/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import crud.VeiculoCRUD;
import domain.Veiculo;
import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class IFrmPesquisarVeiculo extends javax.swing.JInternalFrame {
    
    VeiculoCRUD CRUD;
    Veiculo veiculo;
    int aux;
    
    /**
     * Creates new form IFrmPesquisarVeiculo
     */
    public IFrmPesquisarVeiculo(int tipo) {
        CRUD = new VeiculoCRUD();
        initComponents();
        aux = tipo;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbPlaca = new javax.swing.JLabel();
        tfPlaca = new javax.swing.JTextField();
        btPesquisar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        lbTitulo = new javax.swing.JLabel();

        lbPlaca.setText("Placa:");

        btPesquisar.setText("Pesquisar");
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        lbTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbTitulo.setText("Pesquisar Veículo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(lbPlaca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(btPesquisar)
                        .addGap(18, 18, 18)
                        .addComponent(btCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(lbTitulo)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitulo)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPlaca)
                    .addComponent(tfPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btPesquisar)
                    .addComponent(btCancelar))
                .addContainerGap(91, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        // TODO add your handling code here:
        String placa = tfPlaca.getText();
        veiculo = CRUD.ler(placa);
        
        if(veiculo == null){
            JOptionPane.showMessageDialog(null, "Não encontrado");
        } else {
            // Constroi a janela conforme a ação(Alterar, visualizar e remover)
            switch(aux){
                case 1:
                    IFrmCadastrarVeiculo editVeiculoFrm = new IFrmCadastrarVeiculo(
                        1, "Salvar", "Alteração de Veiculo");
                    FrmMenuPrincipal.dpPrincipal.add(editVeiculoFrm);
                    editVeiculoFrm.setVeiculo(veiculo);
                    editVeiculoFrm.setDesabilitarInputs(1);
                    editVeiculoFrm.setVisible(true);
                break;
                case 2:
                    IFrmCadastrarVeiculo visuaVeiculoFrm = new IFrmCadastrarVeiculo(
                        2, "Fechar", "Visualizar Veiculo");
                    FrmMenuPrincipal.dpPrincipal.add(visuaVeiculoFrm);
                    visuaVeiculoFrm.setVeiculo(veiculo);
                    visuaVeiculoFrm.setDesabilitarInputs(0);
                    visuaVeiculoFrm.setVisible(true);
                break;
                case 3:
                    IFrmCadastrarVeiculo removeVeiculoFrm = new IFrmCadastrarVeiculo(
                        3, "Remover", "Remover Veiculo");
                    FrmMenuPrincipal.dpPrincipal.add(removeVeiculoFrm);
                    removeVeiculoFrm.setVeiculo(veiculo);
                    removeVeiculoFrm.setDesabilitarInputs(0);
                    removeVeiculoFrm.setVisible(true);
                break;
                default:
                    System.out.println("Fazer nada");
                break;
            }

        }
        tfPlaca.setText("");

    }//GEN-LAST:event_btPesquisarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        // TODO add your handling code here:
        //tfCpf.setText("");
        this.dispose();
    }//GEN-LAST:event_btCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JLabel lbPlaca;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JTextField tfPlaca;
    // End of variables declaration//GEN-END:variables
}

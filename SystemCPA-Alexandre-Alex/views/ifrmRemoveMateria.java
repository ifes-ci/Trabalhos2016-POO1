/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import CRUD.listMateria;
import static bancoDados.dataBase.lstAluno;
import static bancoDados.dataBase.lstMateria;
import trabalhojava.Aluno;
import trabalhojava.Materia;

/**
 *
 * @author Alexandre
 */
public class ifrmRemoveMateria extends javax.swing.JInternalFrame {

    /**
     * Creates new form ifrmRemoveMateria
     */
    private listMateria materia = new listMateria();
    public ifrmRemoveMateria() {
        initComponents();
        
        rmMateriaBox.removeAllItems();
        for(Materia opc: lstMateria){
            rmMateriaBox.addItem(opc.getNome());
        }
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
        rmMateriaBox = new javax.swing.JComboBox<>();
        rmMateria = new javax.swing.JButton();
        cancRmMateria = new javax.swing.JButton();

        setTitle("Remover Matéria");

        jLabel1.setText("Selecione a Matéria:");

        rmMateriaBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        rmMateria.setText("Remover");
        rmMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rmMateriaActionPerformed(evt);
            }
        });

        cancRmMateria.setText("Cancelar");
        cancRmMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancRmMateriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rmMateriaBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(221, Short.MAX_VALUE)
                .addComponent(rmMateria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancRmMateria)
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rmMateriaBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 193, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rmMateria)
                    .addComponent(cancRmMateria))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rmMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rmMateriaActionPerformed
        String op1=(String) rmMateriaBox.getSelectedItem(); 
        for(Materia op2 : lstMateria){          
            if(op2.getNome().equals(op1)){
                rmMateriaBox.removeItem(op2.getNome());
                materia.remover(op2);
                
    }                                               
    this.dispose();
    }
    }//GEN-LAST:event_rmMateriaActionPerformed

    private void cancRmMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancRmMateriaActionPerformed
         this.dispose();
    }//GEN-LAST:event_cancRmMateriaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancRmMateria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton rmMateria;
    private javax.swing.JComboBox<String> rmMateriaBox;
    // End of variables declaration//GEN-END:variables
}

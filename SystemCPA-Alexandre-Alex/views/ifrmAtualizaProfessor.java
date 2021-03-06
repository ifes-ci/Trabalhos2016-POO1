/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;
import static bancoDados.dataBase.lstProfessor;
import javax.swing.JOptionPane;
import trabalhojava.Professor;
/**
 *
 * @author Alexandre
 */
public class ifrmAtualizaProfessor extends javax.swing.JInternalFrame {

    /**
     * Creates new form ifrmAtualizaProfessor
     */
    public ifrmAtualizaProfessor() {
        initComponents();
        
        atProfessorBox.removeAllItems();
        for(Professor opc: lstProfessor){
        atProfessorBox.addItem(opc.getNome());
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
        atProfessorBox = new javax.swing.JComboBox<>();
        atMateria = new javax.swing.JButton();
        cancMateria = new javax.swing.JButton();

        setTitle("Atualizar Professor");

        jLabel1.setText("Selecione o Professor: ");

        atProfessorBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        atMateria.setText("Atualizar");
        atMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atMateriaActionPerformed(evt);
            }
        });

        cancMateria.setText("Cancelar");
        cancMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancMateriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(atProfessorBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(atMateria)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(cancMateria)
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(atProfessorBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 193, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(atMateria)
                    .addComponent(cancMateria))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancMateriaActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancMateriaActionPerformed

    private void atMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atMateriaActionPerformed
        String op1=(String) atProfessorBox.getSelectedItem(); 
        for(Professor op2 : lstProfessor){          
            if(op2.getNome().equals(op1)){
                Professor op3 = op2;
                op3.setNome(JOptionPane.showInputDialog(
                null,
                "Nome Professor: "+op2.getNome()+"\n"+
                "Digite o Novo Nome: \n"   
                        
                )
                );
                if(op3.getNome().equals(" ")){
                        op3.setNome(op2.getNome());
                }
                
                
               
               
    }                                               

    }
        this.dispose();
    }//GEN-LAST:event_atMateriaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atMateria;
    private javax.swing.JComboBox<String> atProfessorBox;
    private javax.swing.JButton cancMateria;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import javax.swing.JOptionPane;
import CRUD.listAluno;
import trabalhojava.Aluno;
import CRUD.listMateria;

/**
 *
 * @author Alexandre
 */
public class ifrmCadastroAluno extends javax.swing.JInternalFrame {

    /**
     * Creates new form ifrmCadastroAluno
     */
    public ifrmCadastroAluno() {
        initComponents();
        
        
        this.txtMatriculaAluno.setText(Integer.toString(trabalhojava.Aluno.nextID));
        
        this.txtMatriculaAluno.setEnabled(false);
        //Aluno auxAluno;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNomeAluno = new javax.swing.JTextField();
        cadNomeAluno = new javax.swing.JLabel();
        cadCadastrarAluno = new javax.swing.JButton();
        cancCadastroAluno = new javax.swing.JButton();
        cadSala = new javax.swing.JLabel();
        txtSalaAluno = new javax.swing.JTextField();
        cadMatricula = new javax.swing.JLabel();
        txtMatriculaAluno = new javax.swing.JTextField();

        setTitle("Cadastrar Aluno");

        txtNomeAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeAlunoActionPerformed(evt);
            }
        });

        cadNomeAluno.setText("Nome do Aluno");

        cadCadastrarAluno.setText("Cadastrar");
        cadCadastrarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadCadastrarAlunoActionPerformed(evt);
            }
        });

        cancCadastroAluno.setText("Cancelar");
        cancCadastroAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancCadastroAlunoActionPerformed(evt);
            }
        });

        cadSala.setText("Sala");

        cadMatricula.setText("Matrícula");

        txtMatriculaAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMatriculaAlunoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cadCadastrarAluno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancCadastroAluno)
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadNomeAluno)
                    .addComponent(cadSala)
                    .addComponent(txtSalaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadMatricula)
                    .addComponent(txtMatriculaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(cadNomeAluno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cadSala)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSalaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(cadMatricula)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMatriculaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadCadastrarAluno)
                    .addComponent(cancCadastroAluno))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeAlunoActionPerformed

    private void cadCadastrarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadCadastrarAlunoActionPerformed
        Aluno auxAluno = new Aluno();
        auxAluno.setNome(txtNomeAluno.getText());
        auxAluno.setSala(txtSalaAluno.getText());
        auxAluno.setMatricula(Integer.parseInt(txtMatriculaAluno.getText()));
        listAluno LA = new listAluno();
        LA.inserir(auxAluno);
        //Aluno a = LA.ler(0000001);
        //System.out.println(a.getNome());
        JOptionPane.showMessageDialog(
                this,            
                "Nome: "+this.txtNomeAluno.getText()+"\n"+
                "Sala: "+this.txtSalaAluno.getText()+"\n"+
                "Matrícula: "+this.txtMatriculaAluno.getText()+"\n"                
        );
        this.dispose();
    }//GEN-LAST:event_cadCadastrarAlunoActionPerformed

    private void txtMatriculaAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMatriculaAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMatriculaAlunoActionPerformed

    private void cancCadastroAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancCadastroAlunoActionPerformed
       this.dispose();
        
    }//GEN-LAST:event_cancCadastroAlunoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadCadastrarAluno;
    private javax.swing.JLabel cadMatricula;
    private javax.swing.JLabel cadNomeAluno;
    private javax.swing.JLabel cadSala;
    private javax.swing.JButton cancCadastroAluno;
    private javax.swing.JTextField txtMatriculaAluno;
    private javax.swing.JTextField txtNomeAluno;
    private javax.swing.JTextField txtSalaAluno;
    // End of variables declaration//GEN-END:variables
}

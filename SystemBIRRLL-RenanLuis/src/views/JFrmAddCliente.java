/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import crud.ClienteCRUD;
import database.DataBase;
import domain.Cliente;
import domain.Turma;

/**
 *
 * @author Vinicius
 */
public class JFrmAddCliente extends javax.swing.JFrame {

    public int jj = 0, codC;

    /**
     * Creates new form JFrmAddCliente
     */
    public JFrmAddCliente() {
        initComponents();
    }

    public JFrmAddCliente(int j, int cod) {
        initComponents();
        codC = cod;
        jj = j;
        jj = 1;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SexoCliente = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfNomeCliente = new javax.swing.JTextField();
        tfCpfCliente = new javax.swing.JTextField();
        tfBairroCliente = new javax.swing.JTextField();
        tfTelefoneCliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        opMasculino = new javax.swing.JRadioButton();
        opFeminino = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        tfCodTurmaCliente = new javax.swing.JTextField();
        btConfirmar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Nome");

        jLabel2.setText("CPF");

        jLabel3.setText("Bairro");

        jLabel4.setText("Telefone");

        jLabel5.setText("Sexo");

        SexoCliente.add(opMasculino);
        opMasculino.setSelected(true);
        opMasculino.setText("Masculino");

        SexoCliente.add(opFeminino);
        opFeminino.setText("Feminino");

        jLabel6.setText("Código de Turma");

        btConfirmar.setText("Confirmar");
        btConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConfirmarActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(btConfirmar)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(tfCodTurmaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfBairroCliente)
                                    .addComponent(tfCpfCliente)
                                    .addComponent(tfNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(opMasculino)
                                        .addGap(18, 18, 18)
                                        .addComponent(opFeminino))
                                    .addComponent(tfTelefoneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfCpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(tfBairroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfTelefoneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfCodTurmaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(opMasculino)
                    .addComponent(opFeminino))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btConfirmar)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConfirmarActionPerformed
        // TODO add your handling code here:
        Cliente c = new Cliente();
        int codAux, i = 0;
        if (opMasculino.isSelected() == true) {
            c.setSexo("Masculino");
        } else {
            c.setSexo("Feminino");
        }
        if (tfNomeCliente.getText().equals("") || tfBairroCliente.getText().equals("")
                || tfCpfCliente.getText().equals("") || tfTelefoneCliente.getText().equals("")
                || tfCodTurmaCliente.getText().equals("")) {
            this.dispose();
            JFrmErroPreenchimento ep = new JFrmErroPreenchimento("ERRO! Algum campo não foi preenchido corretamente.");
            ep.setVisible(true);
        } else {
            c.setBairro(tfBairroCliente.getText());
            c.setCpf(tfCpfCliente.getText());
            c.setNome_cliente(tfNomeCliente.getText());
            c.setTelefone_cliente(tfTelefoneCliente.getText());
            
            codAux = Integer.parseInt(tfCodTurmaCliente.getText());
            for (Turma t : DataBase.lstTurma) {
                String text = "";
                if (t.getCod_turma() == codAux) {
                    c.setTurma(t);
                    ClienteCRUD crd = new ClienteCRUD();
                    if (jj == 0) {
                        text = "Cliente cadastrado com sucesso!!!";
                        crd.inserir(c);
                    } else if (jj == 1) {
                        text = "Cliente alterado com sucesso!!!";
                        c.setCod_cliente(codC);
                        crd.alterar(codC, c);
                    }
                    this.dispose();
                    JFrmSucesso s = new JFrmSucesso(text);
                    s.setVisible(true);
                    i = 1;
                    break;
                }
            }
            if (jj == 0) {
                if (i == 0) {
                    this.dispose();
                    JFrmErroPreenchimento ep = new JFrmErroPreenchimento("ERRO! Codigo Turma não existe.");
                    ep.setVisible(true);
                }
            } else if (i == 0) {
                this.dispose();
                JFrmErroAlterarCliente ep = new JFrmErroAlterarCliente("ERRO! Codigo Turma não existe.", 1, codC);
                ep.setVisible(true);
            }
        }
    }//GEN-LAST:event_btConfirmarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        JFrmCliente c = new JFrmCliente();
        c.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrmAddCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrmAddCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrmAddCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrmAddCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrmAddCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup SexoCliente;
    private javax.swing.JButton btConfirmar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton opFeminino;
    private javax.swing.JRadioButton opMasculino;
    private javax.swing.JTextField tfBairroCliente;
    private javax.swing.JTextField tfCodTurmaCliente;
    private javax.swing.JTextField tfCpfCliente;
    private javax.swing.JTextField tfNomeCliente;
    private javax.swing.JTextField tfTelefoneCliente;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

/**
 *
 * @author rafaelrocha
 */
public class FrmTelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmTelaPrincipal
     */
    public FrmTelaPrincipal() {
        initComponents();
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dpPrincipal = new javax.swing.JDesktopPane();
        mbPrincipal = new javax.swing.JMenuBar();
        mArquivo = new javax.swing.JMenu();
        miSair = new javax.swing.JMenuItem();
        mVendas = new javax.swing.JMenu();
        miFaturarVenda = new javax.swing.JMenuItem();
        miRealizarVenda = new javax.swing.JMenuItem();
        mAlterarVenda = new javax.swing.JMenu();
        miAddProdutos = new javax.swing.JMenuItem();
        miRemoverProdutos = new javax.swing.JMenuItem();
        mExibir = new javax.swing.JMenu();
        miExibirUsuario = new javax.swing.JMenuItem();
        miExibirClientes = new javax.swing.JMenuItem();
        miExibirProdutos = new javax.swing.JMenuItem();
        miExibirFaturas = new javax.swing.JMenuItem();
        mCadastros = new javax.swing.JMenu();
        mUsuario = new javax.swing.JMenu();
        miNovoUsuario = new javax.swing.JMenuItem();
        miEditarUsuario = new javax.swing.JMenuItem();
        miRemoverUsuario = new javax.swing.JMenuItem();
        mCliente = new javax.swing.JMenu();
        miNovoCliente = new javax.swing.JMenuItem();
        miEditarCliente = new javax.swing.JMenuItem();
        miRemoverCliente = new javax.swing.JMenuItem();
        mProduto = new javax.swing.JMenu();
        miNovoProduto = new javax.swing.JMenuItem();
        miEditarProduto = new javax.swing.JMenuItem();
        miRemoverProduto = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mArquivo.setText("Arquivo");

        miSair.setText("Sair");
        miSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSairActionPerformed(evt);
            }
        });
        mArquivo.add(miSair);

        mbPrincipal.add(mArquivo);

        mVendas.setText("Vendas");

        miFaturarVenda.setText("Faturar Venda");
        miFaturarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miFaturarVendaActionPerformed(evt);
            }
        });
        mVendas.add(miFaturarVenda);

        miRealizarVenda.setText("Realizar Venda");
        miRealizarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miRealizarVendaActionPerformed(evt);
            }
        });
        mVendas.add(miRealizarVenda);

        mAlterarVenda.setText("Alterar Venda");

        miAddProdutos.setText("Adicionar Produtos");
        miAddProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAddProdutosActionPerformed(evt);
            }
        });
        mAlterarVenda.add(miAddProdutos);

        miRemoverProdutos.setText("Remover Produtos");
        miRemoverProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miRemoverProdutosActionPerformed(evt);
            }
        });
        mAlterarVenda.add(miRemoverProdutos);

        mVendas.add(mAlterarVenda);

        mbPrincipal.add(mVendas);

        mExibir.setText("Exibir");

        miExibirUsuario.setText("Usuários");
        miExibirUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miExibirUsuarioActionPerformed(evt);
            }
        });
        mExibir.add(miExibirUsuario);

        miExibirClientes.setText("Clientes");
        miExibirClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miExibirClientesActionPerformed(evt);
            }
        });
        mExibir.add(miExibirClientes);

        miExibirProdutos.setText("Produtos");
        miExibirProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miExibirProdutosActionPerformed(evt);
            }
        });
        mExibir.add(miExibirProdutos);

        miExibirFaturas.setText("Faturas");
        miExibirFaturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miExibirFaturasActionPerformed(evt);
            }
        });
        mExibir.add(miExibirFaturas);

        mbPrincipal.add(mExibir);

        mCadastros.setText("Cadastros");

        mUsuario.setText("Usuários");

        miNovoUsuario.setText("Novo Usuário");
        miNovoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miNovoUsuarioActionPerformed(evt);
            }
        });
        mUsuario.add(miNovoUsuario);

        miEditarUsuario.setText("Editar Usuário");
        miEditarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miEditarUsuarioActionPerformed(evt);
            }
        });
        mUsuario.add(miEditarUsuario);

        miRemoverUsuario.setText("Remover Usuário");
        miRemoverUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miRemoverUsuarioActionPerformed(evt);
            }
        });
        mUsuario.add(miRemoverUsuario);

        mCadastros.add(mUsuario);

        mCliente.setText("Clientes");

        miNovoCliente.setText("Novo Cliente");
        miNovoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miNovoClienteActionPerformed(evt);
            }
        });
        mCliente.add(miNovoCliente);

        miEditarCliente.setText("Editar Cliente");
        miEditarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miEditarClienteActionPerformed(evt);
            }
        });
        mCliente.add(miEditarCliente);

        miRemoverCliente.setText("Remover Cliente");
        miRemoverCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miRemoverClienteActionPerformed(evt);
            }
        });
        mCliente.add(miRemoverCliente);

        mCadastros.add(mCliente);

        mProduto.setText("Produtos");

        miNovoProduto.setText("Novo Produto");
        miNovoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miNovoProdutoActionPerformed(evt);
            }
        });
        mProduto.add(miNovoProduto);

        miEditarProduto.setText("Editar Produto");
        miEditarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miEditarProdutoActionPerformed(evt);
            }
        });
        mProduto.add(miEditarProduto);

        miRemoverProduto.setText("Remover Produto");
        miRemoverProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miRemoverProdutoActionPerformed(evt);
            }
        });
        mProduto.add(miRemoverProduto);

        mCadastros.add(mProduto);

        mbPrincipal.add(mCadastros);

        setJMenuBar(mbPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dpPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 976, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dpPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miNovoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miNovoUsuarioActionPerformed
        FrmNovoUsuario novoUsuario = new FrmNovoUsuario();
        this.dpPrincipal.add(novoUsuario);
        novoUsuario.setVisible(true);
    }//GEN-LAST:event_miNovoUsuarioActionPerformed

    private void miEditarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miEditarUsuarioActionPerformed
        FrmEditarUsuario editarUsuario = new FrmEditarUsuario();
        this.dpPrincipal.add(editarUsuario);
        editarUsuario.setVisible(true);
    }//GEN-LAST:event_miEditarUsuarioActionPerformed
    
    private void miRemoverUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miRemoverUsuarioActionPerformed
        FrmRemoverUsuario removeUsuario = new FrmRemoverUsuario();
        this.dpPrincipal.add(removeUsuario);
        removeUsuario.setVisible(true);
    }//GEN-LAST:event_miRemoverUsuarioActionPerformed

    private void miExibirUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miExibirUsuarioActionPerformed
        // TODO add your handling code here:
        FrmExibirUsuarios exibirUsuario = new FrmExibirUsuarios();
        this.dpPrincipal.add(exibirUsuario);
        exibirUsuario.setVisible(true);
        
    }//GEN-LAST:event_miExibirUsuarioActionPerformed

    private void miNovoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miNovoClienteActionPerformed
        FrmNovoCliente novoCliente = new FrmNovoCliente();
        this.dpPrincipal.add(novoCliente);
        novoCliente.setVisible(true);
    }//GEN-LAST:event_miNovoClienteActionPerformed

    private void miExibirClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miExibirClientesActionPerformed
        FrmExibirClientes exibirClientes = new FrmExibirClientes();
        this.dpPrincipal.add(exibirClientes);
        exibirClientes.setVisible(true);
    }//GEN-LAST:event_miExibirClientesActionPerformed

    private void miRemoverClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miRemoverClienteActionPerformed
        FrmRemoverCliente removeCliente = new FrmRemoverCliente();
        this.dpPrincipal.add(removeCliente);
        removeCliente.setVisible(true);
    }//GEN-LAST:event_miRemoverClienteActionPerformed

    private void miEditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miEditarClienteActionPerformed
        FrmEditarCliente editarCliente = new FrmEditarCliente();
        this.dpPrincipal.add(editarCliente);
        editarCliente.setVisible(true);
    }//GEN-LAST:event_miEditarClienteActionPerformed

    private void miNovoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miNovoProdutoActionPerformed
        FrmNovoProduto novoProduto = new FrmNovoProduto();
        this.dpPrincipal.add(novoProduto);
        novoProduto.setVisible(true);
    }//GEN-LAST:event_miNovoProdutoActionPerformed

    private void miEditarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miEditarProdutoActionPerformed
        FrmEditarProduto editarProduto = new FrmEditarProduto();
        this.dpPrincipal.add(editarProduto);
        editarProduto.setVisible(true);
    }//GEN-LAST:event_miEditarProdutoActionPerformed

    private void miExibirProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miExibirProdutosActionPerformed
        FrmExibirProdutos exibirProduto = new FrmExibirProdutos();
        this.dpPrincipal.add(exibirProduto);
        exibirProduto.setVisible(true);
    }//GEN-LAST:event_miExibirProdutosActionPerformed

    private void miRemoverProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miRemoverProdutoActionPerformed
        FrmRemoverProduto removeProduto = new FrmRemoverProduto();
        this.dpPrincipal.add(removeProduto);
        removeProduto.setVisible(true);
    }//GEN-LAST:event_miRemoverProdutoActionPerformed

    private void miFaturarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miFaturarVendaActionPerformed
        FrmFaturarVenda faturarVenda = new FrmFaturarVenda();
        this.dpPrincipal.add(faturarVenda);
        faturarVenda.setVisible(true);
    }//GEN-LAST:event_miFaturarVendaActionPerformed

    private void miRealizarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miRealizarVendaActionPerformed
        FrmRealizarVenda realizaVenda = new FrmRealizarVenda();
        this.dpPrincipal.add(realizaVenda);
        realizaVenda.setVisible(true);
    }//GEN-LAST:event_miRealizarVendaActionPerformed

    private void miExibirFaturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miExibirFaturasActionPerformed
        FrmExibirFaturas exibirFatura = new FrmExibirFaturas();
        this.dpPrincipal.add(exibirFatura);
        exibirFatura.setVisible(true);
    }//GEN-LAST:event_miExibirFaturasActionPerformed

    private void miSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_miSairActionPerformed

    private void miAddProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAddProdutosActionPerformed
        FrmAdicionarProdutos addProdutos = new FrmAdicionarProdutos();
        this.dpPrincipal.add(addProdutos);
        addProdutos.setVisible(true);
    }//GEN-LAST:event_miAddProdutosActionPerformed

    private void miRemoverProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miRemoverProdutosActionPerformed
        FrmRetirarProdutos retirarProdutos = new FrmRetirarProdutos();
        this.dpPrincipal.add(retirarProdutos);
        retirarProdutos.setVisible(true);
    }//GEN-LAST:event_miRemoverProdutosActionPerformed

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
            java.util.logging.Logger.getLogger(FrmTelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmTelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmTelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmTelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmTelaPrincipal form = new FrmTelaPrincipal();
                form.setLocationRelativeTo(null);
                form.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dpPrincipal;
    private javax.swing.JMenu mAlterarVenda;
    private javax.swing.JMenu mArquivo;
    private javax.swing.JMenu mCadastros;
    private javax.swing.JMenu mCliente;
    private javax.swing.JMenu mExibir;
    private javax.swing.JMenu mProduto;
    private javax.swing.JMenu mUsuario;
    private javax.swing.JMenu mVendas;
    private javax.swing.JMenuBar mbPrincipal;
    private javax.swing.JMenuItem miAddProdutos;
    private javax.swing.JMenuItem miEditarCliente;
    private javax.swing.JMenuItem miEditarProduto;
    private javax.swing.JMenuItem miEditarUsuario;
    private javax.swing.JMenuItem miExibirClientes;
    private javax.swing.JMenuItem miExibirFaturas;
    private javax.swing.JMenuItem miExibirProdutos;
    private javax.swing.JMenuItem miExibirUsuario;
    private javax.swing.JMenuItem miFaturarVenda;
    private javax.swing.JMenuItem miNovoCliente;
    private javax.swing.JMenuItem miNovoProduto;
    private javax.swing.JMenuItem miNovoUsuario;
    private javax.swing.JMenuItem miRealizarVenda;
    private javax.swing.JMenuItem miRemoverCliente;
    private javax.swing.JMenuItem miRemoverProduto;
    private javax.swing.JMenuItem miRemoverProdutos;
    private javax.swing.JMenuItem miRemoverUsuario;
    private javax.swing.JMenuItem miSair;
    // End of variables declaration//GEN-END:variables
}

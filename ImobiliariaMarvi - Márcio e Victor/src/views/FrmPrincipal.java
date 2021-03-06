/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import crud.ClienteCRUD;
import crud.FormaDePagamentoCRUD;
import crud.ImovelCRUD;
import javax.swing.JOptionPane;
import crud.UsuarioCRUD;
import crud.VendaCRUD;
import domain.Cliente;
import domain.FormaDePagamento;
import domain.Imovel;
import domain.Usuario;
import domain.Venda;

/**
 *
 * @author tognere
 */
public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
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
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        miClienteCadastrar = new javax.swing.JMenuItem();
        miClienteVisualizar = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        miUsuarioCadastrar = new javax.swing.JMenuItem();
        miUsuarioVisualizarTodos = new javax.swing.JMenuItem();
        miUsuarioEditar = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        miUsuarioVisualizar = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        miImovelCadastrar = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        miFormPagamentoCadastrar = new javax.swing.JMenuItem();
        miFormPagamentoVisualizar = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        miVendaCadastrar = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Imobiliária Marvi");
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);
        setSize(new java.awt.Dimension(680, 800));
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Wallpaper.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-30, -50, 770, 760);

        jMenu1.setText("Cliente");

        miClienteCadastrar.setText("Cadastrar");
        miClienteCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miClienteCadastrarActionPerformed(evt);
            }
        });
        jMenu1.add(miClienteCadastrar);

        miClienteVisualizar.setText("Visualizar");
        miClienteVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miClienteVisualizarActionPerformed(evt);
            }
        });
        jMenu1.add(miClienteVisualizar);

        jMenuItem5.setText("Editar");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem6.setText("Deletar");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuItem14.setText("Procurar");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem14);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Usuário");

        miUsuarioCadastrar.setText("Cadastrar");
        miUsuarioCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miUsuarioCadastrarActionPerformed(evt);
            }
        });
        jMenu2.add(miUsuarioCadastrar);

        miUsuarioVisualizarTodos.setText("Visualizar");
        miUsuarioVisualizarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miUsuarioVisualizarTodosActionPerformed(evt);
            }
        });
        jMenu2.add(miUsuarioVisualizarTodos);

        miUsuarioEditar.setText("Editar");
        miUsuarioEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miUsuarioEditarActionPerformed(evt);
            }
        });
        jMenu2.add(miUsuarioEditar);

        jMenuItem7.setText("Deletar");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        miUsuarioVisualizar.setText("Procurar");
        miUsuarioVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miUsuarioVisualizarActionPerformed(evt);
            }
        });
        jMenu2.add(miUsuarioVisualizar);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Imóvel");

        miImovelCadastrar.setText("Cadastrar");
        miImovelCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miImovelCadastrarActionPerformed(evt);
            }
        });
        jMenu3.add(miImovelCadastrar);

        jMenuItem4.setText("Visualizar");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuItem8.setText("Editar");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8);

        jMenuItem9.setText("Deletar");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem9);

        jMenuItem3.setText("Procurar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Forma de Pagamento");

        miFormPagamentoCadastrar.setText("Cadastrar");
        miFormPagamentoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miFormPagamentoCadastrarActionPerformed(evt);
            }
        });
        jMenu4.add(miFormPagamentoCadastrar);

        miFormPagamentoVisualizar.setText("Visualizar");
        miFormPagamentoVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miFormPagamentoVisualizarActionPerformed(evt);
            }
        });
        jMenu4.add(miFormPagamentoVisualizar);

        jMenuItem10.setText("Editar");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem10);

        jMenuItem11.setText("Deletar");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem11);

        jMenuItem1.setText("Procurar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem1);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Venda");

        miVendaCadastrar.setText("Cadastrar");
        miVendaCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miVendaCadastrarActionPerformed(evt);
            }
        });
        jMenu5.add(miVendaCadastrar);

        jMenuItem15.setText("Visualizar");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem15);

        jMenuItem12.setText("Editar");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem12);

        jMenuItem13.setText("Deletar");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem13);

        jMenuItem2.setText("Procurar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem2);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        setBounds(0, 0, 750, 566);
    }// </editor-fold>//GEN-END:initComponents

    private void miClienteCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miClienteCadastrarActionPerformed
        FrmCliente obj = new FrmCliente();
        obj.setVisible(true);
    }//GEN-LAST:event_miClienteCadastrarActionPerformed

    private void miUsuarioCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miUsuarioCadastrarActionPerformed
        FrmUsuario obj = new FrmUsuario();
        obj.setVisible(true);
    }//GEN-LAST:event_miUsuarioCadastrarActionPerformed

    private void miImovelCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miImovelCadastrarActionPerformed
        FrmImovel obj = new FrmImovel();
        obj.setVisible(true);
    }//GEN-LAST:event_miImovelCadastrarActionPerformed

    private void miFormPagamentoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miFormPagamentoCadastrarActionPerformed
        FrmFormaPagamento obj = new FrmFormaPagamento();
        obj.setVisible(true);
    }//GEN-LAST:event_miFormPagamentoCadastrarActionPerformed

    private void miVendaCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miVendaCadastrarActionPerformed
        FrmVenda obj = new FrmVenda();
        obj.setVisible(true);
    }//GEN-LAST:event_miVendaCadastrarActionPerformed

    private void miUsuarioVisualizarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miUsuarioVisualizarTodosActionPerformed
        UsuarioCRUD usuario = new UsuarioCRUD();
        String usuarios = "";
        if (usuario.ler().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nenhum Usuario Cadastrado!!");
        } else {
            for (Usuario u : usuario.ler()) {
                usuarios = "";
                usuarios += "Nome: " + u.getNome() + "\n";
                usuarios += "CPF: " + u.getCpf() + "\n";
                usuarios += "Email: " + u.getEmail() + "\n";
                usuarios += "ID: " + u.getId() + "\n\n";
                JOptionPane.showMessageDialog(this, usuarios);
            }
        }
    }//GEN-LAST:event_miUsuarioVisualizarTodosActionPerformed

    private void miUsuarioVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miUsuarioVisualizarActionPerformed
        UsuarioCRUD user = new UsuarioCRUD();
        if (user.ler().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nenhim Usuario Cadastrados!!");
        } else {
            JOptionPane.showMessageDialog(this, user.ler(Integer.parseInt(JOptionPane.showInputDialog(this, "Digite o ID do Usuario a ser pesquisado"))));
        }
    }//GEN-LAST:event_miUsuarioVisualizarActionPerformed

    private void miClienteVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miClienteVisualizarActionPerformed
        ClienteCRUD cliente = new ClienteCRUD();
        String clientes = "";
        if (cliente.ler().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nenhum Usuario Cadastrado!!");
        } else {
            for (Cliente u : cliente.ler()) {
                clientes = "";
                clientes += "Nome: " + u.getNome() + "\n";
                clientes += "CPF: " + u.getCpf() + "\n";
                clientes += "Email: " + u.getEmail() + "\n";
                clientes += "Rua: " + u.getRua() + "\n";
                clientes += "Numero: " + u.getNumero() + "\n";
                clientes += "Cep: " + u.getCep() + "\n";
                clientes += "Bairro: " + u.getBairro() + "\n";
                //cliente += "Uf: " + u.getUf() + "\n"
                clientes += "ID: " + u.getId() + "\n\n";
                JOptionPane.showMessageDialog(this, clientes);
            }
        }
    }//GEN-LAST:event_miClienteVisualizarActionPerformed

    private void miFormPagamentoVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miFormPagamentoVisualizarActionPerformed
        FormaDePagamentoCRUD formaDePagamento = new FormaDePagamentoCRUD();
        String formaDePagamentos = "";
        if (formaDePagamento.ler().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nenhuma forma de pagamento Cadastrada!!");
        } else {
            for (FormaDePagamento u : formaDePagamento.ler()) {
                formaDePagamentos = "";
                formaDePagamentos += "Tipo: " + u.getTipo() + "\n";
                formaDePagamentos += "ID: " + u.getId() + "\n\n";
                JOptionPane.showMessageDialog(this, formaDePagamentos);
            }
        }
    }//GEN-LAST:event_miFormPagamentoVisualizarActionPerformed

    private void miUsuarioEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miUsuarioEditarActionPerformed
        FrmUsuario editar = new FrmUsuario(Integer.parseInt(JOptionPane.showInputDialog(this, "Digite o Id do usuário a ser alterado: ")));        
    }//GEN-LAST:event_miUsuarioEditarActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        FrmCliente editar = new FrmCliente(Integer.parseInt(JOptionPane.showInputDialog(this, "Digite o Id do cliente a ser alterado: ")));
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
    ClienteCRUD cliente = new ClienteCRUD();
        if (cliente.ler().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nenhum cliente Cadastrados!!");
        } else {
            int escolhido = 0;
            
            escolhido = Integer.parseInt(JOptionPane.showInputDialog(this, "Digite o ID do cliente para ser deletado: "));
            
            for (Cliente u : cliente.ler()) {
                if(u.getId() == escolhido){
                    cliente.ler().remove(u);
                    
                    JOptionPane.showConfirmDialog(null, "Cliente deletado com sucesso!");
                }
            }
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
    UsuarioCRUD usuario = new UsuarioCRUD();
        if (usuario.ler().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nenhum Usuario Cadastrados!!");
        } else {
            int escolhido = 0;
            
            escolhido = Integer.parseInt(JOptionPane.showInputDialog(this, "Digite o ID do usuario para ser deletado: "));
            
            for (Usuario u : usuario.ler()) {
                if(u.getId() == escolhido){
                    usuario.ler().remove(u);
                    
                    JOptionPane.showConfirmDialog(null, "Usuario deletado com sucesso!");
                }
            }
        }
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        ImovelCRUD imovel = new ImovelCRUD();
        if (imovel.ler().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nenhum imovel Cadastrados!!");
        } else {
            int escolhido = 0;
            
            escolhido = Integer.parseInt(JOptionPane.showInputDialog(this, "Digite o ID do imovel para ser deletado: "));
            
            for (Imovel u : imovel.ler()) {
                if(u.getId() == escolhido){
                    imovel.ler().remove(u);
                    
                    JOptionPane.showConfirmDialog(null, "Imovel deletado com sucesso!");
                }
            }
        }
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        FormaDePagamentoCRUD formaDePagamanto = new FormaDePagamentoCRUD();
        if (formaDePagamanto.ler().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nenhum forma de pagamento Cadastrada!!");
        } else {
            int escolhido = 0;
            
            escolhido = Integer.parseInt(JOptionPane.showInputDialog(this, "Digite o ID da forma de pagamento para ser deletado: "));
            
            for (FormaDePagamento u : formaDePagamanto.ler()) {
                if(u.getId() == escolhido){
                    formaDePagamanto.ler().remove(u);
                    
                    JOptionPane.showConfirmDialog(null, "Forma de pagamento deletada com sucesso!");
                }
            }
        }
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        VendaCRUD venda = new VendaCRUD();
        if (venda.ler().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nenhuma venda cadastrada!!");
        } else {
            int escolhido = 0;
            
            escolhido = Integer.parseInt(JOptionPane.showInputDialog(this, "Digite o ID da forma de pagamento para ser deletado: "));
            
            for (Venda u : venda.ler()) {
                if(u.getId() == escolhido){
                    venda.ler().remove(u);
                    
                    JOptionPane.showConfirmDialog(null, "Venda deletada com sucesso!");
                }
            }
        }
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
    ClienteCRUD user = new ClienteCRUD();
        if (user.ler().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nenhum cliente Cadastrado!!");
        } else {
            JOptionPane.showMessageDialog(this, user.ler(Integer.parseInt(JOptionPane.showInputDialog(this, "Digite o ID do cliente a ser pesquisado"))));
        }
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        ImovelCRUD user = new ImovelCRUD();
        if (user.ler().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nenhum imovel Cadastrado!!");
        } else {
            JOptionPane.showMessageDialog(this, user.ler(Integer.parseInt(JOptionPane.showInputDialog(this, "Digite o ID do imovel a ser pesquisado"))));
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        FormaDePagamentoCRUD user = new FormaDePagamentoCRUD();
        if (user.ler().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nenhuma forma de pagamento cadastrada!!");
        } else {
            JOptionPane.showMessageDialog(this, user.ler(Integer.parseInt(JOptionPane.showInputDialog(this, "Digite o ID da forma de pagamento a ser pesquisada"))));
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        VendaCRUD user = new VendaCRUD();
        if (user.ler().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nenhuma venda cadastrada!!");
        } else {
            JOptionPane.showMessageDialog(this, user.ler(Integer.parseInt(JOptionPane.showInputDialog(this, "Digite o ID da venda a ser pesquisada"))));
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        ImovelCRUD imovel = new ImovelCRUD();
        String imoveis = "";
        if (imovel.ler().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nenhum imovel Cadastrado!!");
        } else {
            for (Imovel u : imovel.ler()) {
                imoveis = "";
                imoveis += "Nome: " + u.getNome() + "\n";
                imoveis += "Metros Quadrado: " + u.getMetrosQuad() + "\n";
                imoveis += "Preço: " + u.getPreco() + "\n";
                imoveis += "Descrição: " + u.getDescricao() + "\n";
                imoveis += "Rua: " + u.getRua() + "\n";
                imoveis += "Número: " + u.getNumero() + "\n";
                imoveis += "Cep: " + u.getCep() + "\n";
                imoveis += "Bairro: " + u.getBairro() + "\n";
                //cliente += "Uf: " + u.getUf() + "\n"
                imoveis += "ID: " + u.getId() + "\n\n";
                JOptionPane.showMessageDialog(this, imoveis);
            }
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
    VendaCRUD venda = new VendaCRUD();
        String vendas = "";
        if (venda.ler().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nenhuma venda cadastrada!!");
        } else {
            for (Venda u : venda.ler()) {
                vendas = "";
                vendas += "Parcelas: " + u.getParcelas() + "\n";
                //cliente += "Cliente: " + u.getUf() + "\n"
                //cliente += "Forma de Pagamento: " + u.getUf() + "\n"
                //cliente += "Usuário: " + u.getUf() + "\n"
                //cliente += "Imóvel: " + u.getUf() + "\n"
                vendas += "ID: " + u.getId() + "\n\n";
                JOptionPane.showMessageDialog(this, vendas);
            }
        }
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        FrmImovel editar = new FrmImovel(Integer.parseInt(JOptionPane.showInputDialog(this, "Digite o Id do imovel a ser alterado: ")));        
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        FrmFormaPagamento editar = new FrmFormaPagamento(Integer.parseInt(JOptionPane.showInputDialog(this, "Digite o Id da forma de pagamento a ser alterado: ")));        
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        FrmVenda editar = new FrmVenda(Integer.parseInt(JOptionPane.showInputDialog(this, "Digite o Id da venda a ser alterado: ")));        
    }//GEN-LAST:event_jMenuItem12ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem miClienteCadastrar;
    private javax.swing.JMenuItem miClienteVisualizar;
    private javax.swing.JMenuItem miFormPagamentoCadastrar;
    private javax.swing.JMenuItem miFormPagamentoVisualizar;
    private javax.swing.JMenuItem miImovelCadastrar;
    private javax.swing.JMenuItem miUsuarioCadastrar;
    private javax.swing.JMenuItem miUsuarioEditar;
    private javax.swing.JMenuItem miUsuarioVisualizar;
    private javax.swing.JMenuItem miUsuarioVisualizarTodos;
    private javax.swing.JMenuItem miVendaCadastrar;
    // End of variables declaration//GEN-END:variables
}


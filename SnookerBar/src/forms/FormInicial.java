/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import classes.Conexao;
import classes.Usuarios;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;

/**
 *
 * @author Yanni
 */
public class FormInicial extends javax.swing.JFrame {

    //Conexao v = new Conexao();
    /**
     * Creates new form NewMDIApplication
     */
    
    public FormInicial() {
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

        desktopPane = new javax.swing.JDesktopPane();
        lblBemVindo = new javax.swing.JLabel();
        menuPrincipal = new javax.swing.JMenuBar();
        menuComanda = new javax.swing.JMenu();
        menuAbertura = new javax.swing.JMenu();
        menuAbrirComanda = new javax.swing.JMenuItem();
        menuConsultarAbertura = new javax.swing.JMenuItem();
        menuAlterarAbertura = new javax.swing.JMenuItem();
        menuFecharAbertura = new javax.swing.JMenuItem();
        menuCadastrarComanda = new javax.swing.JMenuItem();
        menuConsultarComanda = new javax.swing.JMenuItem();
        menuAlterarComanda = new javax.swing.JMenuItem();
        menuAtendimento = new javax.swing.JMenu();
        menuIniciarAtendimento = new javax.swing.JMenuItem();
        menuConsultarAtendimento = new javax.swing.JMenuItem();
        menuAlterarAtendimento = new javax.swing.JMenuItem();
        menuExcluirAtendimento = new javax.swing.JMenuItem();
        menuMesa = new javax.swing.JMenu();
        menuCadastrarMesa = new javax.swing.JMenuItem();
        menuConsultarMesa = new javax.swing.JMenuItem();
        menuAlterarMesa = new javax.swing.JMenuItem();
        menuProduto = new javax.swing.JMenu();
        menuCadastrarProduto = new javax.swing.JMenuItem();
        menuConsultarProduto = new javax.swing.JMenuItem();
        menuAlterarProduto = new javax.swing.JMenuItem();
        menuExcluirProduto = new javax.swing.JMenuItem();
        menuServico = new javax.swing.JMenu();
        menuCadastrarServico = new javax.swing.JMenuItem();
        menuConsultarServico = new javax.swing.JMenuItem();
        menuAlterarServico = new javax.swing.JMenuItem();
        menuExcluirServico = new javax.swing.JMenuItem();
        menuUsuario = new javax.swing.JMenu();
        menuCadastrarUsuario = new javax.swing.JMenuItem();
        menuConsultarUsuario = new javax.swing.JMenuItem();
        menuAlterarUsuario = new javax.swing.JMenuItem();
        menuExcluirUsuario = new javax.swing.JMenuItem();
        menuFuncionario = new javax.swing.JMenu();
        menuCadastrarFuncionario = new javax.swing.JMenuItem();
        menuConsultarFuncionario = new javax.swing.JMenuItem();
        menuAlterarFuncionario = new javax.swing.JMenuItem();
        menuExcluirFuncionario = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kuka & Beludo Snooker Bar - Menu Principal");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblBemVindo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblBemVindo.setForeground(new java.awt.Color(255, 255, 255));
        lblBemVindo.setBounds(40, 40, 260, 40);
        desktopPane.add(lblBemVindo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        menuComanda.setText("Comanda");

        menuAbertura.setText("Abertura");

        menuAbrirComanda.setText("Abrir");
        menuAbertura.add(menuAbrirComanda);

        menuConsultarAbertura.setText("Consultar");
        menuAbertura.add(menuConsultarAbertura);

        menuAlterarAbertura.setText("Alterar");
        menuAbertura.add(menuAlterarAbertura);

        menuFecharAbertura.setText("Fechar");
        menuAbertura.add(menuFecharAbertura);

        menuComanda.add(menuAbertura);

        menuCadastrarComanda.setText("Cadastrar");
        menuCadastrarComanda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastrarComandaActionPerformed(evt);
            }
        });
        menuComanda.add(menuCadastrarComanda);

        menuConsultarComanda.setText("Consultar");
        menuConsultarComanda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultarComandaActionPerformed(evt);
            }
        });
        menuComanda.add(menuConsultarComanda);

        menuAlterarComanda.setText("Alterar");
        menuAlterarComanda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAlterarComandaActionPerformed(evt);
            }
        });
        menuComanda.add(menuAlterarComanda);

        menuPrincipal.add(menuComanda);

        menuAtendimento.setText("Atendimento");

        menuIniciarAtendimento.setText("Iniciar");
        menuAtendimento.add(menuIniciarAtendimento);

        menuConsultarAtendimento.setText("Consultar");
        menuAtendimento.add(menuConsultarAtendimento);

        menuAlterarAtendimento.setText("Alterar");
        menuAtendimento.add(menuAlterarAtendimento);

        menuExcluirAtendimento.setText("Excluir");
        menuAtendimento.add(menuExcluirAtendimento);

        menuPrincipal.add(menuAtendimento);

        menuMesa.setText("Mesa");

        menuCadastrarMesa.setText("Cadastrar");
        menuCadastrarMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastrarMesaActionPerformed(evt);
            }
        });
        menuMesa.add(menuCadastrarMesa);

        menuConsultarMesa.setText("Consultar");
        menuConsultarMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultarMesaActionPerformed(evt);
            }
        });
        menuMesa.add(menuConsultarMesa);

        menuAlterarMesa.setText("Alterar");
        menuAlterarMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAlterarMesaActionPerformed(evt);
            }
        });
        menuMesa.add(menuAlterarMesa);

        menuPrincipal.add(menuMesa);

        menuProduto.setText("Produto");

        menuCadastrarProduto.setText("Cadastrar");
        menuCadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastrarProdutoActionPerformed(evt);
            }
        });
        menuProduto.add(menuCadastrarProduto);

        menuConsultarProduto.setText("Consultar");
        menuProduto.add(menuConsultarProduto);

        menuAlterarProduto.setText("Alterar");
        menuProduto.add(menuAlterarProduto);

        menuExcluirProduto.setText("Excluir");
        menuProduto.add(menuExcluirProduto);

        menuPrincipal.add(menuProduto);

        menuServico.setText("Serviço");

        menuCadastrarServico.setText("Cadastrar");
        menuCadastrarServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastrarServicoActionPerformed(evt);
            }
        });
        menuServico.add(menuCadastrarServico);

        menuConsultarServico.setText("Consultar");
        menuServico.add(menuConsultarServico);

        menuAlterarServico.setText("Alterar");
        menuServico.add(menuAlterarServico);

        menuExcluirServico.setText("Excluir");
        menuServico.add(menuExcluirServico);

        menuPrincipal.add(menuServico);

        menuUsuario.setText("Usuário");

        menuCadastrarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Add-User.png"))); // NOI18N
        menuCadastrarUsuario.setText("Cadastrar");
        menuCadastrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastrarUsuarioActionPerformed(evt);
            }
        });
        menuUsuario.add(menuCadastrarUsuario);

        menuConsultarUsuario.setText("Consultar");
        menuUsuario.add(menuConsultarUsuario);

        menuAlterarUsuario.setText("Alterar");
        menuUsuario.add(menuAlterarUsuario);

        menuExcluirUsuario.setText("Excluir");
        menuUsuario.add(menuExcluirUsuario);

        menuPrincipal.add(menuUsuario);

        menuFuncionario.setText("Funcionário");

        menuCadastrarFuncionario.setText("Cadastrar");
        menuCadastrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastrarFuncionarioActionPerformed(evt);
            }
        });
        menuFuncionario.add(menuCadastrarFuncionario);

        menuConsultarFuncionario.setText("Consultar");
        menuFuncionario.add(menuConsultarFuncionario);

        menuAlterarFuncionario.setText("Alterar");
        menuFuncionario.add(menuAlterarFuncionario);

        menuExcluirFuncionario.setText("Excluir");
        menuFuncionario.add(menuExcluirFuncionario);

        menuPrincipal.add(menuFuncionario);

        setJMenuBar(menuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void adicionarJInternalFrame(JInternalFrame frame)
    {
        frame.setVisible(true);
        frame.setFrameIcon(new ImageIcon(getClass().getResource("/imagens/icon.png")));
        desktopPane.add(frame);
    }
    
    private void menuCadastrarComandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarComandaActionPerformed
        FormCadastrarComanda fcc = new FormCadastrarComanda();
        adicionarJInternalFrame(fcc);
    }//GEN-LAST:event_menuCadastrarComandaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setIconImage(new ImageIcon(getClass().getResource("/imagens/icon.png")).getImage());   
        setExtendedState(MAXIMIZED_BOTH);  
        //System.out.println("adm? " + v.adm);
        
        if(Conexao.adm)
        {
            lblBemVindo.setText("Bem-vindo administrador");
        }
        else 
        {
            lblBemVindo.setText("Bem-vindo usuário");
        }
    }//GEN-LAST:event_formWindowOpened

    private void menuCadastrarMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarMesaActionPerformed
        FormCadastrarMesa fcm = new FormCadastrarMesa();
        adicionarJInternalFrame(fcm);
    }//GEN-LAST:event_menuCadastrarMesaActionPerformed

    private void menuCadastrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarUsuarioActionPerformed
        FormCadastrarUsuario fcu = new FormCadastrarUsuario();
        adicionarJInternalFrame(fcu);
    }//GEN-LAST:event_menuCadastrarUsuarioActionPerformed

    private void menuCadastrarServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarServicoActionPerformed
        FormCadastrarServico fcs = new FormCadastrarServico();
        adicionarJInternalFrame(fcs);
    }//GEN-LAST:event_menuCadastrarServicoActionPerformed

    private void menuCadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarProdutoActionPerformed
        FormCadastrarProduto fcp = new FormCadastrarProduto();
        adicionarJInternalFrame(fcp);
    }//GEN-LAST:event_menuCadastrarProdutoActionPerformed

    private void menuCadastrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarFuncionarioActionPerformed
        FormCadastrarFuncionario fcf = new FormCadastrarFuncionario();
        adicionarJInternalFrame(fcf);
    }//GEN-LAST:event_menuCadastrarFuncionarioActionPerformed

    private void menuConsultarComandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultarComandaActionPerformed
        FormSelecionarComanda fsc = new FormSelecionarComanda();
        adicionarJInternalFrame(fsc);
    }//GEN-LAST:event_menuConsultarComandaActionPerformed

    private void menuAlterarComandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAlterarComandaActionPerformed
        //chamando o consultar, porque para alterar ele tem que consultar antes
        menuConsultarComandaActionPerformed(evt);
    }//GEN-LAST:event_menuAlterarComandaActionPerformed

    private void menuConsultarMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultarMesaActionPerformed
        FormSelecionarMesa fsm = new FormSelecionarMesa();
        adicionarJInternalFrame(fsm);
    }//GEN-LAST:event_menuConsultarMesaActionPerformed

    private void menuAlterarMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAlterarMesaActionPerformed
        menuAlterarMesaActionPerformed(evt);
    }//GEN-LAST:event_menuAlterarMesaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.fcc/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormInicial().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JLabel lblBemVindo;
    private javax.swing.JMenu menuAbertura;
    private javax.swing.JMenuItem menuAbrirComanda;
    private javax.swing.JMenuItem menuAlterarAbertura;
    private javax.swing.JMenuItem menuAlterarAtendimento;
    private javax.swing.JMenuItem menuAlterarComanda;
    private javax.swing.JMenuItem menuAlterarFuncionario;
    private javax.swing.JMenuItem menuAlterarMesa;
    private javax.swing.JMenuItem menuAlterarProduto;
    private javax.swing.JMenuItem menuAlterarServico;
    private javax.swing.JMenuItem menuAlterarUsuario;
    private javax.swing.JMenu menuAtendimento;
    private javax.swing.JMenuItem menuCadastrarComanda;
    private javax.swing.JMenuItem menuCadastrarFuncionario;
    private javax.swing.JMenuItem menuCadastrarMesa;
    private javax.swing.JMenuItem menuCadastrarProduto;
    private javax.swing.JMenuItem menuCadastrarServico;
    private javax.swing.JMenuItem menuCadastrarUsuario;
    private javax.swing.JMenu menuComanda;
    private javax.swing.JMenuItem menuConsultarAbertura;
    private javax.swing.JMenuItem menuConsultarAtendimento;
    private javax.swing.JMenuItem menuConsultarComanda;
    private javax.swing.JMenuItem menuConsultarFuncionario;
    private javax.swing.JMenuItem menuConsultarMesa;
    private javax.swing.JMenuItem menuConsultarProduto;
    private javax.swing.JMenuItem menuConsultarServico;
    private javax.swing.JMenuItem menuConsultarUsuario;
    private javax.swing.JMenuItem menuExcluirAtendimento;
    private javax.swing.JMenuItem menuExcluirFuncionario;
    private javax.swing.JMenuItem menuExcluirProduto;
    private javax.swing.JMenuItem menuExcluirServico;
    private javax.swing.JMenuItem menuExcluirUsuario;
    private javax.swing.JMenuItem menuFecharAbertura;
    private javax.swing.JMenu menuFuncionario;
    private javax.swing.JMenuItem menuIniciarAtendimento;
    private javax.swing.JMenu menuMesa;
    private javax.swing.JMenuBar menuPrincipal;
    private javax.swing.JMenu menuProduto;
    private javax.swing.JMenu menuServico;
    private javax.swing.JMenu menuUsuario;
    // End of variables declaration//GEN-END:variables
}

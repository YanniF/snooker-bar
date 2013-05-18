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
        btnSair = new javax.swing.JButton();
        menuPrincipal = new javax.swing.JMenuBar();
        menuComanda = new javax.swing.JMenu();
        menuAberturaComanda = new javax.swing.JMenu();
        menuAbrirComanda = new javax.swing.JMenuItem();
        menuConsultarAberturaComanda = new javax.swing.JMenuItem();
        menuAlterarAberturaComanda = new javax.swing.JMenuItem();
        menuFecharAberturaComanda = new javax.swing.JMenuItem();
        menuConsultarComanda = new javax.swing.JMenuItem();
        menuAtendimento = new javax.swing.JMenu();
        menuIniciarAtendimento = new javax.swing.JMenuItem();
        menuConsultarAtendimento = new javax.swing.JMenuItem();
        menuAlterarAtendimento = new javax.swing.JMenuItem();
        menuExcluirAtendimento = new javax.swing.JMenuItem();
        menuMesa = new javax.swing.JMenu();
        menuAberturaMesa = new javax.swing.JMenu();
        menuAbrirMesa = new javax.swing.JMenuItem();
        menuConsultarAberturaMesa = new javax.swing.JMenuItem();
        menuAlterarAberturaMesa = new javax.swing.JMenuItem();
        menuFecharAberturaMesa = new javax.swing.JMenuItem();
        menuConsultarMesa = new javax.swing.JMenuItem();
        menuProduto = new javax.swing.JMenu();
        menuConsultarProduto = new javax.swing.JMenuItem();
        menuServico = new javax.swing.JMenu();
        menuConsultarServico = new javax.swing.JMenuItem();
        menuUsuario = new javax.swing.JMenu();
        menuConsultarUsuario = new javax.swing.JMenuItem();
        menuFuncionario = new javax.swing.JMenu();
        menuConsultarFuncionario = new javax.swing.JMenuItem();

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

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        btnSair.setBounds(500, 20, 70, 23);
        desktopPane.add(btnSair, javax.swing.JLayeredPane.DEFAULT_LAYER);

        menuComanda.setText("Comanda");

        menuAberturaComanda.setText("Abertura");

        menuAbrirComanda.setText("Abrir");
        menuAbrirComanda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAbrirComandaActionPerformed(evt);
            }
        });
        menuAberturaComanda.add(menuAbrirComanda);

        menuConsultarAberturaComanda.setText("Consultar");
        menuAberturaComanda.add(menuConsultarAberturaComanda);

        menuAlterarAberturaComanda.setText("Alterar");
        menuAlterarAberturaComanda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAlterarAberturaComandaActionPerformed(evt);
            }
        });
        menuAberturaComanda.add(menuAlterarAberturaComanda);

        menuFecharAberturaComanda.setText("Fechar");
        menuFecharAberturaComanda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFecharAberturaComandaActionPerformed(evt);
            }
        });
        menuAberturaComanda.add(menuFecharAberturaComanda);

        menuComanda.add(menuAberturaComanda);

        menuConsultarComanda.setText("Consultar");
        menuConsultarComanda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultarComandaActionPerformed(evt);
            }
        });
        menuComanda.add(menuConsultarComanda);

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

        menuAberturaMesa.setText("Abertura");

        menuAbrirMesa.setText("Abrir");
        menuAberturaMesa.add(menuAbrirMesa);

        menuConsultarAberturaMesa.setText("Consultar");
        menuAberturaMesa.add(menuConsultarAberturaMesa);

        menuAlterarAberturaMesa.setText("Alterar");
        menuAberturaMesa.add(menuAlterarAberturaMesa);

        menuFecharAberturaMesa.setText("Fechar");
        menuAberturaMesa.add(menuFecharAberturaMesa);

        menuMesa.add(menuAberturaMesa);

        menuConsultarMesa.setText("Consultar");
        menuConsultarMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultarMesaActionPerformed(evt);
            }
        });
        menuMesa.add(menuConsultarMesa);

        menuPrincipal.add(menuMesa);

        menuProduto.setText("Produto");

        menuConsultarProduto.setText("Consultar");
        menuConsultarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultarProdutoActionPerformed(evt);
            }
        });
        menuProduto.add(menuConsultarProduto);

        menuPrincipal.add(menuProduto);

        menuServico.setText("Serviço");

        menuConsultarServico.setText("Consultar");
        menuConsultarServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultarServicoActionPerformed(evt);
            }
        });
        menuServico.add(menuConsultarServico);

        menuPrincipal.add(menuServico);

        menuUsuario.setText("Usuário");

        menuConsultarUsuario.setText("Consultar");
        menuConsultarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultarUsuarioActionPerformed(evt);
            }
        });
        menuUsuario.add(menuConsultarUsuario);

        menuPrincipal.add(menuUsuario);

        menuFuncionario.setText("Funcionário");

        menuConsultarFuncionario.setText("Consultar");
        menuConsultarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultarFuncionarioActionPerformed(evt);
            }
        });
        menuFuncionario.add(menuConsultarFuncionario);

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
            .addComponent(desktopPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Insere o internal frama no desktop
    public void adicionarJInternalFrame(JInternalFrame frame)
    {
        frame.setVisible(true);
        frame.setFrameIcon(new ImageIcon(getClass().getResource("/imagens/icon.png")));
        desktopPane.add(frame);
    }
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setIconImage(new ImageIcon(getClass().getResource("/imagens/icon.png")).getImage());   
        setExtendedState(MAXIMIZED_BOTH);  
        
        lblBemVindo.setText("Bem-vindo(a) " + Usuarios.nome + "!");            
    }//GEN-LAST:event_formWindowOpened

    private void menuConsultarComandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultarComandaActionPerformed
        FormSelecionarComanda fsc = new FormSelecionarComanda();
        adicionarJInternalFrame(fsc);
    }//GEN-LAST:event_menuConsultarComandaActionPerformed

    private void menuConsultarMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultarMesaActionPerformed
        FormSelecionarMesa fsm = new FormSelecionarMesa();
        adicionarJInternalFrame(fsm);
    }//GEN-LAST:event_menuConsultarMesaActionPerformed

    private void menuConsultarServicoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_menuConsultarServicoActionPerformed
    {//GEN-HEADEREND:event_menuConsultarServicoActionPerformed
        FormSelecionarServico fss = new FormSelecionarServico();
        adicionarJInternalFrame(fss);
    }//GEN-LAST:event_menuConsultarServicoActionPerformed

    private void menuConsultarUsuarioActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_menuConsultarUsuarioActionPerformed
    {//GEN-HEADEREND:event_menuConsultarUsuarioActionPerformed
        FormSelecionarUsuario fsu = new FormSelecionarUsuario();
        adicionarJInternalFrame(fsu);
    }//GEN-LAST:event_menuConsultarUsuarioActionPerformed

    private void menuConsultarFuncionarioActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_menuConsultarFuncionarioActionPerformed
    {//GEN-HEADEREND:event_menuConsultarFuncionarioActionPerformed
        FormSelecionarFuncionario fsf = new FormSelecionarFuncionario();
        adicionarJInternalFrame(fsf);
    }//GEN-LAST:event_menuConsultarFuncionarioActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSairActionPerformed
    {//GEN-HEADEREND:event_btnSairActionPerformed
        this.dispose();
        Usuarios.adm = false;
        Usuarios.nome = null;
        Conexao.desconectar();
        
        FormLogin fl = new FormLogin();
        fl.setVisible(true);
    }//GEN-LAST:event_btnSairActionPerformed

    private void menuAbrirComandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAbrirComandaActionPerformed
        FormAberturaComanda fac = new FormAberturaComanda();
        adicionarJInternalFrame(fac);
    }//GEN-LAST:event_menuAbrirComandaActionPerformed

    private void menuFecharAberturaComandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFecharAberturaComandaActionPerformed
        FormFecharComanda ffc = new FormFecharComanda();
        adicionarJInternalFrame(ffc);
    }//GEN-LAST:event_menuFecharAberturaComandaActionPerformed

    private void menuAlterarAberturaComandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAlterarAberturaComandaActionPerformed
        FormAlterarComanda fac = new FormAlterarComanda();
        adicionarJInternalFrame(fac);
    }//GEN-LAST:event_menuAlterarAberturaComandaActionPerformed

    private void menuConsultarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultarProdutoActionPerformed
        FormSelecionarProduto fsp = new FormSelecionarProduto();
        adicionarJInternalFrame(fsp);
    }//GEN-LAST:event_menuConsultarProdutoActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSair;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JLabel lblBemVindo;
    private javax.swing.JMenu menuAberturaComanda;
    private javax.swing.JMenu menuAberturaMesa;
    private javax.swing.JMenuItem menuAbrirComanda;
    private javax.swing.JMenuItem menuAbrirMesa;
    private javax.swing.JMenuItem menuAlterarAberturaComanda;
    private javax.swing.JMenuItem menuAlterarAberturaMesa;
    private javax.swing.JMenuItem menuAlterarAtendimento;
    private javax.swing.JMenu menuAtendimento;
    private javax.swing.JMenu menuComanda;
    private javax.swing.JMenuItem menuConsultarAberturaComanda;
    private javax.swing.JMenuItem menuConsultarAberturaMesa;
    private javax.swing.JMenuItem menuConsultarAtendimento;
    private javax.swing.JMenuItem menuConsultarComanda;
    private javax.swing.JMenuItem menuConsultarFuncionario;
    private javax.swing.JMenuItem menuConsultarMesa;
    private javax.swing.JMenuItem menuConsultarProduto;
    private javax.swing.JMenuItem menuConsultarServico;
    private javax.swing.JMenuItem menuConsultarUsuario;
    private javax.swing.JMenuItem menuExcluirAtendimento;
    private javax.swing.JMenuItem menuFecharAberturaComanda;
    private javax.swing.JMenuItem menuFecharAberturaMesa;
    private javax.swing.JMenu menuFuncionario;
    private javax.swing.JMenuItem menuIniciarAtendimento;
    private javax.swing.JMenu menuMesa;
    private javax.swing.JMenuBar menuPrincipal;
    private javax.swing.JMenu menuProduto;
    private javax.swing.JMenu menuServico;
    private javax.swing.JMenu menuUsuario;
    // End of variables declaration//GEN-END:variables
}

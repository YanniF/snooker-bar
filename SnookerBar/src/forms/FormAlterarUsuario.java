package forms;

import classes.Conexao;
import classes.Utilitarios;
import javax.swing.JOptionPane;

/**
 *
 * @author Yanni
 */
public class FormAlterarUsuario extends javax.swing.JInternalFrame {

    /**
     * Creates new form FormCadastrarUsuario
     */
    Utilitarios u = new Utilitarios();
    
    public FormAlterarUsuario() {
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

        administradorbuttonGroup = new javax.swing.ButtonGroup();
        lblCdUsuario = new javax.swing.JLabel();
        txtCdUsuario = new javax.swing.JTextField();
        txtNmLoginUsuario = new javax.swing.JTextField();
        lblNmLoginUsuario = new javax.swing.JLabel();
        lblSenhaUsuario = new javax.swing.JLabel();
        txtNmSenhaUsuario = new javax.swing.JPasswordField();
        administradorPanel = new javax.swing.JPanel();
        rbtNao = new javax.swing.JRadioButton();
        rbtSim = new javax.swing.JRadioButton();
        btnAlterar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Alterar Usuário");

        lblCdUsuario.setText("Código:");

        txtCdUsuario.setToolTipText("Digite o código do usuário");
        txtCdUsuario.setEnabled(false);

        txtNmLoginUsuario.setToolTipText("Digite o nome do usuário");
        txtNmLoginUsuario.setEnabled(false);

        lblNmLoginUsuario.setText("Usuário:");

        lblSenhaUsuario.setText("Senha:");

        txtNmSenhaUsuario.setToolTipText("Digite a senha");

        administradorPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Administrador?"));
        administradorPanel.setToolTipText("Esse usuário é administrador?");

        administradorbuttonGroup.add(rbtNao);
        rbtNao.setText("Não");
        rbtNao.setToolTipText("Selecione esta opção se não for o administrador");

        administradorbuttonGroup.add(rbtSim);
        rbtSim.setSelected(true);
        rbtSim.setText("Sim");
        rbtSim.setToolTipText("Selecione esta opção se for administrador");

        javax.swing.GroupLayout administradorPanelLayout = new javax.swing.GroupLayout(administradorPanel);
        administradorPanel.setLayout(administradorPanelLayout);
        administradorPanelLayout.setHorizontalGroup(
            administradorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(administradorPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(administradorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtNao)
                    .addComponent(rbtSim))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        administradorPanelLayout.setVerticalGroup(
            administradorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, administradorPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbtSim)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(rbtNao)
                .addContainerGap())
        );

        btnAlterar.setText("Alterar");
        btnAlterar.setToolTipText("Clique aqui para alterar o usuário");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.setToolTipText("Clique aqui para limpar os valores");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNmLoginUsuario)
                            .addComponent(lblCdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNmLoginUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSenhaUsuario)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(administradorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNmSenhaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCdUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNmLoginUsuario)
                    .addComponent(txtNmLoginUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSenhaUsuario)
                    .addComponent(txtNmSenhaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(administradorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlterar)
                    .addComponent(btnLimpar))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-254)/2, (screenSize.height-309)/2, 254, 309);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtNmSenhaUsuario.setText("");
        txtNmSenhaUsuario.requestFocus();
        rbtSim.setSelected(true);
        rbtNao.setSelected(true);
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAlterarActionPerformed
    {//GEN-HEADEREND:event_btnAlterarActionPerformed
        try
        {
            int cod = Integer.parseInt(txtCdUsuario.getText());
            String nome = txtNmLoginUsuario.getText();
            String senha = String.valueOf(txtNmSenhaUsuario.getPassword());
            char admin = ' '; 
            
            if(rbtSim.isSelected()) {
                admin = 'S';
            }
            else if(rbtNao.isSelected()) {
                admin = 'N';
            }
            
            String sql = "UPDATE usuario SET nm_login_usuario = LOWER('" + nome + "'), nm_senha_usuario = '" + 
                    Utilitarios.md5Java(senha) + "', ic_administrador_sim_nao = '" + admin + "' WHERE cd_usuario = " + cod;
            System.out.println(sql);
            if(Conexao.atualizar(sql) == -1)
            {
                JOptionPane.showMessageDialog(null, "O registro não pode ser alterado:\n" + Conexao.getErro(), "Erro", 0);
                this.dispose();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Registro alterado com sucesso.", "Aviso", 1);
                this.dispose();
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Erro: \n" + e.getMessage(), "Erro!", 0);
            this.dispose();
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    public void passarValoresUsuario(int cod, String usuario, String adm) 
    {
        txtCdUsuario.setText(Integer.toString(cod));
        txtNmLoginUsuario.setText(usuario);
        
        if(adm.equalsIgnoreCase("sim")) {
            rbtSim.setSelected(true);
        }
        else if(adm.equalsIgnoreCase("não")) {
            rbtNao.setSelected(true);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel administradorPanel;
    private javax.swing.ButtonGroup administradorbuttonGroup;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JLabel lblCdUsuario;
    private javax.swing.JLabel lblNmLoginUsuario;
    private javax.swing.JLabel lblSenhaUsuario;
    private javax.swing.JRadioButton rbtNao;
    private javax.swing.JRadioButton rbtSim;
    private javax.swing.JTextField txtCdUsuario;
    private javax.swing.JTextField txtNmLoginUsuario;
    private javax.swing.JPasswordField txtNmSenhaUsuario;
    // End of variables declaration//GEN-END:variables
}

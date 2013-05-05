/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import classes.Conexao;
import classes.Usuarios;
import classes.Utilitarios;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Yanni
 */
public class FormLogin extends javax.swing.JFrame {

    Utilitarios u = new Utilitarios();
    Conexao con = new Conexao();
    
    /**
     * Creates new form FormLogin
     */
    public FormLogin() {
        initComponents();
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        lblUsuario = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        txtSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kuka & Beludo -  Login");
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowOpened(java.awt.event.WindowEvent evt)
            {
                formWindowOpened(evt);
            }
        });

        lblUsuario.setText("Usuário:");

        lblSenha.setText("Senha:");

        txtUsuario.setText("admin");
        txtUsuario.setToolTipText("Digite o usuário");

        btnLogin.setText("Login");
        btnLogin.setToolTipText("Clique aqui para entrar no sistema");
        btnLogin.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnLoginActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.setToolTipText("Clique aqui para limpar os campos");
        btnLimpar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnLimparActionPerformed(evt);
            }
        });

        txtSenha.setText("admin");
        txtSenha.setToolTipText("Digite a senha");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSenha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSenha))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btnLogin)
                        .addGap(35, 35, 35)
                        .addComponent(btnLimpar)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuario)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSenha)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin)
                    .addComponent(btnLimpar))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-293)/2, (screenSize.height-261)/2, 293, 261);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setResizable(false);
        this.setIconImage(new ImageIcon(getClass().getResource("/imagens/icon.png")).getImage());  
        
        try {
            Conexao.conectar("snooker", "snooker");
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: \n" + e.getMessage(), "Erro!", 0);
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        u.limparTextFields(this);
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        try
        {
            String usuario = txtUsuario.getText();
            String senha = String.valueOf(txtSenha.getPassword());
            String sql = "SELECT nm_login_usuario, nm_senha_usuario, ic_administrador_sim_nao FROM usuario WHERE nm_login_usuario = '" + usuario + "'";            
            boolean login = false;  
            
            ResultSet resultado = Conexao.consultar(sql);            
         
            if(Conexao.consultar(sql) == null)
            {
                JOptionPane.showMessageDialog(null, "Erro na consulta.", "Erro!", 0);
            }
            else
            { 
                while(resultado.next())
                {
                    if(usuario.equals(resultado.getString("nm_login_usuario")) && senha.equals(resultado.getString("nm_senha_usuario")))
                    {
                        login = true;
                        FormInicial fi = new FormInicial();
                        fi.setVisible(true);
                        this.dispose();
                        
                        if(resultado.getString("ic_administrador_sim_nao").equalsIgnoreCase("s")) {
                            Usuarios.adm = true;
                        }
                        else {
                            Usuarios.adm = false;
                        }
                        
                        String sql2 = "SELECT f.nm_funcionario FROM funcionario f, usuario u "
                                + "WHERE f.cd_usuario = u.cd_usuario AND u.nm_login_usuario='" + usuario + "'";
                        
                        ResultSet res = Conexao.consultar(sql2);
                        String nome = "";
                        
                        while(res.next())
                        {
                            nome = res.getString("nm_funcionario");
                        }
                        String [] aux  = nome.split(" ");
                        Usuarios.nome = aux[0];
                        
                        if(Usuarios.nome == null)
                            Usuarios.nome = "";
                    } 
                } 
                
                if(!login)
                {
                    JOptionPane.showMessageDialog(null, "Usuário ou senha inválido", "Aviso!", 2);
                    u.limparTextFields(this);
                }
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Erro: \n" + e.getMessage(), "Erro!", 0);
        }
        
    }//GEN-LAST:event_btnLoginActionPerformed

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
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormLogin().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import classes.Conexao;
import classes.Usuarios;
import classes.Utilitarios;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Yanni
 */
public class FormSelecionarUsuario extends javax.swing.JInternalFrame {

    Utilitarios u = new Utilitarios();
    DefaultTableModel modelo;
    public int first = 0;  

    /**
     * Creates new form FormSelecionarUsuario
     */
    public FormSelecionarUsuario()
    {
        initComponents();

        btnPesquisarTudoActionPerformed(null);
        
        if(!Usuarios.adm){
            btnCadastrar.setEnabled(false);
            btnCadastrar.setToolTipText(null);
            btnAlterar.setEnabled(false);
            btnAlterar.setToolTipText(null);
            btnExcluir.setEnabled(false);
            btnExcluir.setToolTipText(null);
        }
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

        pesquisarButtonGroup = new javax.swing.ButtonGroup();
        btnPesquisarTudo = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        jScrollPane = new javax.swing.JScrollPane();
        tabelaUsuario = new javax.swing.JTable();
        btnCadastrar = new javax.swing.JButton();
        txtTermoUsuario = new javax.swing.JTextField();
        lblTermoUsuario = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Consultar Usuário");

        btnPesquisarTudo.setText("Pesquisar tudo");
        btnPesquisarTudo.setToolTipText("Clique aqui para pesquisar todos os usuários");
        btnPesquisarTudo.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnPesquisarTudoActionPerformed(evt);
            }
        });

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.setToolTipText("Clique aqui para pesquisar por código, nome ou tipo de usuário");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.setToolTipText("Selecione a linha e clique aqui para excluir o usuário");
        btnExcluir.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnExcluirActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.setToolTipText("Selecione a linha e clique aqui para alterar o usuário");
        btnAlterar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAlterarActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.setToolTipText("Clique aqui para limpar os valores");
        btnLimpar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnLimparActionPerformed(evt);
            }
        });

        tabelaUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "Código", "Login", "Administrador?"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean []
            {
                false, false, false
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        jScrollPane.setViewportView(tabelaUsuario);

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setToolTipText("Clique aqui para cadastrar uma comanda");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCadastrarActionPerformed(evt);
            }
        });

        txtTermoUsuario.setToolTipText("Digite o código, nome ou o tipo de usuário para pesquisar");

        lblTermoUsuario.setText("Pesquisar:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTermoUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtTermoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPesquisarTudo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(71, 71, 71))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTermoUsuario)
                    .addComponent(txtTermoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPesquisar)
                    .addComponent(btnPesquisarTudo)
                    .addComponent(btnLimpar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-479)/2, (screenSize.height-467)/2, 479, 467);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnLimparActionPerformed
    {//GEN-HEADEREND:event_btnLimparActionPerformed
        try
        {
            for (int c = modelo.getRowCount() - 1; c >= 0; c--)
            {
                modelo.removeRow(c);
            }
        }
        catch (NullPointerException e)
        {
            System.out.println("Não há dados na tabela");
        }
        u.limparTextFields(this);
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAlterarActionPerformed
    {//GEN-HEADEREND:event_btnAlterarActionPerformed
        if (tabelaUsuario.getSelectedRow() >= 0)
        {
            FormAlterarUsuario fau = new FormAlterarUsuario();
            this.getDesktopPane().add(fau);
            fau.setFrameIcon(new ImageIcon(getClass().getResource("/imagens/icon.png")));
            fau.setVisible(true);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Selecione alguma linha para alterar.", "Aviso", 2);
        }

    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnPesquisarTudoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnPesquisarTudoActionPerformed
    {//GEN-HEADEREND:event_btnPesquisarTudoActionPerformed
        modelo = (DefaultTableModel) tabelaUsuario.getModel();
        modelo.setRowCount(0);
        String admin;
        first++;

        try
        {
            String sql = "SELECT * FROM USUARIO ORDER BY 1";
            ResultSet res = Conexao.consultar(sql);

            if (Conexao.consultar(sql) == null)
            {
                JOptionPane.showMessageDialog(null, "Erro na consulta.", "Erro!", 0);
            }
            else
            {
                if (Conexao.consultar(sql).next())
                {
                    while (res.next())
                    {
                        if (res.getString("ic_administrador_sim_nao").equalsIgnoreCase("s"))
                        {
                            admin = "Sim";
                        }
                        else
                        {
                            admin = "Não";
                        }

                        modelo.addRow(new Object[]
                                {
                                    res.getInt("cd_usuario"),
                                    res.getString("nm_login_usuario"),
                                    admin
                                });
                    }
                }
                else
                {
                    if(first > 1)
                    {
                        JOptionPane.showMessageDialog(null, "Não há dados para serem exibidos.", "Aviso", 1);
                        btnLimparActionPerformed(evt);
                    } 
                }
            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Erro na consulta. \n" + e.getMessage(), "Erro!", 0);
        }
    }//GEN-LAST:event_btnPesquisarTudoActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnPesquisarActionPerformed
    {//GEN-HEADEREND:event_btnPesquisarActionPerformed
        String termo;
        String sql = "";
        boolean erro;

        try 
        {
            if(txtTermoUsuario.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null, "Digite algum valor para fazer a pesquisa.", "Aviso", 2);
                erro = true;
            }
            else
            {
                termo = txtTermoUsuario.getText().toLowerCase(); 

                if(Utilitarios.isNumeric(termo)) {
                    sql = "SELECT * FROM usuario WHERE cd_usuario = " + termo;   
                }
                else
                {
                    if(termo.equalsIgnoreCase("administrador") || termo.equalsIgnoreCase("adm") || termo.equalsIgnoreCase("admin")) {
                        termo = "S";
                        sql = "SELECT * FROM usuario WHERE ic_administrador_sim_nao = '" + termo + "' OR nm_login_usuario LIKE '%" + termo + "%'";
                    }

                    else if(termo.equalsIgnoreCase("usuario") || termo.equalsIgnoreCase("usuário")) {
                        termo = "N";      
                        sql = "SELECT * FROM usuario WHERE ic_administrador_sim_nao = '" + termo + "' OR nm_login_usuario LIKE '%" + termo + "%'";
                    }

                    else {
                        sql = "SELECT * FROM usuario WHERE ic_administrador_sim_nao = '" + termo + "' OR nm_login_usuario LIKE '%" + termo + "%'";
                        txtTermoUsuario.setText("");
                    }
                }    
                erro = false;  
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Erro.\n" + e.getMessage(), "Aviso", 2);
            erro = true;
            u.limparTextFields(this);
        }

        if (!erro)
        {
            String admin;
            modelo = (DefaultTableModel) tabelaUsuario.getModel();
            modelo.setRowCount(0);

            try
            {
                ResultSet res = Conexao.consultar(sql);

                if (Conexao.consultar(sql) == null)
                {
                    JOptionPane.showMessageDialog(null, "Dados não encontrados.", "Erro!", 0);
                }
                else
                {
                    if (Conexao.consultar(sql).next())
                    {
                        while (res.next())
                        {
                            if (res.getString("ic_administrador_sim_nao").equalsIgnoreCase("s"))
                            {
                                admin = "Sim";
                            }
                            else
                            {
                                admin = "Não";
                            }

                            modelo.addRow(new Object[]
                                    {
                                        res.getInt("cd_usuario"),
                                        res.getString("nm_login_usuario"),
                                        admin
                                    });
                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Dado não encontrado.", "Aviso", 1);
                    }
                }
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, "Erro na consulta. \n" + e.getMessage(), "Erro!", 0);
            }
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnExcluirActionPerformed
    {//GEN-HEADEREND:event_btnExcluirActionPerformed
        //não permitir que todos os administradores sejam apagados
        if (tabelaUsuario.getSelectedRow() >= 0)
        {
            String cod = tabelaUsuario.getValueAt(tabelaUsuario.getSelectedRow(), 0).toString();
            String sql;
            
            //Confirma a operação
            if (JOptionPane.showConfirmDialog(null, "Confirma a exclusão do registro " + cod + "?") == JOptionPane.YES_OPTION)
            {
                if (tabelaUsuario.getValueAt(tabelaUsuario.getSelectedRow(), 2).toString().equalsIgnoreCase("sim"))
                {
                    sql = "SELECT cd_usuario FROM USUARIO WHERE UPPER(ic_administrador_sim_nao) = 'S'";

                    try
                    {
                        ResultSet res = Conexao.consultar(sql);
                        int qtd = 0;

                        while (res.next())
                        { //não queria ter feito assim :/
                            qtd++;
                        }

                        if (qtd <= 1)
                        {
                            JOptionPane.showMessageDialog(null, "Não é possível excluir todos os administradores.", "Aviso", 2);
                        }
                        else
                        {
                            sql = "DELETE FROM USUARIO WHERE cd_usuario=" + cod;

                            Conexao.atualizar(sql);
                            btnPesquisarTudoActionPerformed(evt);
                            u.limparTextFields(this);
                        }
                    }
                    catch (Exception ex)
                    {
                        JOptionPane.showMessageDialog(null, "O registro não pode ser excluído.\n" + ex.getMessage(), "Erro", 0);
                    }
                }
                else
                { 
                    try
                    {
                        sql = "DELETE FROM USUARIO WHERE cd_usuario=" + cod;
                        Conexao.atualizar(sql);
                    }
                    catch (SQLException ex)
                    {
                        JOptionPane.showMessageDialog(null, "O registro não pode ser excluído.\n" + ex.getMessage(), "Erro", 0);
                    }
                    finally
                    {
                        btnPesquisarTudoActionPerformed(evt);
                        u.limparTextFields(this);
                    }
                }
            }//if de confirmação de exclusão
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Selecione alguma linha para excluir.", "Aviso", 2);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCadastrarActionPerformed
    {//GEN-HEADEREND:event_btnCadastrarActionPerformed
        FormCadastrarUsuario fcu = new FormCadastrarUsuario();
        this.getDesktopPane().add(fcu);
        fcu.setFrameIcon(new ImageIcon(getClass().getResource("/imagens/icon.png")));
        fcu.setVisible(true);
    }//GEN-LAST:event_btnCadastrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnPesquisarTudo;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel lblTermoUsuario;
    private javax.swing.ButtonGroup pesquisarButtonGroup;
    private javax.swing.JTable tabelaUsuario;
    private javax.swing.JTextField txtTermoUsuario;
    // End of variables declaration//GEN-END:variables
}

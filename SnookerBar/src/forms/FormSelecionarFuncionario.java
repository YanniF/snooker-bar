package forms;

import classes.Conexao;
import classes.Usuarios;
import classes.Utilitarios;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Yanni
 */

public class FormSelecionarFuncionario extends javax.swing.JInternalFrame {

    Utilitarios u = new Utilitarios();
    DefaultTableModel modelo;
    public boolean nada;  
    
    /**
     * Creates new form FormSelecionarFuncionario
     */
    public FormSelecionarFuncionario()
    {
        initComponents();
        
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
        btnLimpar = new javax.swing.JButton();
        jScrollPane = new javax.swing.JScrollPane();
        tabelaFuncionario = new javax.swing.JTable();
        btnExcluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnPesquisarTudo = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        lblTermoProduto = new javax.swing.JLabel();
        txtTermoProduto = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Consultar Funcionário");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener()
        {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt)
            {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt)
            {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt)
            {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt)
            {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt)
            {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt)
            {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt)
            {
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

        tabelaFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "Código", "Nome", "Telefone", "CPF", "Cargo", "Usuário"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false, false
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
        jScrollPane.setViewportView(tabelaFuncionario);
        tabelaFuncionario.getColumnModel().getColumn(0).setPreferredWidth(20);
        tabelaFuncionario.getColumnModel().getColumn(5).setPreferredWidth(20);

        btnExcluir.setText("Excluir");
        btnExcluir.setToolTipText("Selecione a linha e clique aqui para excluir o funcionário");
        btnExcluir.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnExcluirActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.setToolTipText("Selecione a linha e clique aqui para alterar o funcionário");
        btnAlterar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAlterarActionPerformed(evt);
            }
        });

        btnPesquisarTudo.setText("Pesquisar tudo");
        btnPesquisarTudo.setToolTipText("Clique aqui para pesquisar todos os funcionários");
        btnPesquisarTudo.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnPesquisarTudoActionPerformed(evt);
            }
        });

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.setToolTipText("Clique aqui para pesquisar por código, nome, CPF ou cargo do funcionário");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnPesquisarActionPerformed(evt);
            }
        });

        lblTermoProduto.setText("Pesquisar:");

        txtTermoProduto.setToolTipText("Digite o código, nome, CPF (sem pontuação) ou cargo do funcionário para pesquisar");

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setToolTipText("Clique aqui para cadastrar um funcionário");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(lblTermoProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTermoProduto))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(48, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPesquisarTudo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                            .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(170, 170, 170))
            .addComponent(jScrollPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTermoProduto)
                    .addComponent(txtTermoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-576)/2, (screenSize.height-484)/2, 576, 484);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnLimparActionPerformed
    {//GEN-HEADEREND:event_btnLimparActionPerformed
        try
        {
            for(int c = modelo.getRowCount() - 1; c >= 0; c--)
            {
                modelo.removeRow(c);
            }
        }
        catch(NullPointerException e){
            System.out.println("Não há dados na tabela");
        }
        u.limparTextFields(this);        
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAlterarActionPerformed
    {//GEN-HEADEREND:event_btnAlterarActionPerformed
        if(tabelaFuncionario.getSelectedRow() >= 0)
        {
            String auxTel = tabelaFuncionario.getValueAt(tabelaFuncionario.getSelectedRow(), 2).toString();
            String auxCpf = tabelaFuncionario.getValueAt(tabelaFuncionario.getSelectedRow(), 3).toString();
                        
            //tirando a formatação
            auxTel = auxTel.replaceAll("\\(", "").replaceAll("\\)", "").replaceAll("-", "").replaceAll(" ", "");
            auxCpf = auxCpf.replaceAll("\\.", "").replaceAll("-", "");
            
            int cod = Integer.parseInt(tabelaFuncionario.getValueAt(tabelaFuncionario.getSelectedRow(), 0).toString());
            String nome = tabelaFuncionario.getValueAt(tabelaFuncionario.getSelectedRow(), 1).toString();
            String tel = auxTel;
            String cpf = auxCpf;
            String cargo = tabelaFuncionario.getValueAt(tabelaFuncionario.getSelectedRow(), 4).toString();
            int user = Integer.parseInt(tabelaFuncionario.getValueAt(tabelaFuncionario.getSelectedRow(), 5).toString());
            
            FormAlterarFuncionario faf = new FormAlterarFuncionario();
            faf.passarValoresFuncionario(cod, nome, cargo, cpf, tel, user);
            this.getDesktopPane().add(faf);
            faf.setFrameIcon(new ImageIcon(getClass().getResource("/imagens/icon.png")));
            faf.setVisible(true);
        }
        else {
            JOptionPane.showMessageDialog(null, "Selecione alguma linha para alterar.", "Aviso", 2);
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnPesquisarTudoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnPesquisarTudoActionPerformed
    {//GEN-HEADEREND:event_btnPesquisarTudoActionPerformed
        pesquisarTudo();
        
        if(nada)
        {
            JOptionPane.showMessageDialog(null, "Não há dados para serem exibidos.", "Aviso", 1);
            btnLimparActionPerformed(null);
        }
    }//GEN-LAST:event_btnPesquisarTudoActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnPesquisarActionPerformed
    {//GEN-HEADEREND:event_btnPesquisarActionPerformed
        String termo;
        String sql = "";
        boolean erro;
        
        try 
        {
            if(txtTermoProduto.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null, "Digite algum valor para fazer a pesquisa.", "Aviso", 2);
                erro = true;
            }
            else
            {
                termo = txtTermoProduto.getText().toUpperCase(); 

                if(Utilitarios.isNumeric(termo)) {
                    sql = "SELECT * FROM funcionario WHERE cd_funcionario = " + termo + " OR cd_cpf_funcionario = " + termo;   
                }
                else {
                    sql = "SELECT * FROM funcionario WHERE nm_funcionario LIKE '%" + termo + "%' OR nm_cargo_funcionario LIKE '%" + termo + "%'";                
                }    
                erro = false;  
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Erro: \n" + e.getMessage(), "Erro", 0);
            erro = true;
            u.limparTextFields(this);
        }
        
        if(!erro)
        {
            modelo = (DefaultTableModel) tabelaFuncionario.getModel();
            modelo.setRowCount(0);

            try
            {  
                ResultSet res = Conexao.consultar(sql);            

                if(Conexao.consultar(sql) == null)
                {
                    JOptionPane.showMessageDialog(null, "Erro na consulta: \n" + Conexao.getErro(), "Erro!", 0);
                }
                else
                { 
                    if(Conexao.consultar(sql).next())
                    {
                        while(res.next())
                        {
                             modelo.addRow(new Object[] {
                                res.getInt("cd_funcionario"),
                                res.getString("nm_funcionario"),
                                formatarTelefone(res.getString("cd_telefone_funcionario")),
                                formatarCpf(res.getString("cd_cpf_funcionario")),
                                res.getString("nm_cargo_funcionario"),
                                res.getInt("cd_usuario"),                            
                            });
                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Registro não encontrado.", "Aviso", 1);
                    }
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Erro na consulta: \n" + e.getMessage(), "Erro!", 0);
            }
         }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnExcluirActionPerformed
    {//GEN-HEADEREND:event_btnExcluirActionPerformed
        if(tabelaFuncionario.getSelectedRow() >= 0)
        {
            String cod = tabelaFuncionario.getValueAt(tabelaFuncionario.getSelectedRow(), 0).toString();         
            
            //Confirma a operação
            if(JOptionPane.showConfirmDialog(null, "Confirma a exclusão do registro " + cod + "?") == JOptionPane.YES_OPTION)
            {
                String sql = "DELETE FROM FUNCIONARIO WHERE cd_funcionario=" + cod;
                
                try
                {
                    if(Conexao.atualizar(sql) == -1) {
                        JOptionPane.showMessageDialog(null, "O registro não pode ser excluído.\n" + Conexao.getErro(), "Erro", 0);
                    }
                    btnPesquisarTudoActionPerformed(evt);
                    u.limparTextFields(this);
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null, "O registro não pode ser excluído.", "Erro", 0);
                }
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Selecione alguma linha para excluir.", "Aviso", 2);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCadastrarActionPerformed
    {//GEN-HEADEREND:event_btnCadastrarActionPerformed
        FormCadastrarFuncionario fcf = new FormCadastrarFuncionario();
        this.getDesktopPane().add(fcf);
        fcf.setFrameIcon(new ImageIcon(getClass().getResource("/imagens/icon.png")));
        fcf.setVisible(true);
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt)//GEN-FIRST:event_formInternalFrameActivated
    {//GEN-HEADEREND:event_formInternalFrameActivated
        pesquisarTudo();
    }//GEN-LAST:event_formInternalFrameActivated
 
    private String formatarCpf(String cpf)
    {
        String aux [] = cpf.split("");
        String cpf2 = "";
        
        for (int c = 1; c < aux.length; c++)
        {            
            cpf2 += aux[c];
            
            if(c == 9) {
                cpf2 += "-";
            }            
            else if (c % 3 == 0) {
                cpf2 += ".";
            }
        }
        return cpf2;
    }
    
    private String formatarTelefone(String tel)
    {
        String aux [] = tel.split("");
        String tel2 = "";
        
        for (int c = 1; c < aux.length; c++)
        {        
            if(c == 1) {
                tel2 += "(";
            }
            tel2 += aux[c];
            
            if(c == 2) {
                tel2 += ") ";
            }  
            else if (c == 6) {
                tel2 += "-";
            }
        }
        return tel2;
    }
    
    private void pesquisarTudo()
    {
        modelo = (DefaultTableModel) tabelaFuncionario.getModel();
        modelo.setRowCount(0);
        
        try
        {            
            String sql = "SELECT * FROM FUNCIONARIO ORDER BY 1";                                    
            ResultSet res = Conexao.consultar(sql);            
         
            if(Conexao.consultar(sql) == null){
                JOptionPane.showMessageDialog(null, "Erro na consulta: \n" + Conexao.getErro(), "Erro!", 0);
            }
            else
            { 
                if(Conexao.consultar(sql).next())
                {
                    while(res.next())
                    {
                        modelo.addRow(new Object[] {
                            res.getInt("cd_funcionario"),
                            res.getString("nm_funcionario"),
                            formatarTelefone(res.getString("cd_telefone_funcionario")),
                            formatarCpf(res.getString("cd_cpf_funcionario")),
                            res.getString("nm_cargo_funcionario"),
                            res.getInt("cd_usuario"),                            
                        });
                    }
                    nada = false;
                }
                else
                {
                    nada = true;
                }
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Erro na consulta: \n" + e.getMessage(), "Erro!", 0);
        }     
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnPesquisarTudo;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel lblTermoProduto;
    private javax.swing.ButtonGroup pesquisarButtonGroup;
    private javax.swing.JTable tabelaFuncionario;
    private javax.swing.JTextField txtTermoProduto;
    // End of variables declaration//GEN-END:variables
}

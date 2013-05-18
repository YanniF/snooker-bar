package forms;

import classes.Conexao;
import classes.Usuarios;
import classes.Utilitarios;
import java.sql.ResultSet;
import java.text.NumberFormat;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author Yanni
 */
public class FormSelecionarProduto extends javax.swing.JInternalFrame {

    Utilitarios u = new Utilitarios();
    DefaultTableModel modelo;      
    public int first = 0;  
    
    /**
     * Creates new form FormSelecionarProduto
     */
    public FormSelecionarProduto()
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

        btnAlterar = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        btnPesquisarTudo = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        jScrollPane = new javax.swing.JScrollPane();
        tabelaProduto = new javax.swing.JTable();
        btnExcluir = new javax.swing.JButton();
        txtTermoProduto = new javax.swing.JTextField();
        lblTermoProduto = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Consultar Produto");

        btnAlterar.setText("Alterar");
        btnAlterar.setToolTipText("Selecione a linha e clique aqui para alterar o produto");
        btnAlterar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAlterarActionPerformed(evt);
            }
        });

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.setToolTipText("Clique aqui para pesquisar por código, nome ou o preço do produto");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnPesquisarTudo.setText("Pesquisar tudo");
        btnPesquisarTudo.setToolTipText("Clique aqui para pesquisar todos os produtos");
        btnPesquisarTudo.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnPesquisarTudoActionPerformed(evt);
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

        tabelaProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "Código", "Nome", "Valor"
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
        jScrollPane.setViewportView(tabelaProduto);

        btnExcluir.setText("Excluir");
        btnExcluir.setToolTipText("Selecione a linha e clique aqui para excluir o produto");
        btnExcluir.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnExcluirActionPerformed(evt);
            }
        });

        txtTermoProduto.setToolTipText("Digite o código, nome ou o preço do produto para pesquisar");

        lblTermoProduto.setText("Pesquisar:$");

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setToolTipText("Clique aqui para cadastrar um produto");
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
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPesquisarTudo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTermoProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTermoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTermoProduto)
                    .addComponent(txtTermoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPesquisar)
                    .addComponent(btnPesquisarTudo)
                    .addComponent(btnLimpar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-451)/2, (screenSize.height-456)/2, 451, 456);
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
        if(tabelaProduto.getSelectedRow() >= 0)
        {
            String aux = tabelaProduto.getValueAt(tabelaProduto.getSelectedRow(), 2).toString();
            aux = aux.replaceAll("R", "").replace("$", "").replaceAll(",", ".");//tirando a formatação
                        
            int cod = Integer.parseInt(tabelaProduto.getValueAt(tabelaProduto.getSelectedRow(), 0).toString());
            String nome = tabelaProduto.getValueAt(tabelaProduto.getSelectedRow(), 1).toString();
            double valor = Double.parseDouble(aux);
            
            FormAlterarProduto fap = new FormAlterarProduto();
            fap.passarValoresProduto(cod, nome, valor);
            this.getDesktopPane().add(fap);
            fap.setFrameIcon(new ImageIcon(getClass().getResource("/imagens/icon.png")));
            fap.setVisible(true);
        }
        else {
            JOptionPane.showMessageDialog(null, "Selecione alguma linha para alterar.", "Aviso", 2);
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnPesquisarTudoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnPesquisarTudoActionPerformed
    {//GEN-HEADEREND:event_btnPesquisarTudoActionPerformed
        modelo = (DefaultTableModel) tabelaProduto.getModel();
        modelo.setRowCount(0);
        first++;
        
        try
        {            
            String sql = "SELECT * FROM PRODUTO ORDER BY 1";                                    
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
                            res.getInt("cd_produto"),
                            res.getString("nm_produto"),
                            NumberFormat.getCurrencyInstance().format(res.getDouble("vl_produto"))
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
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Erro na consulta: \n" + e.getMessage(), "Erro!", 0);
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
                    sql = "SELECT * FROM produto WHERE cd_produto = " + termo + " OR vl_produto = " + termo;   
                }
                else {
                    sql = "SELECT * FROM produto WHERE nm_produto LIKE '%" + termo + "%'";                
                }    
                erro = false;  
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Erro:\n" + e.getMessage(), "Aviso", 2);
            erro = true;
            u.limparTextFields(this);
        }
        
        if(!erro)
        {
            modelo = (DefaultTableModel) tabelaProduto.getModel();
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
                                res.getInt("cd_produto"),
                                res.getString("nm_produto"),
                                NumberFormat.getCurrencyInstance().format(res.getDouble("vl_produto"))
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
        if(tabelaProduto.getSelectedRow() >= 0)
        {
            String cod = tabelaProduto.getValueAt(tabelaProduto.getSelectedRow(), 0).toString();         
            
            if(JOptionPane.showConfirmDialog(null, "Confirma a exclusão do registro " + cod + "?") == JOptionPane.YES_OPTION)
            {
                String sql = "DELETE FROM PRODUTO WHERE cd_produto=" + cod;
                
                try
                {
                    Conexao.atualizar(sql);
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
        FormCadastrarProduto fcp = new FormCadastrarProduto();
        this.getDesktopPane().add(fcp);
        fcp.setFrameIcon(new ImageIcon(getClass().getResource("/imagens/icon.png")));
        fcp.setVisible(true);
    }//GEN-LAST:event_btnCadastrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnPesquisarTudo;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel lblTermoProduto;
    private javax.swing.JTable tabelaProduto;
    private javax.swing.JTextField txtTermoProduto;
    // End of variables declaration//GEN-END:variables
}

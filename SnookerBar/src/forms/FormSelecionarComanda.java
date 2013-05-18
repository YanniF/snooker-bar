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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Yanni
 */
public class FormSelecionarComanda extends javax.swing.JInternalFrame {

    Utilitarios u = new Utilitarios(); 
    DefaultTableModel modelo;
    public int first = 0;  
    
    /**
     * Creates new form FormSelecionarComanda
     */
    public FormSelecionarComanda() {
        initComponents();
                
        btnPesquisarTudoActionPerformed(null);
        
        if(!Usuarios.adm){
            btnCadastrar.setEnabled(false);
            btnCadastrar.setToolTipText(null);
            btnAlterar.setEnabled(false);
            btnAlterar.setToolTipText(null);
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

        lblTermoComanda = new javax.swing.JLabel();
        txtTermoComanda = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        btnPesquisarTudo = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaComanda = new javax.swing.JTable();
        btnAlterar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Consultar Comanda");

        lblTermoComanda.setText("Pesquisar:");

        txtTermoComanda.setToolTipText("Digite o código ou o estado da comanda para pesquisar");

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.setToolTipText("Clique aqui para pesquisar por código ou estado da comanda");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnPesquisarTudo.setText("Pesquisar tudo");
        btnPesquisarTudo.setToolTipText("Clique aqui para pesquisar todas as comandas");
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

        tabelaComanda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "Código", "Ativa ou Inativa"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean []
            {
                false, false
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
        jScrollPane1.setViewportView(tabelaComanda);

        btnAlterar.setText("Alterar");
        btnAlterar.setToolTipText("Selecione a linha e clique aqui para alterar a comanda");
        btnAlterar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAlterarActionPerformed(evt);
            }
        });

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setToolTipText("Clique aqui para cadastrar uma comanda");
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTermoComanda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTermoComanda)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPesquisar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAlterar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnPesquisarTudo)
                                .addContainerGap(21, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(22, 22, 22))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTermoComanda)
                    .addComponent(txtTermoComanda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPesquisarTudo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCadastrar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAlterar)))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-296)/2, (screenSize.height-472)/2, 296, 472);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        try
        {
            for(int c = modelo.getRowCount() - 1; c >= 0; c--)
            {
                modelo.removeRow(c);
            }
        }
        catch(NullPointerException e)
        {
            System.out.println("Não há dados na tabela");
        }
        u.limparTextFields(this);
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAlterarActionPerformed
    {//GEN-HEADEREND:event_btnAlterarActionPerformed
        //não permite clicar no botão Alterar se nenhuma linha estiver selecionada
        if(tabelaComanda.getSelectedRow() >= 0)
        {
            FormAlterarComanda fac = new FormAlterarComanda();
            this.getDesktopPane().add(fac);
            fac.setFrameIcon(new ImageIcon(getClass().getResource("/imagens/icon.png")));
            fac.setVisible(true);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Selecione alguma linha para alterar.", "Aviso", 2);
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnPesquisarTudoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnPesquisarTudoActionPerformed
    {//GEN-HEADEREND:event_btnPesquisarTudoActionPerformed
        modelo = (DefaultTableModel) tabelaComanda.getModel();
        modelo.setRowCount(0);//para cada vez que executar isso, limpar as linhas da tabela
        String ativa;
        first++;
        
        try
        {            
            String sql = "SELECT * FROM COMANDA ORDER BY 1";                                    
            ResultSet res = Conexao.consultar(sql);            
         
            if(Conexao.consultar(sql) == null)
            {
                JOptionPane.showMessageDialog(null, "Erro na consulta:\n" + Conexao.getErro(), "Erro!", 0);
            }
            else
            { 
                if(Conexao.consultar(sql).next())
                {//verifica se a consulta não é vazia
                    while(res.next())
                    {
                        if(res.getString("ic_ativa_inativa").equalsIgnoreCase("s"))
                        {
                            ativa = "Ativa";
                        }
                        else
                        {
                            ativa = "Inativa";
                        }

                         modelo.addRow(new Object[] {
                            res.getInt("cd_comanda"),
                            ativa
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
            termo = txtTermoComanda.getText().toUpperCase(); 
            
            if(Utilitarios.isNumeric(termo)) {
                sql = "SELECT * FROM COMANDA WHERE \"cd_comanda\" = " + termo;       
            }
            else
            {
                if(termo.equalsIgnoreCase("ativa")) {
                    termo = "S";
                    sql = "SELECT * FROM COMANDA WHERE \"ic_ativa_inativa\" = '" + termo + "'";
                }

                else if(termo.equalsIgnoreCase("inativa")) {
                    termo = "N";      
                    sql = "SELECT * FROM COMANDA WHERE \"ic_ativa_inativa\" = '" + termo + "'";
                }
                
                else {
                    sql = "";
                    txtTermoComanda.setText("");
                }
            }    
            erro = false;            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Erro: \n" + e.getMessage(), "Erro", 0);
            erro = true;
            u.limparTextFields(this);
        }
        
        if(!erro)
        {
            String ativa;
            modelo = (DefaultTableModel) tabelaComanda.getModel();
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
                            if(res.getString("ic_ativa_inativa").equalsIgnoreCase("s"))
                            {
                                ativa = "Ativa";
                            }
                            else
                            {
                                ativa = "Inativa";
                            }

                             modelo.addRow(new Object[] {
                                res.getInt("cd_comanda"),
                                ativa
                             });
                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Registro não encontrado.", "Aviso", 1);
                        btnLimparActionPerformed(evt);
                    }
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Erro na consulta: \n" + e.getMessage(), "Erro!", 0);
            }
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        FormCadastrarComanda fcc = new FormCadastrarComanda();
        this.getDesktopPane().add(fcc);
        fcc.setFrameIcon(new ImageIcon(getClass().getResource("/imagens/icon.png")));
        fcc.setVisible(true);
    }//GEN-LAST:event_btnCadastrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnPesquisarTudo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTermoComanda;
    private javax.swing.JTable tabelaComanda;
    private javax.swing.JTextField txtTermoComanda;
    // End of variables declaration//GEN-END:variables
}

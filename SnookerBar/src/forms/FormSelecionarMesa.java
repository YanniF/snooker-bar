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
public class FormSelecionarMesa extends javax.swing.JInternalFrame {

    Utilitarios u = new Utilitarios();
    DefaultTableModel modelo;    
    public int first = 0;  
    
    /**
     * Creates new form FormSelecionarMesa
     */
    public FormSelecionarMesa() {
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

        jScrollPane = new javax.swing.JScrollPane();
        tabelaMesa = new javax.swing.JTable();
        btnPesquisar = new javax.swing.JButton();
        btnPesquisarTudo = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        lblTermoMesa = new javax.swing.JLabel();
        txtTermoMesa = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("Consultar Mesa");

        tabelaMesa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "Código", "Identificação", "Ativa ou Inativa"
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
        jScrollPane.setViewportView(tabelaMesa);

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.setToolTipText("Clique aqui para pesquisar por código, identificação ou estado da mesa");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnPesquisarTudo.setText("Pesquisar tudo");
        btnPesquisarTudo.setToolTipText("Clique aqui para pesquisar todas as mesas");
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

        btnAlterar.setText("Alterar");
        btnAlterar.setToolTipText("Selecione a linha e clique aqui para alterar a mesa");
        btnAlterar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAlterarActionPerformed(evt);
            }
        });

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setToolTipText("Clique aqui para cadastrar uma mesa");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCadastrarActionPerformed(evt);
            }
        });

        lblTermoMesa.setText("Pesquisar:");

        txtTermoMesa.setToolTipText("Digite o código, identificação ou o estado da mesa para pesquisar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTermoMesa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTermoMesa, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPesquisarTudo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTermoMesa)
                    .addComponent(txtTermoMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPesquisar)
                    .addComponent(btnPesquisarTudo)
                    .addComponent(btnLimpar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnAlterar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-399)/2, (screenSize.height-476)/2, 399, 476);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
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
        if(tabelaMesa.getSelectedRow() >= 0)
        {
            FormAlterarMesa fam = new FormAlterarMesa();
            this.getDesktopPane().add(fam);
            fam.setFrameIcon(new ImageIcon(getClass().getResource("/imagens/icon.png")));
            fam.setVisible(true);
        }
        else {
            JOptionPane.showMessageDialog(null, "Selecione alguma linha para alterar. \n", "Aviso", 2);
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnPesquisarTudoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnPesquisarTudoActionPerformed
    {//GEN-HEADEREND:event_btnPesquisarTudoActionPerformed
        modelo = (DefaultTableModel) tabelaMesa.getModel();
        modelo.setRowCount(0);
        String ativa;
        first++;
        
        try
        {            
            String sql = "SELECT * FROM MESA ORDER BY 1";                                    
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
                        if(res.getString("ic_ativa_sim_nao").equalsIgnoreCase("s")){
                            ativa = "Ativa";
                        }
                        else{
                            ativa = "Inativa";
                        }

                        modelo.addRow(new Object[] {
                            res.getInt("cd_mesa"),
                            res.getString("nm_mesa"),
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
            if(txtTermoMesa.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null, "Digite algum valor para fazer a pesquisa.", "Aviso", 2);
                erro = true;
            }
            else
            {
                termo = txtTermoMesa.getText().toUpperCase(); 

                if(Utilitarios.isNumeric(termo)) {
                    sql = "SELECT * FROM mesa WHERE cd_mesa = " + termo;   
                }
                else
                {
                    if(termo.equalsIgnoreCase("ativa")) {
                        termo = "S";
                        sql = "SELECT * FROM mesa WHERE ic_ativa_sim_nao = '" + termo + "' OR nm_mesa LIKE '%" + termo + "%'";
                    }

                    else if(termo.equalsIgnoreCase("inativa")) {
                        termo = "N";      
                        sql = "SELECT * FROM mesa WHERE ic_ativa_sim_nao = '" + termo + "' OR nm_mesa LIKE '%" + termo + "%'";
                    }

                    else {
                        sql = "SELECT * FROM mesa WHERE ic_ativa_sim_nao = '" + termo + "' OR nm_mesa LIKE '%" + termo + "%'";
                        txtTermoMesa.setText("");
                    }
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
            String ativa;
            modelo = (DefaultTableModel) tabelaMesa.getModel();
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
                            if(res.getString("ic_ativa_sim_nao").equalsIgnoreCase("s")){
                                ativa = "Ativa";
                            }
                            else {
                                ativa = "Inativa";
                            }

                             modelo.addRow(new Object[] {
                                res.getInt("cd_mesa"),
                                res.getString("nm_mesa"),
                                ativa
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

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCadastrarActionPerformed
    {//GEN-HEADEREND:event_btnCadastrarActionPerformed
        FormCadastrarMesa fcm = new FormCadastrarMesa();
        this.getDesktopPane().add(fcm);
        fcm.setFrameIcon(new ImageIcon(getClass().getResource("/imagens/icon.png")));
        fcm.setVisible(true);
    }//GEN-LAST:event_btnCadastrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnPesquisarTudo;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel lblTermoMesa;
    private javax.swing.JTable tabelaMesa;
    private javax.swing.JTextField txtTermoMesa;
    // End of variables declaration//GEN-END:variables
}

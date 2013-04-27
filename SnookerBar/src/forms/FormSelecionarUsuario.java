/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import classes.Utilitarios;

/**
 *
 * @author Yanni
 */
public class FormSelecionarUsuario extends javax.swing.JInternalFrame {

    Utilitarios u = new Utilitarios();
    
    /**
     * Creates new form FormSelecionarUsuario
     */
    public FormSelecionarUsuario()
    {
        initComponents();
        
        lblTermo.setVisible(false);
        txtTermo.setVisible(false);
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
        pesquisarPanel = new javax.swing.JPanel();
        rbtCdUsuario = new javax.swing.JRadioButton();
        rbtNmUsuario = new javax.swing.JRadioButton();
        txtTermo = new javax.swing.JTextField();
        btnPesquisarTudo = new javax.swing.JButton();
        lblTermo = new javax.swing.JLabel();
        btnPesquisar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        jScrollPane = new javax.swing.JScrollPane();
        tabelaUsuario = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setTitle("Consultar Usuário");

        pesquisarPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisar por:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(0, 0, 0)));
        pesquisarPanel.setToolTipText("Pesquisar por código ou nome do usuário");

        pesquisarButtonGroup.add(rbtCdUsuario);
        rbtCdUsuario.setText("Código");
        rbtCdUsuario.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rbtCdUsuarioActionPerformed(evt);
            }
        });

        pesquisarButtonGroup.add(rbtNmUsuario);
        rbtNmUsuario.setText("Nome");
        rbtNmUsuario.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rbtNmUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pesquisarPanelLayout = new javax.swing.GroupLayout(pesquisarPanel);
        pesquisarPanel.setLayout(pesquisarPanelLayout);
        pesquisarPanelLayout.setHorizontalGroup(
            pesquisarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pesquisarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pesquisarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtCdUsuario)
                    .addComponent(rbtNmUsuario))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        pesquisarPanelLayout.setVerticalGroup(
            pesquisarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pesquisarPanelLayout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(rbtCdUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtNmUsuario))
        );

        btnPesquisarTudo.setText("Pesquisar tudo");
        btnPesquisarTudo.setToolTipText("Clique aqui para pesquisar todos os usuários");

        lblTermo.setText("Termo:");

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.setToolTipText("Clique aqui para pesquisar o usuário");

        btnExcluir.setText("Excluir");
        btnExcluir.setToolTipText("Selecione a linha e clique aqui para excluir o usuário");

        btnAlterar.setText("Alterar");
        btnAlterar.setToolTipText("Selecione a linha e clique aqui para alterar o usuário");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTermo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTermo, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(pesquisarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnPesquisarTudo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPesquisar)
                            .addComponent(btnPesquisarTudo)
                            .addComponent(btnExcluir))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLimpar)
                            .addComponent(btnAlterar)))
                    .addComponent(pesquisarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTermo)
                    .addComponent(txtTermo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-467)/2, (screenSize.height-467)/2, 467, 467);
    }// </editor-fold>//GEN-END:initComponents

    private void rbtCdUsuarioActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rbtCdUsuarioActionPerformed
    {//GEN-HEADEREND:event_rbtCdUsuarioActionPerformed
        lblTermo.setVisible(true);
        txtTermo.setVisible(true);
        lblTermo.setText("Código:");
        txtTermo.setToolTipText("Digite o código do usuário para pesquisar");
    }//GEN-LAST:event_rbtCdUsuarioActionPerformed

    private void rbtNmUsuarioActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rbtNmUsuarioActionPerformed
    {//GEN-HEADEREND:event_rbtNmUsuarioActionPerformed
        lblTermo.setVisible(true);
        txtTermo.setVisible(true);
        lblTermo.setText("Nome:");
        txtTermo.setToolTipText("Digite o nome do usuário para pesquisar");
    }//GEN-LAST:event_rbtNmUsuarioActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnLimparActionPerformed
    {//GEN-HEADEREND:event_btnLimparActionPerformed
        u.limparTextFields(this);
        rbtCdUsuario.setSelected(true);
        rbtCdUsuarioActionPerformed(evt);
    }//GEN-LAST:event_btnLimparActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnPesquisarTudo;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel lblTermo;
    private javax.swing.ButtonGroup pesquisarButtonGroup;
    private javax.swing.JPanel pesquisarPanel;
    private javax.swing.JRadioButton rbtCdUsuario;
    private javax.swing.JRadioButton rbtNmUsuario;
    private javax.swing.JTable tabelaUsuario;
    private javax.swing.JTextField txtTermo;
    // End of variables declaration//GEN-END:variables
}

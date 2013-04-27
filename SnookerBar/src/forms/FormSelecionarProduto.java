package forms;

import classes.Utilitarios;
import javax.swing.ImageIcon;

/**
 * @author Yanni
 */
public class FormSelecionarProduto extends javax.swing.JInternalFrame {

    Utilitarios u = new Utilitarios();
    /**
     * Creates new form FormSelecionarProduto
     */
    public FormSelecionarProduto()
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
        txtTermo = new javax.swing.JTextField();
        lblTermo = new javax.swing.JLabel();
        pesquisarPanel = new javax.swing.JPanel();
        rbtCdProduto = new javax.swing.JRadioButton();
        rbtNmProduto = new javax.swing.JRadioButton();
        btnAlterar = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        btnPesquisarTudo = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        jScrollPane = new javax.swing.JScrollPane();
        tabelaProduto = new javax.swing.JTable();
        btnExcluir = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Consultar Produto");

        lblTermo.setText("Termo:");

        pesquisarPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisar por:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(0, 0, 0)));
        pesquisarPanel.setToolTipText("Pesquisar por código ou nome do produto");

        pesquisarButtonGroup.add(rbtCdProduto);
        rbtCdProduto.setText("Código");
        rbtCdProduto.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rbtCdProdutoActionPerformed(evt);
            }
        });

        pesquisarButtonGroup.add(rbtNmProduto);
        rbtNmProduto.setText("Nome");
        rbtNmProduto.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rbtNmProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pesquisarPanelLayout = new javax.swing.GroupLayout(pesquisarPanel);
        pesquisarPanel.setLayout(pesquisarPanelLayout);
        pesquisarPanelLayout.setHorizontalGroup(
            pesquisarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pesquisarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pesquisarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtCdProduto)
                    .addComponent(rbtNmProduto))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        pesquisarPanelLayout.setVerticalGroup(
            pesquisarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pesquisarPanelLayout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(rbtCdProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtNmProduto))
        );

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
        btnPesquisar.setToolTipText("Clique aqui para pesquisar o produto");

        btnPesquisarTudo.setText("Pesquisar tudo");
        btnPesquisarTudo.setToolTipText("Clique aqui para pesquisar todos os produtos");

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
                                    .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnPesquisarTudo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTermo)
                    .addComponent(txtTermo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-461)/2, (screenSize.height-456)/2, 461, 456);
    }// </editor-fold>//GEN-END:initComponents

    private void rbtCdProdutoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rbtCdProdutoActionPerformed
    {//GEN-HEADEREND:event_rbtCdProdutoActionPerformed
        lblTermo.setVisible(true);
        txtTermo.setVisible(true);
        lblTermo.setText("Código:");
        txtTermo.setToolTipText("Digite o código do produto para pesquisar");
    }//GEN-LAST:event_rbtCdProdutoActionPerformed

    private void rbtNmProdutoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rbtNmProdutoActionPerformed
    {//GEN-HEADEREND:event_rbtNmProdutoActionPerformed
        lblTermo.setVisible(true);
        txtTermo.setVisible(true);
        lblTermo.setText("Nome:");
        txtTermo.setToolTipText("Digite o nome do produto para pesquisar");
    }//GEN-LAST:event_rbtNmProdutoActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnLimparActionPerformed
    {//GEN-HEADEREND:event_btnLimparActionPerformed
        u.limparTextFields(this);
        rbtCdProduto.setSelected(true);
        rbtCdProdutoActionPerformed(evt);
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAlterarActionPerformed
    {//GEN-HEADEREND:event_btnAlterarActionPerformed
        FormAlterarProduto fap = new FormAlterarProduto();
        this.getDesktopPane().add(fap);
        fap.setFrameIcon(new ImageIcon(getClass().getResource("/imagens/icon.png")));
        fap.setVisible(true);
    }//GEN-LAST:event_btnAlterarActionPerformed

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
    private javax.swing.JRadioButton rbtCdProduto;
    private javax.swing.JRadioButton rbtNmProduto;
    private javax.swing.JTable tabelaProduto;
    private javax.swing.JTextField txtTermo;
    // End of variables declaration//GEN-END:variables
}

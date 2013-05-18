package forms;

import classes.Conexao;
import classes.Utilitarios;
import javax.swing.JOptionPane;

/**
 * @author Yanni
 */
public class FormAlterarServico extends javax.swing.JInternalFrame {

    /**
     * Creates new form FormCadastrarServico
     */
    
    Utilitarios u = new Utilitarios();
    
    public FormAlterarServico() {
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

        lblCdServico = new javax.swing.JLabel();
        txtCdServico = new javax.swing.JTextField();
        lblNmServico = new javax.swing.JLabel();
        txtNmServico = new javax.swing.JTextField();
        lblVlServico = new javax.swing.JLabel();
        txtVlServico = new javax.swing.JTextField();
        btnAlterar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Alterar Serviço");

        lblCdServico.setText("Código:");

        txtCdServico.setEnabled(false);

        lblNmServico.setText("Nome:");

        txtNmServico.setToolTipText("Digite o nome do serviço");

        lblVlServico.setText("Valor:");

        txtVlServico.setToolTipText("Digite o valor do serviço");

        btnAlterar.setToolTipText("Clique aqui para gravar as alterações do serviço");
        btnAlterar.setLabel("Alterar");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNmServico, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCdServico, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblVlServico, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtVlServico, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                            .addComponent(txtCdServico, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNmServico, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAlterar)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCdServico)
                    .addComponent(txtCdServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNmServico)
                    .addComponent(txtNmServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVlServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVlServico))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlterar)
                    .addComponent(btnLimpar))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-218)/2, (screenSize.height-211)/2, 218, 211);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        int cod = Integer.parseInt(txtCdServico.getText());
        u.limparTextFields(this);
        txtCdServico.setText(Integer.toString(cod));
        txtNmServico.requestFocus();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAlterarActionPerformed
    {//GEN-HEADEREND:event_btnAlterarActionPerformed
        try
        {
            int cod = Integer.parseInt(txtCdServico.getText());
            String nome = txtNmServico.getText();
            double valor = Double.parseDouble(txtVlServico.getText());
                        
            String sql = "UPDATE servico SET nm_servico = UPPER('" + nome + "'), vl_servico = " + valor + " WHERE cd_servico = " + cod;
            
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

    public void passarValoresServico(int cod, String nome, Double valor) 
    {
        txtCdServico.setText(Integer.toString(cod));
        txtNmServico.setText(nome);
        txtVlServico.setText(Double.toString(valor));
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JLabel lblCdServico;
    private javax.swing.JLabel lblNmServico;
    private javax.swing.JLabel lblVlServico;
    private javax.swing.JTextField txtCdServico;
    private javax.swing.JTextField txtNmServico;
    private javax.swing.JTextField txtVlServico;
    // End of variables declaration//GEN-END:variables
}

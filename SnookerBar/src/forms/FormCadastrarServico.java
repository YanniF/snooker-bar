/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import classes.Conexao;
import classes.Utilitarios;
import javax.swing.JOptionPane;

/**
 *
 * @author Yanni
 */
public class FormCadastrarServico extends javax.swing.JInternalFrame {

    /**
     * Creates new form FormCadastrarServico
     */
    
    Utilitarios u = new Utilitarios();
    
    public FormCadastrarServico() {
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
        btnCadastrar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastrar Serviço");

        lblCdServico.setText("Código:");

        txtCdServico.setToolTipText("Digite o código do serviço");

        lblNmServico.setText("Nome:");

        txtNmServico.setToolTipText("Digite o nome do serviço");

        lblVlServico.setText("Valor:");

        txtVlServico.setToolTipText("Digite o valor do serviço");

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setToolTipText("Clique aqui para cadastrar o serviço");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCadastrarActionPerformed(evt);
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
                        .addComponent(btnCadastrar)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(btnCadastrar)
                    .addComponent(btnLimpar))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-218)/2, (screenSize.height-211)/2, 218, 211);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        u.limparTextFields(this);
        txtCdServico.requestFocus();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCadastrarActionPerformed
    {//GEN-HEADEREND:event_btnCadastrarActionPerformed
        int cod;
        String nome;
        double valor;
        
        try
        {
            cod = Integer.parseInt(txtCdServico.getText());
            nome = txtNmServico.getText();
            valor = Double.parseDouble(txtVlServico.getText());
            
            String sql = "INSERT INTO SERVICO VALUES(" + cod + ", UPPER('" + nome + "'), " + valor + ")";
            
            if(Conexao.atualizar(sql).equals(""))
            {
                JOptionPane.showMessageDialog(null, "O registro não pode ser inserido.", "Cadastro", 0);
                btnLimparActionPerformed(evt);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Cadastrado com sucesso.", "Cadastro", 1);
                btnLimparActionPerformed(evt);  
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "Erro: \n" + e.getMessage(), "Erro!", 0);
            u.limparTextFields(this);
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JLabel lblCdServico;
    private javax.swing.JLabel lblNmServico;
    private javax.swing.JLabel lblVlServico;
    private javax.swing.JTextField txtCdServico;
    private javax.swing.JTextField txtNmServico;
    private javax.swing.JTextField txtVlServico;
    // End of variables declaration//GEN-END:variables
}

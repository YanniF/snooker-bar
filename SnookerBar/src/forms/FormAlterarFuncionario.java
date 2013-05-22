package forms;

import classes.Conexao;
import classes.Utilitarios;
import javax.swing.JOptionPane;

/**
 *
 * @author Yanni
 */
public class FormAlterarFuncionario extends javax.swing.JInternalFrame {

    /**
     * Creates new form FormCadastrarFuncionario
     */
    
    Utilitarios u = new Utilitarios();
    
    public FormAlterarFuncionario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCdFuncionario = new javax.swing.JLabel();
        txtCdFuncionario = new javax.swing.JTextField();
        lblNmFuncionario = new javax.swing.JLabel();
        txtNmFuncionario = new javax.swing.JTextField();
        lblCdCpfFuncionario = new javax.swing.JLabel();
        lblCdTelefoneFuncionario = new javax.swing.JLabel();
        lblCdUsuario = new javax.swing.JLabel();
        txtCdUsuario = new javax.swing.JTextField();
        btnLimpar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        txtNmCargo = new javax.swing.JTextField();
        lblNmCargo = new javax.swing.JLabel();
        txtCdCpfFuncionario = new javax.swing.JFormattedTextField();
        txtCdTelefoneFuncionario = new javax.swing.JFormattedTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("Alterar Funcionário");

        lblCdFuncionario.setText("Código:");

        txtCdFuncionario.setToolTipText("Digite o código do funcionário");
        txtCdFuncionario.setEnabled(false);

        lblNmFuncionario.setText("Nome:");

        txtNmFuncionario.setToolTipText("Digite o nome do funcionário");

        lblCdCpfFuncionario.setText("CPF:");

        lblCdTelefoneFuncionario.setText("Telefone:");

        lblCdUsuario.setText("Usuário:");

        txtCdUsuario.setToolTipText("Digite o código de usuário do funcionário (não obrigatório)");
        txtCdUsuario.setEnabled(false);

        btnLimpar.setText("Limpar");
        btnLimpar.setToolTipText("Clique aqui para limpar os valores");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.setToolTipText("Clique aqui para salvar as alterações");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        txtNmCargo.setToolTipText("Digite o cargo do funcionário");

        lblNmCargo.setText("Cargo:");

        try {
            txtCdCpfFuncionario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCdCpfFuncionario.setToolTipText("Digite o cpf do funcionário");
        txtCdCpfFuncionario.setEnabled(false);

        try {
            txtCdTelefoneFuncionario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCdTelefoneFuncionario.setToolTipText("Digite o telefone do funcionário");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCdUsuario)
                            .addComponent(lblCdTelefoneFuncionario)
                            .addComponent(lblCdCpfFuncionario)
                            .addComponent(lblNmFuncionario)
                            .addComponent(lblCdFuncionario))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 51, Short.MAX_VALUE)
                        .addComponent(lblNmCargo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtNmCargo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCdFuncionario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNmFuncionario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(txtCdTelefoneFuncionario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCdCpfFuncionario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCdUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCdFuncionario)
                    .addComponent(txtCdFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNmFuncionario)
                    .addComponent(txtNmFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNmCargo)
                    .addComponent(txtNmCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCdCpfFuncionario)
                    .addComponent(txtCdCpfFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCdTelefoneFuncionario)
                    .addComponent(txtCdTelefoneFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCdUsuario)
                    .addComponent(txtCdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlterar)
                    .addComponent(btnLimpar))
                .addGap(50, 50, 50))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-399)/2, (screenSize.height-330)/2, 399, 330);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtNmFuncionario.setText("");
        txtNmCargo.setText("");
        txtCdTelefoneFuncionario.setValue("");
        txtNmFuncionario.requestFocus(); 
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAlterarActionPerformed
    {//GEN-HEADEREND:event_btnAlterarActionPerformed
        try
        {
            int cod = Integer.parseInt(txtCdFuncionario.getText());
            String nome = txtNmFuncionario.getText();
            String cargo = txtNmCargo.getText();
            String tel = txtCdTelefoneFuncionario.getText();    
            String sql;
            
            tel = tel.replaceAll("\\(", "").replaceAll("\\)", "").replaceAll("-", "").replaceAll(" ", "");
                     
            sql = "UPDATE funcionario SET nm_funcionario = UPPER('" + nome + "'), cd_telefone_funcionario = " + tel 
                    + ", nm_cargo_funcionario = UPPER('" + cargo + "'), WHERE cd_funcionario = " + cod;
            
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

    public void passarValoresFuncionario(int cod, String nome, String cargo, String cpf, String tel, int user) 
    {
        txtCdFuncionario.setText(Integer.toString(cod));
        txtNmFuncionario.setText(nome);
        txtNmCargo.setText(cargo);
        txtCdCpfFuncionario.setText(cpf);
        txtCdTelefoneFuncionario.setText(tel);
        
        if(user == 0) {
            txtCdUsuario.setText("");
        }
        else
        {
            txtCdUsuario.setText(Integer.toString(user));
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JLabel lblCdCpfFuncionario;
    private javax.swing.JLabel lblCdFuncionario;
    private javax.swing.JLabel lblCdTelefoneFuncionario;
    private javax.swing.JLabel lblCdUsuario;
    private javax.swing.JLabel lblNmCargo;
    private javax.swing.JLabel lblNmFuncionario;
    private javax.swing.JFormattedTextField txtCdCpfFuncionario;
    private javax.swing.JTextField txtCdFuncionario;
    private javax.swing.JFormattedTextField txtCdTelefoneFuncionario;
    private javax.swing.JTextField txtCdUsuario;
    private javax.swing.JTextField txtNmCargo;
    private javax.swing.JTextField txtNmFuncionario;
    // End of variables declaration//GEN-END:variables
}

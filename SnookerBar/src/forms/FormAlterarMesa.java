package forms;

import classes.Conexao;
import javax.swing.JOptionPane;

/**
 *
 * @author Yanni
 */
public class FormAlterarMesa extends javax.swing.JInternalFrame {

    /**
     * Creates new form FormCadastrarMesa
     */
        
    public FormAlterarMesa() {
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

        ativaButtonGroup = new javax.swing.ButtonGroup();
        btnAlterar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        lblCdMesa = new javax.swing.JLabel();
        lblNmMesa = new javax.swing.JLabel();
        txtNmMesa = new javax.swing.JTextField();
        txtCdMesa = new javax.swing.JTextField();
        ativaPanel = new javax.swing.JPanel();
        rbtNao = new javax.swing.JRadioButton();
        rbtSim = new javax.swing.JRadioButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Alterar Mesa");

        btnAlterar.setText("Alterar");
        btnAlterar.setToolTipText("Clique aqui para gravar as alterações da mesa");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.setToolTipText("Clique aqui para limpar os valores");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        lblCdMesa.setText("Código:");

        lblNmMesa.setText("Identificação:");

        txtNmMesa.setToolTipText("Digite a identificação (nome) da mesa");

        txtCdMesa.setToolTipText("Digite o código da mesa");
        txtCdMesa.setEnabled(false);

        ativaPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Ativa?"));
        ativaPanel.setToolTipText("Mesa ativa ou inativa?");

        ativaButtonGroup.add(rbtNao);
        rbtNao.setText("Não");
        rbtNao.setToolTipText("Selecione esta opção para desativar a mesa");

        ativaButtonGroup.add(rbtSim);
        rbtSim.setText("Sim");
        rbtSim.setToolTipText("Selecione esta opção para deixar a mesa ativa");

        javax.swing.GroupLayout ativaPanelLayout = new javax.swing.GroupLayout(ativaPanel);
        ativaPanel.setLayout(ativaPanelLayout);
        ativaPanelLayout.setHorizontalGroup(
            ativaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ativaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ativaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtNao)
                    .addComponent(rbtSim))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        ativaPanelLayout.setVerticalGroup(
            ativaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ativaPanelLayout.createSequentialGroup()
                .addComponent(rbtSim)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtNao))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(ativaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNmMesa)
                            .addComponent(lblCdMesa))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCdMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNmMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCdMesa)
                    .addComponent(txtCdMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNmMesa)
                    .addComponent(txtNmMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ativaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlterar)
                    .addComponent(btnLimpar))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-258)/2, (screenSize.height-277)/2, 258, 277);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        rbtSim.setSelected(false);
        rbtNao.setSelected(false);
        txtNmMesa.setText("");
        txtNmMesa.requestFocus();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAlterarActionPerformed
    {//GEN-HEADEREND:event_btnAlterarActionPerformed
        try
        {
            int cod = Integer.parseInt(txtCdMesa.getText());
            String nome = txtNmMesa.getText();
            char ativa = ' ';
            
            if(rbtSim.isSelected()) {
                ativa = 'S';
            }
            else if(rbtNao.isSelected()) {
                ativa = 'N';
            }
            
            String sql = "UPDATE mesa SET nm_mesa = UPPER('" + nome + "'), ic_ativa_sim_nao = '" + ativa + "' WHERE cd_mesa = " + cod;
            
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

    public void passarValoresMesa(int cod, String nome, String ativa) 
    {
        txtCdMesa.setText(Integer.toString(cod));
        txtNmMesa.setText(nome);
        
        if(ativa.equalsIgnoreCase("ativa")) {
            rbtSim.setSelected(true);
        }
        else if(ativa.equalsIgnoreCase("inativa")) {
            rbtNao.setSelected(true);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup ativaButtonGroup;
    private javax.swing.JPanel ativaPanel;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JLabel lblCdMesa;
    private javax.swing.JLabel lblNmMesa;
    private javax.swing.JRadioButton rbtNao;
    private javax.swing.JRadioButton rbtSim;
    private javax.swing.JTextField txtCdMesa;
    private javax.swing.JTextField txtNmMesa;
    // End of variables declaration//GEN-END:variables
}

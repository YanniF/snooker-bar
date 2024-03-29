package forms;

import classes.Conexao;
import classes.Utilitarios;
import javax.swing.JOptionPane;

/**
 *
 * @author Yanni
 */
public class FormCadastrarMesa extends javax.swing.JInternalFrame {

    private String textoPermitido = "abcdefghijklmnopqrstuvwxyzçáéíóúâêôàèãõñ0123456789 ";
    
    /**
     * Creates new form FormCadastrarMesa
     */
    
    Utilitarios u = new Utilitarios();
    
    public FormCadastrarMesa() {
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

        ativaButtonGroup = new javax.swing.ButtonGroup();
        btnCadastrar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        lblNmMesa = new javax.swing.JLabel();
        txtNmMesa = new javax.swing.JTextField(new classes.CaracteresPermitidos(textoPermitido + textoPermitido.toUpperCase()), "", 20);
        ativaPanel = new javax.swing.JPanel();
        rbtNao = new javax.swing.JRadioButton();
        rbtSim = new javax.swing.JRadioButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastrar Mesa");

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setToolTipText("Clique aqui para cadastrar a mesa");
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

        lblNmMesa.setText("Identificação:");

        txtNmMesa.setToolTipText("Digite a identificação (nome) da mesa");

        ativaPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Ativa?"));
        ativaPanel.setToolTipText("Mesa ativa ou inativa?");

        ativaButtonGroup.add(rbtNao);
        rbtNao.setText("Não");
        rbtNao.setToolTipText("Selecione esta opção para mesa não ativa");

        ativaButtonGroup.add(rbtSim);
        rbtSim.setSelected(true);
        rbtSim.setText("Sim");
        rbtSim.setToolTipText("Selecione esta opção para mesa ativa");

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
                        .addComponent(lblNmMesa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNmMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(btnCadastrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNmMesa)
                    .addComponent(txtNmMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ativaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnLimpar))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-258)/2, (screenSize.height-250)/2, 258, 250);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        u.limparTextFields(this);
        rbtSim.setSelected(true);
        txtNmMesa.requestFocus();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCadastrarActionPerformed
    {//GEN-HEADEREND:event_btnCadastrarActionPerformed
        int cod;
        String nome;
        char ativa = ' ';        
        
        try
        {
            nome = txtNmMesa.getText();
            
            if(rbtSim.isSelected()) {
                ativa = 's';
            }
            else if(rbtNao.isSelected()) {
                ativa = 'n';
            }
            
            String sql = "INSERT INTO MESA VALUES(MESA_SEQ.NEXTVAL, UPPER('" + nome + "'),UPPER('" + ativa + "'))";
                        
            if(Conexao.atualizar(sql) == -1)
            {
                JOptionPane.showMessageDialog(null, "O registro não pode ser inserido:\n" + Conexao.getErro() , "Cadastro", 0);
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
    private javax.swing.ButtonGroup ativaButtonGroup;
    private javax.swing.JPanel ativaPanel;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JLabel lblNmMesa;
    private javax.swing.JRadioButton rbtNao;
    private javax.swing.JRadioButton rbtSim;
    private javax.swing.JTextField txtNmMesa;
    // End of variables declaration//GEN-END:variables
}

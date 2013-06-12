/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import classes.Conexao;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rafael
 */
public class FormFecharAberturaMesa extends javax.swing.JInternalFrame {

    /**
     * Creates new form FormIniciartendimento
     */
    public FormFecharAberturaMesa() {
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldSomaTotal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButtonEncerrar = new javax.swing.JButton();
        jButtonPesquisar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jComboBoxMesa = new javax.swing.JComboBox();

        setClosable(true);
        setTitle("Encerrar Abertura Mesa");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("DESCRIÇÃO DOS PRODUTOS E SERVIÇOS");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tempo de Uso", "Mesa", "R$ Unitário", "R$ Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("VALOR TOTAL R$:");

        jTextFieldSomaTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldSomaTotal.setToolTipText("Valor total");
        jTextFieldSomaTotal.setEnabled(false);
        jTextFieldSomaTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSomaTotalActionPerformed(evt);
            }
        });

        jLabel5.setText("Nº Mesa:");

        jButtonEncerrar.setText("Encerrar");
        jButtonEncerrar.setToolTipText("Clique aqui para encerrar o atendimento");
        jButtonEncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEncerrarActionPerformed(evt);
            }
        });

        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.setToolTipText("Clique aqui para pesquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        jButtonLimpar.setText("Limpar");
        jButtonLimpar.setToolTipText("Clique aqui para limpar os valores");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        jComboBoxMesa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jButtonEncerrar)))
                .addGap(0, 43, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 201, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldSomaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jButtonPesquisar)
                    .addComponent(jButtonLimpar)
                    .addComponent(jComboBoxMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldSomaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonEncerrar)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-432)/2, (screenSize.height-320)/2, 432, 320);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldSomaTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSomaTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSomaTotalActionPerformed

    private void jButtonEncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEncerrarActionPerformed
        try {
            int cd_mesa = 0;
        //Consulta para pegar o numero do cd_abertura_comanda que está aberto
                 String sql = "SELECT \"ABERTURA_COMANDA\".\"cd_abertura_comanda\" "
                    + "FROM \"ABERTURA_COMANDA\" "
                    + "WHERE \"ABERTURA_COMANDA\".\"cd_comanda\"=" + jComboBoxMesa.getSelectedItem() + " AND \"ABERTURA_COMANDA\".\"dt_hora_fechar\" is null ";

            ResultSet rs = Conexao.consultar(sql);
            while (rs.next()) {
                cd_mesa = rs.getInt("cd_abertura_comanda");
            }
        
        //Pega a hora do sistema para inserir no banco
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");  
        System.out.println("Teste formato data: "+sdf.format(new Date()));
        
        //Coloca a hora de saída na abertura_comanda
            String sqlUpdate = "UPDATE ABERTURA_MESA "
                    + "set \"dt_hora_fechar\"= sysdate "
                    + "WHERE \"cd_abertura_mesa\"="+cd_mesa+"";
            
            if (Conexao.atualizar(sqlUpdate) != -1) {
                JOptionPane.showMessageDialog(null, "Mesa: "+jComboBoxMesa.getSelectedItem()+" finalizada com sucesso", "Cadastro", 1);
            } else {
                JOptionPane.showMessageDialog(null, Conexao.getErro(), "Cadastro", 1);
            }
            //atualiza os registros do combo
            atualizarComboBox();
            
            //Zera a tabela
            DefaultTableModel modelTable = (DefaultTableModel) jTable1.getModel();
            modelTable.setRowCount(0);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro na Exceção\n" + e.getMessage(), "Erro!", 0);
        }

    }//GEN-LAST:event_jButtonEncerrarActionPerformed
    private HashMap<Integer, Integer> comandas = new HashMap<Integer, Integer>();

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        try {
            Double vlu = 0.0;
            Double vlt = 0.0;
            int qtd = 0;
            int mesa = 0;
            Double tempo = 0.0;
            int cd_abertura = 0;
            
            //Declara a tabela
            DefaultTableModel modelTable = (DefaultTableModel) jTable1.getModel();

            //Faz Consulta para Inserir os valores na tabela
            String sql = "SELECT * "
                    + "FROM \"ABERTURA_MESA\" "
                    + "WHERE \"cd_mesa\"=" + jComboBoxMesa.getSelectedItem() + " AND \"dt_hora_fechar\" is null ";

            ResultSet rs = Conexao.consultar(sql);

            while (rs.next()) {
                int x=1;
//                cd_abertura = rs.getInt("cd_abertura_mesa"),
//                tempo=rs.getTimestamp(sql)
                
            }
//            atendimento;
//calculo de horas: select "dt_hora_abertura", sysdate, 
//to_char((cast(sysdate as timestamp)-"dt_hora_abertura"), "MI")
//from ABERTURA_MESA
            String sql2 = "SELECT * FROM ATENDIMENTO WHERE cd_abertura_mesa =" + cd_abertura + "";

            ResultSet rs2 = Conexao.consultar(sql2);
            while (rs2.next()) {
                qtd = rs2.getInt("qt_produto");
                vlt = rs2.getDouble("vl_total_atendimento");
                vlu = vlt / qtd;

                //Limpa a tabela para não agregar os valores
                modelTable.setRowCount(0);
                //Adiciona as linhas na tabela
                modelTable.addRow(new Object[]{
                            tempo,
                            mesa,
                            vlu,
                            vlt
                        });
            }

            //Varre a coluna do valor total, incrementando na variável
            Double valorTotal = 0.00;
            for (int row = 0; row < modelTable.getRowCount(); row++) {
                valorTotal += Double.parseDouble(modelTable.getValueAt(row, 3).toString());
            }
            jTextFieldSomaTotal.setText(valorTotal.toString());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro:\n" + e.getMessage(), "Aviso", 2);
        }
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
            atualizarComboBox();
    }//GEN-LAST:event_formInternalFrameOpened

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        limpar();
        
    }//GEN-LAST:event_jButtonLimparActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEncerrar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JComboBox jComboBoxMesa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldSomaTotal;
    // End of variables declaration//GEN-END:variables

    private void atualizarComboBox() {
                try {
            //Pega o código de abertura comanda na tabela Abertura Comanda
            String sqlAbert =
                    "SELECT \"cd_abertura_mesa\", \"cd_mesa\""
                    + "FROM ABERTURA_MESA "
                    + " WHERE \"dt_hora_fechar\" is null "
                    + "ORDER BY \"cd_mesa\"";
            ResultSet rs1 = Conexao.consultar(sqlAbert);
            DefaultComboBoxModel model2 = (DefaultComboBoxModel) jComboBoxMesa.getModel();
            model2.removeAllElements();

            while (rs1.next()) {
                model2.addElement(rs1.getInt("cd_mesa"));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro:\n" + e.getMessage(), "Aviso", 2);
        }
    }

    private void limpar() {
        jComboBoxMesa.setSelectedIndex(0);
        DefaultTableModel modelTable = (DefaultTableModel) jTable1.getModel();
        modelTable.setRowCount(0);
        jTextFieldSomaTotal.setText("");
    }
}

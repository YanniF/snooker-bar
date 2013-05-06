/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FormAberturaComanda.java
 *
 * Created on 05/05/2013, 23:27:14
 */
package forms;

import classes.Conexao;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Jonatas
 */
public class FormAberturaComanda extends javax.swing.JInternalFrame {

    /** Creates new form FormAberturaComanda */
    public FormAberturaComanda() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelComanda = new javax.swing.JLabel();
        jComboBoxComanda = new javax.swing.JComboBox();
        jButtonAbrir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Abertura de Comanda");

        jLabelComanda.setText("Comanda:");

        jComboBoxComanda.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "20" }));
        jComboBoxComanda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxComandaActionPerformed(evt);
            }
        });

        jButtonAbrir.setText("ABRIR");
        jButtonAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAbrirActionPerformed(evt);
            }
        });

        jLabel1.setText("INSERIR Cód para carregar o combo quando abrir o frame e fechar o banco respectivamente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelComanda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxComanda, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jButtonAbrir)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelComanda)
                    .addComponent(jComboBoxComanda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jButtonAbrir)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAbrirActionPerformed
        //Pega o item que esta selecionado no comboBox e converte para string
        String c = jComboBoxComanda.getSelectedItem().toString();
        //Pega a hora do sistema para inserir no banco
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm");  
        System.out.println(sdf.format(new Date()));  
        try
        {
            String sql = "INSERT INTO abertura_comanda (dt_hora_abertura) VALUES ("+sdf+")";// WHERE comanda='"+c+"'";
            //Baixa a comanda disponível ela não aparecerá enquanto ela não for fechada
            jComboBoxComanda.remove(this);
            //não permitir que cadastre um item com o mesmo código (banco)
            ResultSet res = Conexao.consultar(sql); 
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso.", "Cadastro", 1);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "Erro: \n" + e.getMessage(), "Erro!", 0);
        }
    }//GEN-LAST:event_jButtonAbrirActionPerformed

    private void jComboBoxComandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxComandaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxComandaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAbrir;
    private javax.swing.JComboBox jComboBoxComanda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelComanda;
    // End of variables declaration//GEN-END:variables
}

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
import java.sql.SQLException;
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
        jButtonAbrir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldComanda = new javax.swing.JTextField();

        setClosable(true);
        setTitle("Abertura de Comanda");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
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

        jLabelComanda.setText("Comanda:");

        jButtonAbrir.setText("ABRIR");
        jButtonAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAbrirActionPerformed(evt);
            }
        });

        jLabel1.setText("DIGITE A COMANDA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(71, 71, 71))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabelComanda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldComanda, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jButtonAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelComanda)
                    .addComponent(jTextFieldComanda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonAbrir, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAbrirActionPerformed
        //Pega o numero da comanda e converte para int
        int c = Integer.parseInt(jTextFieldComanda.getText());
        //Pega a hora do sistema para inserir no banco
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");  
        System.out.println(sdf.format(new Date()));  
        try
        {
            String sql = "INSERT INTO snooker.\"ABERTURA_COMANDA\" VALUES (abertura_comanda_seq.nextval,to_date('"+sdf.format(new Date())+"','dd/MM/yyyy HH24:MI'),null,null,"+c+")";
            //não permitir que cadastre um item com o mesmo código (banco)
             
            if(Conexao.atualizar(sql)!=-1) {
                JOptionPane.showMessageDialog(null, "Cadastrado com sucesso.", "Cadastro", 1);
            }else{
                JOptionPane.showMessageDialog(null, Conexao.getErro(), "Cadastro", 1);
            }
            //limpa o campo da comanda
            jTextFieldComanda.setText("");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "Erro na Exceção\n" + e.getMessage(), "Erro!", 0);
        }
    }//GEN-LAST:event_jButtonAbrirActionPerformed
    
    //Executa essas instruções ao abrir o internalFrame
    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        //Conecta com o Banco
        try {
            Conexao.conectar("snooker", "snooker"); 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Erro ao tentar conectar "+e.getMessage(),
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_formInternalFrameOpened

    //Executa essas instruções ao fechar o internalFrame
    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        //Desconecta com o Banco
        try {
            Conexao.desconectar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Erro ao tentar desconectar "+e.getMessage(),
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_formInternalFrameClosed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAbrir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelComanda;
    private javax.swing.JTextField jTextFieldComanda;
    // End of variables declaration//GEN-END:variables
}

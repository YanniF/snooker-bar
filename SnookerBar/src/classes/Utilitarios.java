package classes;

import java.awt.Component;
import java.security.MessageDigest;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JTextField;

/**
 * @author Yanni
 */
public class Utilitarios extends JFrame{
    
    public void limparTextFields(JFrame frame)
    {//esse método limpa os JFrames e MDIs
        for(int i = 0; i < frame.getContentPane().getComponentCount(); i++)
        {//percorre todos os componentes
            Component c = frame.getContentPane().getComponent(i);
            
            if(c instanceof JTextField)
            {//apaga os valores e coloca o foco no primeiro componente
                JTextField campo = (JTextField) c;
                campo.setText("");
                campo.requestFocus();
            }            
        }
    }
    
    public void limparTextFields(JInternalFrame frame)
    {//esse método limpa os InternalFrames
        for(int i = 0; i < frame.getContentPane().getComponentCount(); i++)
        {//percorre todos os componentes
            Component c = frame.getContentPane().getComponent(i);
            
            if(c instanceof JTextField)
            {//apaga os valores e coloca o foco no primeiro componente
                JTextField campo = (JTextField) c;
                campo.setText("");
                campo.requestFocus();//as vezes não dá certo
            }
        }
    }
    
     public static String md5Java(String message){
        String digest = null;
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] hash = md.digest(message.getBytes("UTF-8"));
           
            //converting byte array to Hexadecimal String
           StringBuilder sb = new StringBuilder(2 * hash.length);
           for(byte b : hash){
               sb.append(String.format("%02x", b&0xff));
           }
          
           digest = sb.toString();
          
        } catch (Exception ex) {
            System.out.println("erro " + ex.getMessage());        
        }
        return digest;
    }
}

package classes;

import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JTextField;

/**
 * @author Yanni
 */
public class Metodos extends JFrame{
    
    public void limpar(JFrame frame)
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
    
    public void limpar(JInternalFrame frame)
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
}

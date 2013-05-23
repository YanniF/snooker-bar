package classes;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 * @author Yanni
 */
public class CaracteresPermitidos extends PlainDocument {
    
    final String permitidos;
    
    public CaracteresPermitidos(String permitidos) {
        this.permitidos = permitidos;
    }
    
    @Override
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {

        StringBuilder sb = new StringBuilder(str);
        
        for (int i = sb.length() - 1; i >= 0; i--) 
        {
            if (permitidos.indexOf(sb.charAt(i)) < 0) {
                sb.replace(i, i + 1, "");
            }
        }
        super.insertString(offs, sb.toString(), a);
    }
}

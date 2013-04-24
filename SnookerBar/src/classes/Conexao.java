package classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * @author Yanni
 */
public class Conexao {
    
    private static Connection conexao;
    
    public static void conectar(String user, String pass) throws Exception
    {
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:XE";
            conexao = DriverManager.getConnection(url, user, pass);            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Erro: \n" + e.getMessage(), "Erro!", 0);
        }
    }

    public static void desconectar()
    {
        try {
            conexao.close();
        }
        catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: \n" + e.getMessage(), "Erro!", 0);
        }
    }
    
    public static ResultSet consultar(String sql) throws SQLException
    {
        try
        {
            return conexao.createStatement().executeQuery(sql);            
        }
        catch(SQLException e)
        {
            return null;
        }
    }
}

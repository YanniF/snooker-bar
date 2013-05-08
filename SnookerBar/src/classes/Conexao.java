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
    //criar um objeto do tipo usuário, onde tem se ele é adm e o nome 
    
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
            JOptionPane.showMessageDialog(null, "Erro na conexão: \n" + e.getMessage(), "Erro!", 0);
        }
    }

    public static void desconectar()
    {
        try {
            conexao.close();
        }
        catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro em desconectar: \n" + e.getMessage(), "Erro!", 0);
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
    
    public static String atualizar(String sql) throws SQLException
    {
        try
        {
            conexao.createStatement().executeUpdate(sql);
            return "";
        }
        catch(SQLException e)
        {
            return e.getMessage();
        }
    }
}

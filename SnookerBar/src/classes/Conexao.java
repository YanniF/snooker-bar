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
    private static String erro;   
    
    public static String getErro(){
        return  erro;
    }
        
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
    
    public static ResultSet consultar(String sql)
    {
        try
        {
            ResultSet rs = conexao.createStatement().executeQuery(sql);
            erro = "";
            return rs;      
        }
        catch(SQLException e)
        {
            erro = e.getMessage();
            return null;
        }
    }
    
    public static int atualizar(String sql)
    {
        try
        {
            int qtde = conexao.createStatement().executeUpdate(sql);
            erro = "";
            return qtde;
        }
        catch(SQLException e)
        {
            erro = e.getMessage();
            return -1;
        }
    }
}

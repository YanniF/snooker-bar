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
    
    private static String erro;    
    public static String getErro(){
        return  erro;
    }
    
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
    
    public static int atualizar(String sql) throws SQLException
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

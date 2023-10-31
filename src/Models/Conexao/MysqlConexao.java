package Models.Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class MysqlConexao implements IConexao {
    private static final String USUARIO = "root";
    private static final String SENHA = "root";
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/apts";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    public MysqlConexao()
    {
    }
        public void Salvar(int codigo, String nome, double saldo) {
        try
        {
            Class.forName(DRIVER);
            Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA);
            Statement stmt = conn.createStatement();
            String query = "INSERT INTO CONTA (codigo, nome, saldo) VALUES(" + codigo+ " , '" + nome + "' , " + saldo + ")";
            stmt.executeUpdate(query);
            stmt.close();
            System.out.println(" Conta cadastrada.");}
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        }
    }

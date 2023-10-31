import Models.Conexao.IConexao;
import Models.Conexao.MysqlConexao;
import Models.Conta;

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta(2, "Peter", 22.24);
        IConexao conn = new MysqlConexao();
        conn.Salvar(conta);
        }
    }
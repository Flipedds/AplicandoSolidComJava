import Models.Conexao.IConexao;
import Models.Conexao.MysqlConexao;
import Models.Conta;

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta(1, "John", 2.24);
        IConexao conn = new MysqlConexao();
        conn.Salvar(conta.getNumero(), conta.getNome(), conta.getSaldo());
        }
    }
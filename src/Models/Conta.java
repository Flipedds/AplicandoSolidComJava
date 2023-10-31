package Models;

public class Conta {
    private int codigo;
    private String nome;
    private double saldo;

    public Conta(int codigo, String nome, double saldo)
    {
        this.codigo = codigo;
        this.nome = nome;
        this.saldo = saldo;
    }

    public double calculaSaldoJurosCompostos(int meses, double taxa)
    {
        double montante = saldo * Math.pow((1 + taxa), meses);
        return montante;
    }
    public double calculaSaldoJurosSimples(int meses, double taxa)
    {
        double montante = saldo * (1 + (taxa * meses));
        return montante;
    }
    public int getNumero()
    {
        return codigo;
    }
    public void setNumero(int numero)
    {
        this.codigo = numero;
    }
    public String getNome()
    {
        return nome;
    }
    public void setNome(String nome)
    {
        this.nome= nome;
    }
    public double getSaldo()
    {
        return saldo;
    }public void setSaldo(double saldo)
    {
        this.saldo = saldo;
    }
}

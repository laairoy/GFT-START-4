package me.dio.gft.funcionarios;

public class Supervisor extends Funcionario{
    private static double bonificacao = 5000.0;

    public Supervisor(String nome, double salario, int idade) {
        super(nome, salario, idade);
    }

    @Override
    public double bonificacao() {
        return this.salario + this.bonificacao;
    }

    @Override
    public String toString() {
        return "Supervisor{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                ", idade=" + idade +
                '}';
    }
}

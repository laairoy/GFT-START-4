package me.dio.gft.funcionarios;

public class Gerente extends Funcionario{
    private static double bonificacao = 10000.0;

    public Gerente(String nome, double salario, int idade) {
        super(nome, salario, idade);
    }

    @Override
    public double bonificacao() {
        return this.salario + this.bonificacao;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                ", idade=" + idade +
                '}';
    }
}

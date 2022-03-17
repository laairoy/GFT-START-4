package me.dio.gft.funcionarios;

public class Vendedor extends Funcionario {
    private static double bonificacao = 3000.0;

    public Vendedor(String nome, double salario, int idade) {
        super(nome, salario, idade);
    }

    @Override
    public double bonificacao() {
        return this.salario + this.bonificacao;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                ", idade=" + idade +
                '}';
    }
}

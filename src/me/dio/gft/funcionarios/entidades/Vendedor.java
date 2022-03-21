package me.dio.gft.funcionarios.entidades;

import me.dio.gft.funcionarios.Bonificacao;

public class Vendedor extends Funcionario {

    public Vendedor(String nome, double salario, int idade) {
        super(nome, salario, idade);
    }

    @Override
    public double bonificacao() {
        return this.salario + Bonificacao.VENDEDOR.getBonus();
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

package me.dio.gft.funcionarios.entidades;

import me.dio.gft.funcionarios.Bonificacao;

public class Gerente extends Funcionario{

    public Gerente(String nome, double salario, int idade) {
        super(nome, salario, idade);
    }

    @Override
    public double bonificacao() {
        return this.salario + Bonificacao.GERENTE.getBonus();
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

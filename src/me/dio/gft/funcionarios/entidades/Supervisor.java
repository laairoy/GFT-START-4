package me.dio.gft.funcionarios.entidades;

import me.dio.gft.funcionarios.Bonificacao;

public class Supervisor extends Funcionario{

    public Supervisor(String nome, double salario, int idade) {
        super(nome, salario, idade);
    }

    @Override
    public double bonificacao() {
        return this.salario + Bonificacao.SUPERVISOR.getBonus();
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

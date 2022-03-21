package me.dio.gft.funcionarios.entidades;

public abstract class Funcionario {
    protected String nome;
    protected double salario;
    protected int idade;

    public Funcionario(String nome, double salario, int idade) {
        this.nome = nome;
        this.salario = salario;
        this.idade = idade;
    }

    public abstract double bonificacao();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}

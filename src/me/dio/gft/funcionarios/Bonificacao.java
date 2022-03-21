package me.dio.gft.funcionarios;

public enum Bonificacao {
    GERENTE(10000.0),
    SUPERVISOR(5000.0),
    VENDEDOR(3000.0);

    private final double bonus;

    Bonificacao(double bonus){
        this.bonus = bonus;
    }

    public double getBonus(){
        return this.bonus;
    }
}

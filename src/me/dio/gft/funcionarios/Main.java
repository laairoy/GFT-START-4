package me.dio.gft.funcionarios;

import me.dio.gft.funcionarios.entidades.Gerente;
import me.dio.gft.funcionarios.entidades.Supervisor;
import me.dio.gft.funcionarios.entidades.Vendedor;

public class Main {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("Marcos", 2000.0, 20);
        Supervisor supervisor = new Supervisor("Marcos", 2000.0, 20);
        Vendedor vendedor = new Vendedor("Marcos", 2000.0, 20);

        System.out.println(gerente + " bonus: " + gerente.bonificacao());
        System.out.println(supervisor + " bonus: " + supervisor.bonificacao());
        System.out.println(vendedor + " bonus: " + vendedor.bonificacao());


    }
}

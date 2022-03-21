package me.dio.gft.sequenciaNumeros;

public class Main {
    public static void main(String[] args) {

        testarValores("1 2 3 44 5");
        testarValores("55 2 1 854 963 520 1 0 98 8");
        testarValores("");
        testarValores("2 3 5 44 8 99 6 55 72 3 01 25");
        testarValores("98 99 100 101 102 103 105 105");
        testarValores("1");
    }

    public static void testarValores(String str){
        try {
            SequenciaNumeros sn = new SequenciaNumeros(str);
            System.out.println(str);
            System.out.println("O maior número é: " + sn.getMaior());
            System.out.println("O menor número é: " + sn.getMenor());
            System.out.println("A Soma dos valores é: " + sn.getSoma());
            System.out.println();
        }catch (NumberFormatException e){
            System.out.println("Lista de números inválida!");

        }
    }
}

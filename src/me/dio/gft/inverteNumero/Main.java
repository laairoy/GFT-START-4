package me.dio.gft.inverteNumero;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        long[] numeros = {15485448L, 2195498L, 12L, 98716549L, 9999998999L, 1654891L};

        for(long n : numeros){
            System.out.println(n + "->" + InverteNumero.inverter(n));
        }

    }
}

package me.dio.gft.inverteNumero;

public class InverteNumero {
    public static long inverter(long num){
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(num)).reverse();
        return Long.parseLong(stringBuilder.toString());
    }
}

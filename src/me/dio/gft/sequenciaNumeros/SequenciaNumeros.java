package me.dio.gft.sequenciaNumeros;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SequenciaNumeros {

    private List<Long> listaNumeros;

    public SequenciaNumeros(String str) throws NumberFormatException {
        this.listaNumeros = new ArrayList<>();
        gerarLista(str);
    }

    private void gerarLista(String str) throws NumberFormatException {
        listaNumeros = Stream.of(str.split(" ")).map(Long::parseLong).collect(Collectors.toList());
    }

    public Long maiorNumero(){
       return listaNumeros.stream().max(Long::compare).get();
    }

    public Long somaValores(){
        return listaNumeros.stream().reduce(Long::sum).get();
    }


}

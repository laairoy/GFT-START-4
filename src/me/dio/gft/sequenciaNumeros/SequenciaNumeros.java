package me.dio.gft.sequenciaNumeros;

import java.util.LongSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SequenciaNumeros {

    private final LongSummaryStatistics ls;

    public SequenciaNumeros(String str) throws NumberFormatException {
        this.ls = Stream.of(str.split(" "))
                .collect(Collectors.summarizingLong(Long::parseLong));
    }

    public Long getMaior() {
        return this.ls.getMax();
    }

    public Long getSoma() {
        return this.ls.getSum();
    }

    public Long getMenor(){
        return this.ls.getMin();
    }


}

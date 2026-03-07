package modulo04;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Main01 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(10, 20, 99, 40, 50);

        IntSummaryStatistics est = numeros.stream()
                .collect(Collectors.summarizingInt(Integer::intValue));

        System.out.println("Maior numero: " + est.getMax());

    }
}

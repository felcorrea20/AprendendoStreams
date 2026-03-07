package modulo04;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main05 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        Map<String, List<Integer>> separados = numeros.stream()
                .collect(Collectors.groupingBy(n -> n % 2 == 0 ? "Par" : "Impar"));

        System.out.println(separados);

    }

}

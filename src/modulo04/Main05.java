package modulo04;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main05 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        // Forma que fiz
        Map<String, List<Integer>> separados = numeros.stream()
                .collect(Collectors.groupingBy(n -> n % 2 == 0 ? "Par" : "Impar"));

        System.out.println(separados);

        // Gabarito
        Map<Boolean, List<Integer>> particionado = numeros.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println("Pares: " + particionado.get(true));  // Esperado: [2, 4, 6]
        System.out.println("Ímpares: " + particionado.get(false)); // Esperado: [1, 3, 5]

    }

}

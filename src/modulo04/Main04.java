package modulo04;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main04 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        // Forma que fiz
        Optional<Integer> resultado = numeros.stream()
                .filter(n -> n % 2 == 0)
                .reduce((a, b) -> a * a + b * b);
        resultado.ifPresent(System.out::println);

        // Gabarito
        int somaDosQuadrados = numeros.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .reduce(0, Integer::sum);
        System.out.println(somaDosQuadrados); // Esperado: 56 (4 + 16 + 36)

        // Alternativa
        int soma = numeros.stream()
                .mapToInt(Integer::intValue)
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .sum();
        System.out.println(soma);

    }

}

package modulo04;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main04 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        Optional<Integer> resultado = numeros.stream()
                .filter(n -> n % 2 == 0)
                .reduce((a, b) -> a * a + b * b);

        resultado.ifPresent(System.out::println);

    }

}

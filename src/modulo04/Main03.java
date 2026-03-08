package modulo04;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main03 {

    public static void main(String[] args) {

        List<String> nomes = Arrays.asList("Alice", "Bob", "Charlie");

        String nomesConcatenados = nomes.stream()
                                        .collect(Collectors.joining(", "));

        System.out.println(nomesConcatenados);

    }

}

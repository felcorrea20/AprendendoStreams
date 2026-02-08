import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {
//        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
//        numeros.stream()
//                .filter(n -> n % 2 == 0)
//                .forEach(System.out::println);
//
//        List<String> palavras = Arrays.asList("java", "stream", "lambda");
//        palavras.stream()
//                .map(p -> p.toUpperCase())
//                .forEach(System.out::println);
//
//        List<Integer> numeros2 = Arrays.asList(1, 2, 3, 4, 5, 6);
//        List<Integer> listaNumeros = numeros2.stream()
//                                                .filter(n -> n % 2 != 0)
//                                                .map(n -> n * 2)
//                                                .toList();
//        listaNumeros.forEach(System.out::println);
//
//        List<String> frutas = Arrays.asList("apple", "banana", "apple", "orange", "banana");
//        frutas.stream()
//                .distinct()
//                .forEach(System.out::println);
//
//        List<List<Integer>> listaDeNumeros = Arrays.asList(
//                Arrays.asList(1, 2, 3, 4),
//                Arrays.asList(5, 6, 7, 8),
//                Arrays.asList(9, 10, 11, 12)
//        );
//
//        List<Integer> listaDeNumerosFiltrada = listaDeNumeros.stream()
//                .flatMap(List::stream)
//                .filter(Main2::ehPrimo)
//                .sorted()
//                .collect(Collectors.toList());
//
//        System.out.println(listaDeNumerosFiltrada);
//
//        List<Pessoa> pessoas = Arrays.asList(
//                new Pessoa("Alice", 22),
//                new Pessoa("Bob", 17),
//                new Pessoa("Charlie", 19)
//        );
//
//        pessoas.stream()
//                .filter(p -> p.getIdade() > 18)
//                .forEach(p -> System.out.println(p.getNome()));

        List<Produto> produtos = Arrays.asList(
                new Produto("Smartphone", 800.0, "Eletrônicos"),
                new Produto("Notebook", 1500.0, "Eletrônicos"),
                new Produto("Teclado", 200.0, "Eletrônicos"),
                new Produto("Cadeira", 300.0, "Móveis"),
                new Produto("Monitor", 900.0, "Eletrônicos"),
                new Produto("Mesa", 700.0, "Móveis")
        );

        List<Produto> produtosFiltrados = produtos.stream()
                .filter(p -> p.getCategoria() == "Eletrônicos" && p.getPreco() < 1000.0)
                .sorted(Comparator.comparing(Produto::getPreco))
                .collect(Collectors.toList());

        produtosFiltrados.forEach(System.out::println);



    }

    private static boolean ehPrimo(int numero) {
        if (numero < 2) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++){
            if (numero % i == 0){
                return false;
            }
        }
        return true;
    }
}

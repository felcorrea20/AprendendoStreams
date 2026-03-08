package modulo04.restoDosExercicios;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Produto> produtos = Arrays.asList(
                new Produto("Smartphone", 800.0, "Eletrônicos"),
                new Produto("Notebook", 1500.0, "Eletrônicos"),
                new Produto("Teclado", 200.0, "Eletrônicos"),
                new Produto("Cadeira", 300.0, "Móveis"),
                new Produto("Monitor", 900.0, "Eletrônicos"),
                new Produto("Mesa", 700.0, "Móveis")
        );

        // 5 =========================================================
        List<Produto> eletronicos = produtos.stream()
                .filter(p -> p.getCategoria().equalsIgnoreCase("Eletrônicos") && p.getPreco() < 1000)
                .sorted(Comparator.comparing(Produto::getPreco))
                .toList();

        System.out.println("=========================================================");
        System.out.println("Somente eletronicos com preço menor que 1000 (ordem crescente):");
        eletronicos.forEach(System.out::println);
        System.out.println("=========================================================");

        // 6 =========================================================
        Map<String, List<Produto>> agrupadosCategoria = produtos.stream()
                .collect(Collectors.groupingBy(Produto::getCategoria));

        System.out.println("Agrupado por categoria: ");
        System.out.println(agrupadosCategoria);
        System.out.println("=========================================================");

        // 7 =========================================================
        Map<String, Long> qtdPorCategoria = produtos.stream()
                .collect(Collectors.groupingBy(Produto::getCategoria, Collectors.counting()));

        System.out.println("Quantidade de produtos por categoria: ");
        System.out.println(qtdPorCategoria);
        System.out.println("=========================================================");

        // 8 =========================================================
        Map<String, Optional<Produto>> produtoMaisCaro = produtos.stream()
                .collect(Collectors.groupingBy(Produto::getCategoria,
                        Collectors.maxBy(Comparator.comparing(Produto::getPreco))));

        System.out.println("modulo03.Produto mais caro de cada categoria:");
        System.out.println(produtoMaisCaro);
        System.out.println("=========================================================");

        // 9 =========================================================
        Map<String, Double> somaPrecoPorCategoria = produtos.stream()
                .collect(Collectors.groupingBy(Produto::getCategoria,
                        Collectors.summingDouble(Produto::getPreco)));

        System.out.println("Media de preco por categoria:");
        System.out.println(somaPrecoPorCategoria);
        System.out.println("=========================================================");


    }

}

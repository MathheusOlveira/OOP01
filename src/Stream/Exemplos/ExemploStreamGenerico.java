package Stream.Exemplos;

import java.util.List;
import java.util.stream.Stream;

public class ExemploStreamGenerico {
    public static void main(String[] args) {
        List<String> nomes = List.of("Ana ", "Bia ", "Lia ", "Gui "); //criação de uma lista imutável de Strings
        Stream<String> streamStrings = nomes.stream(); //criação de um stream a partir da lista nomes, criada acima
        streamStrings.forEach(System.out::print); //imprimindo cada elemento da lista com o metodo forEach do Stream
        System.out.println();

        Stream<Integer> streamInteiros = Stream.of(10, 20, 30, 40, 50); //criando um stream com valores inteiros
        streamInteiros.forEach(n -> System.out.print((n * 2) + " ")); //aplica cada elemnto (n) a expressão (n * 2) e imprime cada um deles
        System.out.println();
    }
}
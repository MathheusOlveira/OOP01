package Stream.Exemplos;

import java.util.stream.IntStream;

public class ExemploIntStream {
    public static void main(String[] args) {
        IntStream.rangeClosed( 1 , 5 ).forEach(System.out::print);
        System.out.println();

        int soma = IntStream.of(1, 2 ,3 , 4, 5).sum();
        System.out.println("Soma: " + soma);
    }
}
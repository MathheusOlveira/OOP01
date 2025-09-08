package Stream.ListaExerc01;

import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class Exer04 {
    public static void main(String[] args) {
        Double mediaSaldo = DoubleStream.of(5000, 200, 3000, -4200, 5123, 1500, 1000, 1111)
                .average()
                .orElse(0);


        System.out.println(" teu cu" + mediaSaldo);
    }
}
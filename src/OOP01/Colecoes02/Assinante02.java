package OOP01.Colecoes02;

import java.util.Objects;
import java.util.HashSet;
import java.util.Set;

public class Assinante02 {
    public static class Assinante {
        private int idade;
        private String nome;
        private String email;

        public Assinante(int idade, String nome, String email) {
            this.idade = idade;
            this.nome = nome;
            this.email = email;
        }
        public String getEmail() { return email; }

        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;
            Assinante assinante = (Assinante) o;
            return Objects.equals(email, assinante.email);
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(email);
        }
    }

    public static void main(String[] args) {
        Set<Assinante> assinantes = new HashSet<>();

        assinantes.add(new Assinante(1 , "Ana Verde", "anaverde@gmail.com"));
        assinantes.add(new Assinante(2 , "Bruno Azul", "brunoazul@hotmail.com"));
        assinantes.add(new Assinante(3 , "Carla Amarela", "amarelacarla@msn.com"));
        assinantes.add(new Assinante(4 , "Daniel Preto", "daniel.preto@outlook.com"));
        assinantes.add(new Assinante(5 , "Ana Verde", "anaverde@uol.com")); // Tentativa de adicionar um assinante com email duplicado
        assinantes.add(new Assinante(6, "Eva Pinto Rosa", "rosaepinto@gmail.com"));
        assinantes.add(new Assinante(7, "Everaldo Rosa e Pinto", "rosaepinto@gmail.com")); // Tentativa de adicionar um assinante com email duplicado

        System.out.println("Assinantes únicos cadastrados:");
        for (Assinante assinante : assinantes) {
            System.out.println("Nome: " + assinante.nome + ", Email: " + assinante.email);
        }
    }
}
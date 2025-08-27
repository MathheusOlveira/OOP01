package OOP01.Hackaton2;
//Haclathon 2
//Matheus Oliveira de Assunção

public class Main {
    public static void main(String[] args) {
        Investimento[] investimentos = new Investimento[4];

        investimentos[0] = new RendaFixa(1000);
        investimentos[1] = new RendaVariavel(2000);
        investimentos[2] = new RendaFixa(1500);
        investimentos[3] = new RendaVariavel(3000);

        for (Investimento investimento : investimentos) {
            investimento.calcularRendimento();
        }
        System.out.println("|-------------------------------------|");
    }
}

//1. 15
//2. 10
//3. 10
//4. 15
//5. 15
//6. 20
//7. 10
//Total: 95
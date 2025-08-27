package OOP01.Exercicios;

public class ClienteVip {
    private String nome;
    private String cpf;
    private double limiteCredito;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }
    public void setLimiteCredito(double limiteCredito) {
        if(limiteCredito >= 1000 && limiteCredito <= 100000){
            this.limiteCredito = limiteCredito;
        }else{
            System.out.println("Crédito Invalido!!");
        }
        this.limiteCredito = limiteCredito;
    }

    public void exibirCliente(){
        System.out.println("-----Crédito-----");
        System.out.println("Titular: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Crédito: " + this.limiteCredito);
    }
}

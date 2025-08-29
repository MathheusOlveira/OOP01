package OOP01.HackathonCollections;

import java.util.*;

//Hackathon Collections - Banco Digital
// Matheus Henrique
// Maurico Zazeri
// Matheus Oliveira

//main conforme solicitado na descrição do projeto + metodos que originalmente estariam nas
//Classes Conta e Cliente foram adpatados com Random para gerar IDs e números de conta aleatórios e Scanner, mesmo não sendo solicitado originalmente.

public class BancoDigitalHackaton {
    private final static Set<Cliente> clientes = new HashSet<>();
    private final static Map<Integer, Conta> contas = new HashMap<>();
    private static final Random random = new Random();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean rodando = true;

        while (rodando) {
            System.out.println("\n=== Banco Digital Hackaton ===");
            System.out.println("1. Cadastrar Cliente");
            System.out.println("2. Abrir Conta");
            System.out.println("3. Realizar Depósito");
            System.out.println("4. Realizar Saque");
            System.out.println("5. Realizar Transferência");
            System.out.println("6. Consultar saldo");
            System.out.println("7. Extrato");
            System.out.println("8.Listar Clientes");
            System.out.println("9. Sair");
            System.out.print("Escolha uma opção: ");
            System.out.println("=============================");

            int opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    cadastrarCliente(sc);
                    break;
                case 2:
                    abrirConta(sc);
                    break;
                case 3:
                    deposito(sc);
                    break;
                case 4:
                    saque(sc);
                    break;
                case 5:
                    transferenciaEnviada(sc);
                    break;
                case 6:
                    consultarSaldo(sc);
                    break;
                case 7:
                    extrato(sc);
                    break;
                case 8:
                    listarClientes();
                    break;
                case 9:
                    rodando = false;
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }

    public static void cadastrarCliente(Scanner sc) {

        System.out.print("Nome do cliente: ");
        sc.nextLine(); // Consumir a nova linha
        String nome = sc.nextLine();
        System.out.print("CPF do cliente: ");
        String cpf = sc.nextLine();
        int id = random.nextInt(90000) + 10000; // Gera um ID aleatório entre 10000 e 99999

        Cliente novoCliente = new Cliente(nome, cpf, id);
        if (clientes.add(novoCliente)) {
            System.out.println("Cliente cadastrado com sucesso!");
        } else {
            System.out.println("Cliente com este CPF já existe!");
        }
    }

    public static void abrirConta(Scanner sc) {
        System.out.print("CPF do cliente: ");
        sc.nextLine(); // Consumir a nova linha
        String cpf = sc.nextLine();

        Cliente cliente = clientes.stream()
                .filter(c -> c.getCpf().equals(cpf))
                .findFirst()
                .orElse(null);

        if (cliente == null) {
            System.out.println("Cliente não encontrado! Cadastre o cliente primeiro.");
            return;
        }

        int numeroConta;
        do {
            numeroConta = random.nextInt(90000) + 10000; // Gera um número de conta aleatório entre 10000 e 99999
        } while (contas.containsKey(numeroConta));

        Conta novaConta = new Conta(numeroConta, cliente);
        contas.put(numeroConta, novaConta);
        System.out.println("Conta aberta com sucesso! Número da conta: " + numeroConta);
    }

    public static void deposito(Scanner sc) {
        System.out.print("Número da conta para depósito: ");
        int numeroConta = sc.nextInt();
        Conta conta = contas.get(numeroConta);
        if (conta == null) {
            System.out.println("Conta não encontrada!");
            return;
        }
        System.out.print("Valor do depósito: ");
        double valor = sc.nextDouble();
        if (conta.depositar(valor, sc)) {
            System.out.println("Depósito realizado com sucesso!");
        }
    }

    public static void saque(Scanner sc) {
        System.out.print("Número da conta para saque: ");
        int numeroConta = sc.nextInt();
        Conta conta = contas.get(numeroConta);
        if (conta == null) {
            System.out.println("Conta não encontrada!");
            return;
        }
        System.out.print("Valor do saque: ");
        double valor = sc.nextDouble();
        if (conta.sacar(valor, sc)) {
            System.out.println("Saque realizado com sucesso!");
        }
    }

    public static void transferenciaEnviada(Scanner sc) {
        System.out.print("Número da conta de origem: ");
        int contaOrigemNum = sc.nextInt();

        Conta contaOrigem = contas.get(contaOrigemNum);
        if (contaOrigem == null) {
            System.out.println("Conta de origem não encontrada!");
            return;
        }
        System.out.print("Número da conta de destino: ");
        int contaDestinoNum = sc.nextInt();
        Conta contaDestino = contas.get(contaDestinoNum);

        if (contaDestino == null) {
            System.out.println("Conta de destino não encontrada!");
            return;
        }
        System.out.print("Valor da transferência: ");
        double valor = sc.nextDouble();

        if (contaOrigem.sacar(valor, sc)) {
            contaDestino.registrarTransacaoRecebida(valor, contaOrigemNum);
            contaOrigem.registrarTransacaoEnviada(valor, contaDestinoNum);
            System.out.println("Transferência realizada com sucesso!");
        }
    }

    public static void consultarSaldo(Scanner sc) {
        System.out.print("Número da conta: ");
        int numeroConta = sc.nextInt();
        Conta conta = contas.get(numeroConta);

        if (conta == null) {
            System.out.println("Conta não encontrada!");
            return;
        }
        System.out.println("Saldo da conta " + numeroConta + ": R$ " + conta.getSaldo());
    }

    public static void extrato(Scanner sc) {
        System.out.print("Número da conta: ");
        int numeroConta = sc.nextInt();
        Conta conta = contas.get(numeroConta);

        if (conta == null) {
            System.out.println("Conta não encontrada!");
            return;
        }
        conta.imprimirExtrato();
    }

    public static void listarClientes() {
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
            return;
        }
        System.out.println("Clientes cadastrados:");
        for (Cliente cliente : clientes) {
            System.out.println("ID: " + cliente.getId() + ", Nome: " + cliente.getNome() + ", CPF: " + cliente.getCpf());
        }
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Controle controle = new Controle();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("0 - Sair");
            System.out.println("1 - Criar venda");
            System.out.println("2 - Imprimir todas as vendas");
            System.out.println("3 - Imprimir vendas de um cliente");
            System.out.println("4 - Imprimir clientes");
            System.out.println("5 - Imprimir produtos");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    // Criar venda
                    System.out.print("Nome do cliente: ");
                    String nomeCliente = scanner.nextLine();
                    System.out.print("Nome do produto: ");
                    String nomeProduto = scanner.nextLine();
                    System.out.print("Valor pago: ");
                    double valorPago = scanner.nextDouble();
                    scanner.nextLine(); // Consumir a nova linha
                    System.out.print("Status (RESERVA, PAGOTOTAL, ENVIADO): ");
                    Status status = Status.valueOf(scanner.nextLine().toUpperCase());
                    System.out.print("Canal (WHATSAPP, INSTAGRAM, FACEBOOK, OLX): ");
                    Canal canal = Canal.valueOf(scanner.nextLine().toUpperCase());

                    Cliente cliente = new Cliente(nomeCliente, "", "");
                    Produto produto = new Produto(nomeProduto, valorPago, 1);
                    controle.adicionarCliente(cliente);
                    controle.adicionarProduto(produto);
                    controle.criarVenda(cliente, produto, valorPago, status, canal);
                    break;
                case 2:
                    controle.imprimirVendas();
                    break;
                case 3:
                    System.out.print("Nome do cliente: ");
                    String nomeClienteVenda = scanner.nextLine();
                    controle.imprimirVendasCliente(nomeClienteVenda);
                    break;
                case 4:
                    controle.imprimirClientes();
                    break;
                case 5:
                    controle.imprimirProdutos();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
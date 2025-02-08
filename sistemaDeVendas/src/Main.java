import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Controle controle = new Controle();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("0 - Sair");
            System.out.println("1 - Criar venda");
            System.out.println("2 - Cadastrar produto");
            System.out.println("3 - Cadastrar cliente");
            System.out.println("4 - Imprimir todas as vendas");
            System.out.println("5 - Imprimir vendas de um cliente");
            System.out.println("6 - Imprimir clientes cadastrados");
            System.out.println("7 - Imprimir produtos cadastrados");
            System.out.println("8 - Alterar status da venda");
            System.out.println("9 - Atualizar quantidade em estoque do produto");
            System.out.println("10 - Buscar e imprimir venda por id");
            System.out.println("11 - Imprimir todas as vendas de um canal");
            System.out.println("12 - Imprimir vendas de um período");
            System.out.print("Escolha uma opção: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Opção inválida! Digite um número.");
                scanner.next();
            }
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    controle.criarVenda();
                    break;
                case 2:
                    controle.cadastrarProduto();
                    break;
                case 3:
                    controle.cadastrarCliente();
                    break;
                case 4:
                    controle.imprimirVendas();
                    break;
                case 5:
                    System.out.print("Nome do cliente: ");
                    String nomeClienteVenda = scanner.nextLine();
                    controle.imprimirVendasCliente(nomeClienteVenda);
                    break;
                case 6:
                    controle.imprimirClientes();
                    break;
                case 7:
                    controle.imprimirProdutos();
                    break;
                case 8:
                    System.out.print("ID da venda: ");
                    int idVenda = scanner.nextInt();
                    scanner.nextLine();
                    controle.mudarStatusVenda(idVenda);
                    break;
                case 9:
                    System.out.print("Nome do produto: ");
                    String nomeProduto = scanner.nextLine();
                    System.out.print("Nova quantidade em estoque: ");
                    int novaQuantidade = scanner.nextInt();
                    scanner.nextLine();
                    controle.atualizarQuantidadeEstoque(nomeProduto, novaQuantidade);
                    break;
                case 10:
                    System.out.print("ID da venda: ");
                    int idVendaBusca = scanner.nextInt();
                    scanner.nextLine();
                    controle.imprimirVendaId(idVendaBusca);
                    break;
                case 11:
                    System.out.print("Canal (WHATSAPP, INSTAGRAM, FACEBOOK, OLX): ");
                    String canal = scanner.nextLine();
                    controle.imprimirVendasCanal(canal);
                    break;
                case 12:
                    System.out.print("Data de início (dd/MM/yyyy): ");
                    String dataInicio = scanner.nextLine();
                    System.out.print("Data de fim (dd/MM/yyyy): ");
                    String dataFim = scanner.nextLine();
                    controle.imprimirVendasPeriodo(dataInicio, dataFim);
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
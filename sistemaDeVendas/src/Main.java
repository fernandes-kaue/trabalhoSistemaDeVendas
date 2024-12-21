import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Controle controle = new Controle();
        int opcaoMenu = -1;


        System.out.println("Bem-vindo ao nosso Sistema de Vendas! \n ");
        while (opcaoMenu != 0) {
            System.out.println(" MENU: \n Informe a opção desejada:");
            System.out.println(" 1- Criar venda \n 2- Imprimir todas as vendas \n 3- Imprimir vendas de um cliente \n 4- Imprimir clientes \n 5- Imprimir produtos\n 0- Sair");
            opcaoMenu = sc.nextInt();
            switch (opcaoMenu) {
                case 1:
                    controle.criarVenda();
                    break;
                case 2:
                    controle.cadastrarProduto();
                case 3:
                    //TODO -> TESTAR
                    System.out.println("informe o Id do cliente que você quer ver as compras: ");
                    var id = sc.nextInt();
                    controle.imprimirVendasCliente(id);
                    break;
                case 4:
                    controle.imprimirVendas();
                    break;
                case 5:
                    controle.imprimirClientes();
                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:

                    break;
                case 9:

                    break;
                case 10:

                    break;
                case 11:

                    break;
                case 12:

                    break;

                case 0:
                    controle.sair();
                    break;
                default:
                    System.out.println("Opção inválida! Informe novamente.");
                    break;
            }

        }
    }
}

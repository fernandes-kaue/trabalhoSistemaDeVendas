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
                    //TODO -> implementar lógica
                    break;
                case 2:
                    //TODO -> implementar lógica
                    break;
                case 3:
                    //TODO -> implementar lógica
                    break;
                case 4:
                    //TODO -> implementar lógica
                    break;
                case 5:
                    //TODO -> implementar lógica
                    break;
                case 0:
                    //TODO -> implementar lógica
                    break;
                default:
                    System.out.println("Opção inválida! Informe novamente.");
                    break;
            }

        }
    }
}

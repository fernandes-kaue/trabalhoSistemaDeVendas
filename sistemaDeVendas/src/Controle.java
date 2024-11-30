import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controle {
    Scanner sc = new Scanner(System.in);
    private List<Venda> vendas = new ArrayList<>();
    private List<Produto> produtos = new ArrayList<>();
    private List<Cliente> clientes = new ArrayList<>();

    public void criarVenda() {
        //TODO -> implementar lógica
    }

    public void mudarStatusVenda(int idVenda) {

        for (Venda venda : vendas) {
            if (!venda.getId().equals(idVenda)) {
                System.err.println("Não existe venda com esse ID.");
                break;
            }
            System.out.println("Qual o novo status da venda " + idVenda + "?");
            System.out.println("(1 = Reserva, 2 = Pago Total, 3 = Enviado)");
            int novoStatus = sc.nextInt();

            switch (novoStatus) {
                case 1:
                    //TODO -> Falta implementar a lógica para encontrar a venda pelo ID na lista
                    break;
                case 2:
                    //TODO -> Falta implementar a lógica para encontrar a venda pelo ID na lista
                    break;
                case 3:
                    //TODO -> Falta implementar a lógica para encontrar a venda pelo ID na lista
                    break;
                default:
                    System.out.println("Opção inválida!");
            }


        }


    }

    public void imprimirVendas() {
        //TODO -> implementar lógica
    }

    public void imprimirVendasCliente(int idCliente) {
        //TODO -> implementar lógica
    }

    public void imprimirCliente() {
        //TODO -> implementar lógica
    }

    public void imprimirProdutos() {
        //TODO -> implementar lógica
    }

    public void sair() {
        System.out.println("Saindo do sistema...");
        System.exit(0);
    }


}

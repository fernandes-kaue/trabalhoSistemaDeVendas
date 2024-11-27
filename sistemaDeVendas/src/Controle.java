import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controle {
    private List<Venda> vendas = new ArrayList<>();
    private List<Produto> produtos = new ArrayList<>();
    private List<Cliente> clientes = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    public void criarVenda() {
        //TODO -> implementar lógica
    }

    public void mudarStatusVenda(int idVenda) {

        for (Venda venda : vendas) {
            if (!venda.getId().equals(idVenda)) {
                System.err.println("Não existe venda com esse ID.");
            }
        }

        System.out.println("Qual o novo status da venda " + idVenda + "?");
        String status = sc.nextLine();

        if (status.equalsIgnoreCase("reserva")) {

        } else if (status.equalsIgnoreCase("pagototal")) {

        } else {

        }

    }

    public void imprimirVendas() {
        //TODO -> implementar lógica
    }

    public void imprimirVendasCliente() {
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

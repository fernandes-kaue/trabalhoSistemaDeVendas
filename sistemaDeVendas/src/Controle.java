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

    public void cadastrarCliente() {
        //TODO -> implementar lógica
    }

    public void cadastrarProduto() {
        //TODO -> implementar lógica
    }

    public String imprimirVendas() {
        StringBuilder sb = new StringBuilder();
        for (Venda venda : vendas) {
            sb.append(venda.toString()).append("\n");
        }
        return sb.toString();
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

    public String imprimirVendasCliente(int id) {
        StringBuilder sb = new StringBuilder();
        for (Venda venda : vendas) {
            if (venda.getCliente().getId().equals(id)) {
                sb.append(venda.toString()).append("\n");
            }
        }
        return sb.toString();
    }

    public String imprimirClientes() {
        StringBuilder sb = new StringBuilder();
        for (Cliente cliente : clientes) {
            sb.append(cliente.toString()).append("\n");
        }
        return sb.toString();
    }

    public String imprimirProdutos() {
        StringBuilder sb = new StringBuilder();
        for (Produto produto : produtos) {
            sb.append(produto.toString()).append("\n");
        }
        return sb.toString();
    }

    public String imprimirVendasCanal(Canal canal) {
        StringBuilder sb = new StringBuilder();
        for (Venda venda : vendas) {
            if (venda.getCanal() == canal) {
                sb.append(venda.toString()).append("\n");
            }
        }
        return sb.toString();
    }

    public String imprimirVendasPeriodo(String dataInicio, String dataFim) {
        //TODO -> implementar lógica
        return null; // remover aviso de erro
    }

    public String imprimirVendaId(int id) {
        //TODO -> ALGUEM TESTA ISSO PELOAMOR DE DEUS
        for (Venda venda : vendas) {
            if (venda.getId() == id) {
                return venda.toString();
            }
        }
        return null;
    }

    public void sair() {
        System.out.println("Saindo do sistema...");
        System.exit(0);
    }


}

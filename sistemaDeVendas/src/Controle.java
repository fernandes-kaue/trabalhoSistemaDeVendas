import java.util.ArrayList;
import java.util.List;

public class Controle {
    private List<Venda> vendas = new ArrayList<>();
    private List<Produto> produtos = new ArrayList<>();
    private List<Cliente> clientes = new ArrayList<>();

    public void criarVenda(Cliente cliente, Produto produto, double valorPago, Status status, Canal canal) {
        Venda venda = new Venda(cliente, produto, valorPago, status, canal);
        vendas.add(venda);
    }

    public void imprimirVendas() {
        for (Venda venda : vendas) {
            System.out.println(venda);
        }
    }

    public void imprimirVendasCliente(String nomeCliente) {
        for (Venda venda : vendas) {
            if (venda.getCliente().getNome().equals(nomeCliente)) {
                System.out.println(venda);
            }
        }
    }

    public void imprimirClientes() {
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }

    public void imprimirProdutos() {
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }

    // Métodos para adicionar clientes e produtos
    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }
}
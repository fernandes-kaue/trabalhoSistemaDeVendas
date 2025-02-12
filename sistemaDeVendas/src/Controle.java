import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class Controle {
    private Scanner sc = new Scanner(System.in);
    private List<Venda> vendas = new ArrayList<>();
    private List<Produto> produtos = new ArrayList<>();
    private List<Cliente> clientes = new ArrayList<>();

    public void criarVenda() {
        System.out.print("Nome do cliente: ");
        String nomeCliente = sc.nextLine();

        System.out.print("Nome do produto: ");
        String nomeProduto = sc.nextLine();

        double valorPago;
        while (true) {
            System.out.print("Valor pago: ");
            try {
                valorPago = Double.parseDouble(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido! Digite um número.");
            }
        }

        Status status = null;
        while (status == null) {
            System.out.print("Status (RESERVA, PAGOTOTAL, ENVIADO): ");
            try {
                status = Status.valueOf(sc.nextLine().toUpperCase());
            } catch (IllegalArgumentException e) {
                System.out.println("Status inválido! Tente novamente.");
            }
        }

        Canal canal = null;
        while (canal == null) {
            System.out.print("Canal (WHATSAPP, INSTAGRAM, FACEBOOK, OLX): ");
            try {
                canal = Canal.valueOf(sc.nextLine().toUpperCase());
            } catch (IllegalArgumentException e) {
                System.out.println("Canal inválido! Tente novamente.");
            }
        }

        // Encontrar ou criar Cliente
        Cliente cliente = clientes.stream()
                .filter(c -> c.getNome().equalsIgnoreCase(nomeCliente))
                .findFirst()
                .orElseGet(() -> {
                    System.out.println("Cliente não cadastrado!");
                    System.out.println("Faça o cadastro do cliente agora!");
                    String nome = nomeCliente;
                    System.out.print("Nome do cliente: "+nome+" \n");
                    System.out.print("Telefone do cliente: ");
                    String telefone = sc.nextLine();
                    System.out.print("Email do cliente: ");
                    String email = sc.nextLine();
                    Cliente novoCliente = new Cliente(nome, telefone, email);
                    clientes.add(novoCliente);
                    return novoCliente;

                });

        // Encontrar ou criar Produto
        Produto produto = produtos.stream()
                .filter(p -> p.getNome().equalsIgnoreCase(nomeProduto))
                .findFirst()
                .orElseGet(() -> {
//                    System.out.print("Digite o preço do novo produto: ");
//                    double precoProduto;
//                    while (true) {
//                        try {
//                            precoProduto = Double.parseDouble(sc.nextLine());
//                            break;
//                        } catch (NumberFormatException e) {
//                            System.out.println("Preço inválido! Digite um número.");
//                        }
//                    }

                    System.out.println("Produto não cadastrado!");
                    System.out.println("Faça o cadastro do produto agora!");
                    String nome = nomeProduto;
                    System.out.print("Nome do produto: "+nome+" \n");
                    System.out.print("Preço do produto: ");
                    double preco = Double.parseDouble(sc.nextLine());
                    System.out.print("Quantidade em estoque: ");
                    int quantidade = Integer.parseInt(sc.nextLine());
                    Produto novoProduto = new Produto(nome, preco, quantidade);
                    produtos.add(novoProduto);
                    return novoProduto;

                });

        if (valorPago < produto.getValor()) {
            status = Status.RESERVA;
        } else if (valorPago >= produto.getValor()) {
            status = Status.PAGOTOTAL;
        }

        // Criar e adicionar venda
        Venda venda = new Venda(cliente, produto, valorPago, status, canal);
        vendas.add(venda);
        System.out.println("Venda criada com sucesso!");
    }

    public void cadastrarCliente() {
        System.out.print("Nome do cliente: ");
        String nome = sc.nextLine();
        System.out.print("Telefone do cliente: ");
        String telefone = sc.nextLine();
        System.out.print("Email do cliente: ");
        String email = sc.nextLine();

        Cliente cliente = new Cliente(nome, telefone, email);
        clientes.add(cliente);
        System.out.println("Cliente cadastrado com sucesso!");
    }

    public void cadastrarProduto() {
        System.out.print("Nome do produto: ");
        String nome = sc.nextLine();
        System.out.print("Preço do produto: ");
        double preco = Double.parseDouble(sc.nextLine());
        System.out.print("Quantidade em estoque: ");
        int quantidade = Integer.parseInt(sc.nextLine());

        Produto produto = new Produto(nome, preco, quantidade);
        produtos.add(produto);
        System.out.println("Produto cadastrado com sucesso!");
    }

    public void imprimirVendas() {
        if (vendas.isEmpty()) {
            System.out.println("Nenhuma venda registrada.");
            return;
        }
        for (Venda venda : vendas) {
            System.out.println(venda);
        }
    }

    public void mudarStatusVenda(int idVenda) {
        Venda venda = vendas.stream()
                .filter(v -> v.getId() == idVenda)
                .findFirst()
                .orElse(null);

        if (venda != null) {
            System.out.print("Novo status (RESERVA, PAGOTOTAL, ENVIADO): ");
            try {
                Status novoStatus = Status.valueOf(sc.nextLine().toUpperCase());
                venda.setStatus(novoStatus);
                System.out.println("Status da venda atualizado com sucesso!");
            } catch (IllegalArgumentException e) {
                System.out.println("Status inválido!");
            }
        } else {
            System.out.println("Venda não encontrada.");
        }
    }

    public void imprimirVendasCliente(String nomeCliente) {
        boolean encontrou = false;
        for (Venda venda : vendas) {
            if (venda.getCliente().getNome().equalsIgnoreCase(nomeCliente)) {
                System.out.println(venda);
                encontrou = true;
            }
        }
        if (!encontrou) {
            System.out.println("Nenhuma venda encontrada para o cliente: " + nomeCliente);
        }
    }

    public void imprimirClientes() {
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente registrado.");
            return;
        }
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }

    public void imprimirProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto registrado.");
            return;
        }
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }

    public void imprimirVendasCanal(String canal) {
        try {
            Canal canalEnum = Canal.valueOf(canal.toUpperCase());
            vendas.stream()
                    .filter(v -> v.getCanal() == canalEnum)
                    .forEach(System.out::println);
        } catch (IllegalArgumentException e) {
            System.out.println("Canal inválido!");
        }
    }

    public void imprimirVendasPeriodo(String dataInicio, String dataFinal) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setLenient(false);

        try {
            Date inicio = dateFormat.parse(dataInicio);
            Date fim = dateFormat.parse(dataFinal);

            boolean encontrou = false;
            for (Venda venda : vendas) {
                Date dataVenda = dateFormat.parse(venda.getDataVenda());
                if (!dataVenda.before(inicio) && !dataVenda.after(fim)) {
                    System.out.println(venda);
                    encontrou = true;
                }
            }

            if (!encontrou) {
                System.out.println("Nenhuma venda encontrada no período selecionado. ");
            }
        } catch (ParseException e) {
            System.out.println("Formato de data inválido. Use o formato dd/MM/yyyy. ");
        }
    }

    public void imprimirVendaId(int id) {
        Venda venda = vendas.stream()
                .filter(v -> v.getId() == id)
                .findFirst()
                .orElse(null);

        if (venda != null) {
            System.out.println(venda);
        } else {
            System.out.println("Venda não encontrada.");
        }
    }

    public void atualizarQuantidadeEstoque(String nomeProduto, int novaQuantidade) {
        Produto produto = produtos.stream()
                .filter(p -> p.getNome().equalsIgnoreCase(nomeProduto))
                .findFirst()
                .orElse(null);

        if (produto != null) {
            produto.setQuantidadeEmEstoque(novaQuantidade);
            System.out.println("Quantidade em estoque atualizada com sucesso!");
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

}

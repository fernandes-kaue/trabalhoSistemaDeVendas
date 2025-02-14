import java.text.SimpleDateFormat;
import java.util.Date;

public class Venda {
    private static int nextId = 1;
    private int id;
    private Cliente cliente;
    private Produto produto;
    private double valorPago;
    private Status status;
    private Canal canal;
    private Date data;

    // Constructor
    public Venda(Cliente cliente, Produto produto, double valorPago, Status status, Canal canal) {
        this.id = nextId++;
        this.cliente = cliente;
        this.produto = produto;
        this.valorPago = valorPago;
        this.status = status;
        this.canal = canal;
        this.data = new Date();
    }

    // getters e setters
    public int getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Canal getCanal() {
        return canal;
    }

    public void setCanal(Canal canal) {
        this.canal = canal;
    }

    public String getDataVenda() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy"); // Format the date as needed
        return dateFormat.format(this.data);
    }

    @Override
    public String toString() {
        return "Venda{" + "id=" + id + ", cliente=" + cliente.getNome() + ", produto=" + produto.getNome() + ", valorPago=" + valorPago + ", status=" + status + ", canal=" + canal + ", data=" + getDataVenda() + '}';
    }
}
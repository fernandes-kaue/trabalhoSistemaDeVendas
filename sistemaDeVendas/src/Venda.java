import java.util.Date;

public class Venda {
    private static int geradorId = 0;
    private int id;
    private Date dataVenda;
    private double valorPago;
    private Status status;
    private Canal canal;
    private Cliente cliente;
    private Produto produto;

    public Venda(Cliente cliente, Produto produto, double valorPago, Status status, Canal canal) {
        this.id = ++geradorId;
        this.dataVenda = new Date();
        this.cliente = cliente;
        this.produto = produto;
        this.valorPago = valorPago;
        this.status = status;
        this.canal = canal;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public Date getDataVenda() {
        return dataVenda;
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

    @Override
    public String toString() {
        return "Venda{" +
                "id=" + id +
                ", dataVenda=" + dataVenda +
                ", valorPago=" + valorPago +
                ", status=" + status +
                ", canal=" + canal +
                ", cliente=" + cliente +
                ", produto=" + produto +
                '}';
    }
}
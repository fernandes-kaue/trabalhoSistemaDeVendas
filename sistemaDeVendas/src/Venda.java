import java.util.Date;

public class Venda {
    private static int geradorId = 1;
    private final Integer id;
    private Cliente cliente;
    private Produto produto;
    private double valorPago;
    private Status status;
    private Canal canal;
    private Date dataVenda;

    // construtores
    public Venda() {
        geradorId += 1;
        id = geradorId;
    }

    // getters and setters

    public Integer getId() {
        return id;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
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

    // toString
    @Override
    public String toString() {
        return String.format("Venda ID: %d%n" + "Data da Venda: %tF %<tT%n" + "Valor: R$ %.2f%n" + "Status: %s%n" + "Canal: %s%n" + "Cliente: %s%n", id, dataVenda, valorPago, status, canal, cliente);
    }


}

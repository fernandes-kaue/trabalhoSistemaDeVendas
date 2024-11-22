
import java.util.Date;

public class Venda {
    private static int geradorId = 1;
    private int id;
    private Date dataVenda;
    private double valor;
    private Status status;
    private Canal canal;
    private Cliente cliente;

    // construtores
    public Venda() {
        geradorId += 1;
        id = geradorId;
    }

    // getters and setters
    public static int getGeradorId() {
        return geradorId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
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
        return "";
    }


}

public class Produto {
    private static int geradorId = 0;
    private int id;
    private String nome;
    private double valor;
    private int quantidadeEmEstoque;

    public Produto(String nome, double valor, int quantidadeEmEstoque) {
        this.id = ++geradorId;
        this.nome = nome;
        this.valor = valor;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    @Override
    public String toString() {
        return "Produto{" + "id=" + id + ", nome='" + nome + '\'' + ", valor=" + valor + ", quantidadeEmEstoque=" + quantidadeEmEstoque + '}';
    }
}
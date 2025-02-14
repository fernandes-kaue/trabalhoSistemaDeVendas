public class Cliente {
    private static int geradorId = 0;
    private int id;
    private String nome;
    private String whatsapp;
    private String instagram;

    public Cliente(String nome, String whatsapp, String instagram) {
        this.id = ++geradorId;
        this.nome = nome;
        this.whatsapp = whatsapp;
        this.instagram = instagram;
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

    public String getWhatsapp() {
        return whatsapp;
    }

    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nome='" + nome + '\'' + ", whatsapp='" + whatsapp + '\'' + ", instagram='" + instagram + '\'' + '}';
    }
}
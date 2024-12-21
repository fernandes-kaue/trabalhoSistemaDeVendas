public class Cliente {
    private int geradorId;
    private Integer id;
    private String nome;
    private String whatsapp;
    private String instagram;

    public int getGeradorId() {
        return geradorId;
    }

    public void setGeradorId(int geradorId) {
        this.geradorId = geradorId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
        if (whatsapp != null && instagram != null) {
            return String.format("Nome do cliente: %s %n Whatsapp do cliente: %s %n Instagram do cliente: %s %n", nome, whatsapp, instagram);
        } else if (whatsapp != null && instagram == null) {
            return String.format("Nome do cliente: %s %n Whatsapp do cliente: %s %n", nome, whatsapp);
        } else return String.format("Nome do cliente: %s %n Instagram do cliente: %s %n", nome, instagram);
    }

}

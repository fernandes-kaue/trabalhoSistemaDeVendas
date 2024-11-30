public class Cliente {
    private int geradorId;
    private Integer id;
    private String nome;
    private String whatsapp;
    private String instagram;

    @Override
    public String toString() {
        if (whatsapp != null && instagram != null) {
            return String.format("Nome do cliente: %s %n Whatsapp do cliente: %s %n Instagram do cliente: %s %n", nome, whatsapp, instagram);
        } else if (whatsapp != null && instagram == null) {
            return String.format("Nome do cliente: %s %n Whatsapp do cliente: %s %n", nome, whatsapp);
        } else return String.format("Nome do cliente: %s %n Instagram do cliente: %s %n", nome, instagram);
    }

}

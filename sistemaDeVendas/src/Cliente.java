public class Cliente {
    private int geradorId;
    private Integer id;
    private String nome;
    private String whatsapp;
    private String instagram;

    @Override
    public String toString() {
        return String.format("Nome do cliente: %s %n Whatsapp do cliente: %s %n Instagram do cliente: %s %n", nome, whatsapp, instagram);
    }



}

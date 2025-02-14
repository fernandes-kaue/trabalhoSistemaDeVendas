public enum Canal {
    WHATSAPP(1), INSTAGRAM(2), FACEBOOK(3), OLX(4);

    private int valor;

    Canal(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return switch (this) {
            case WHATSAPP -> "O canal de venda utilizado foi: Whatsapp.";
            case INSTAGRAM -> "O canal de venda utilizado foi: Instagram.";
            case FACEBOOK -> "O canal de venda utilizado foi: Facebook,";
            case OLX -> "O canal de venda utilizado foi: OLX.";
            default -> "Canal de venda desconhecido.";
        };
    }

}

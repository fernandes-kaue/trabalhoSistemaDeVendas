public enum Canal {
    WHATSAPP(1), INSTAGRAM(2), FACEBOOK(3), OLX(4);

    private int valor;

    Canal(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    @Override
    public String toString() {
        switch (this) {
            case WHATSAPP:
                return "O canal de venda utilizado foi: Whatsapp.";
            case INSTAGRAM:
                return "O canal de venda utilizado foi: Instagram.";
            case FACEBOOK:
                return "O canal de venda utilizado foi: Facebook,";
            case OLX:
                return "O canal de venda utilizado foi: OLX.";
            default:
                return "Canal de venda desconhecido.";
        }
    }

}

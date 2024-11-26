public enum Status {

    RESERVA(1), PAGOTOTAL(2), ENVIADO(3);

    private int valor;

    Status(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    @Override
    public String toString() {
        switch (this) {
            case RESERVA:
                return "O pedido foi reservado.";
            case PAGOTOTAL:
                return "Já foi feito o pagamento total do pedido.";
            case ENVIADO:
                return "O pedido já foi enviado.";
            default:
                return "Sem status notificado.";
        }
    }

}

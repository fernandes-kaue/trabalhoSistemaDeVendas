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
        return switch (this) {
            case RESERVA -> "O pedido foi reservado.";
            case PAGOTOTAL -> "Já foi feito o pagamento total do pedido.";
            case ENVIADO -> "O pedido já foi enviado.";
            default -> "Sem status notificado.";
        };
    }

}

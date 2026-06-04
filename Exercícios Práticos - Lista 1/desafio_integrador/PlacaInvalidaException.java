package desafio_integrador;

public class PlacaInvalidaException extends RuntimeException {
    public PlacaInvalidaException(String mensagem) {
        super(mensagem);
    }
}
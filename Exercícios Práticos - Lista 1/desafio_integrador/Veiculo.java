package desafio_integrador;

public abstract class Veiculo {
    private String placa;
    private double custoFixo;

    public Veiculo(String placa, double custoFixo) {
        if (placa == null || placa.length() != 7) {
            throw new PlacaInvalidaException("Placa invalida.");
        }
        this.placa = placa;
        this.custoFixo = custoFixo;
    }

    public String getPlaca() { return placa; }
    public double getCustoFixo() { return custoFixo; }

    public abstract double calcularCustoTotal();
}
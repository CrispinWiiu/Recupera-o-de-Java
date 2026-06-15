public class VagaCoberta extends Estacionamento {
    private double valorCobertura;

    public VagaCoberta(double valor, double valorCobertura) {
        super(valor);
        this.valorCobertura = valorCobertura;
    }

    public double getValorTotal() {
        return valor + valorCobertura;
    }

    @Override
    public void imprimeValor() {
        System.out.println("Vaga Coberta - Valor base: R$ " + String.format("%.2f", valor) +
                " + Cobertura: R$ " + String.format("%.2f", valorCobertura) +
                " = Total: R$ " + String.format("%.2f", getValorTotal()));
    }
}

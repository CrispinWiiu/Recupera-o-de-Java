public class Estacionamento {
    protected double valor;

    public Estacionamento(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void imprimeValor() {
        System.out.println("Valor: R$ " + String.format("%.2f", valor));
    }
}

public class VagaComum extends Estacionamento {

    public VagaComum(double valor) {
        super(valor);
    }

    @Override
    public void imprimeValor() {
        System.out.println("Vaga Comum - Valor: R$ " + String.format("%.2f", valor));
    }
}

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Estacionamento> vagas = new ArrayList<>();

        vagas.add(new VagaComum(10.00));
        vagas.add(new VagaComum(10.00));
        vagas.add(new VagaCoberta(10.00, 5.00));
        vagas.add(new VagaCoberta(10.00, 5.00));
        vagas.add(new VagaComum(10.00));

        double faturamentoTotal = 0.0;

        System.out.println("=== Vagas Utilizadas ===");
        for (Estacionamento vaga : vagas) {
            vaga.imprimeValor();

            if (vaga instanceof VagaCoberta) {
                faturamentoTotal += ((VagaCoberta) vaga).getValorTotal();
            } else {
                faturamentoTotal += vaga.getValor();
            }
        }

        System.out.println("\nFaturamento total do dia: R$ " + String.format("%.2f", faturamentoTotal));
    }
}

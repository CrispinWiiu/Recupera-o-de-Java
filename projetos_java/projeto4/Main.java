import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Entrega> entregas = new ArrayList<>();

        entregas.add(new EntregaMoto(10));
        entregas.add(new EntregaMoto(5));
        entregas.add(new EntregaCarro(20));
        entregas.add(new EntregaCarro(15));

        double custoTotal = 0.0;

        for (Entrega entrega : entregas) {
            entrega.exibirInformacoes();
            double custo = entrega.calcularCusto();
            System.out.println("Custo: R$ " + String.format("%.2f", custo));

            if (entrega instanceof Rastreavel) {
                ((Rastreavel) entrega).rastrear();
            }

            custoTotal += custo;
            System.out.println("------------------------------");
        }

        System.out.println("Custo total de todas as entregas: R$ " + String.format("%.2f", custoTotal));
    }
}

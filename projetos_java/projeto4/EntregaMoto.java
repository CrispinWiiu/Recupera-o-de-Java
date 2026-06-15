public class EntregaMoto extends Entrega implements Rastreavel {

    public EntregaMoto(double distancia) {
        super(distancia);
    }

    @Override
    public double calcularCusto() {
        return distancia * 1.50;
    }

    @Override
    public void rastrear() {
        System.out.println("Rastreamento via moto: entrega rápida, acompanhe pelo aplicativo do motoboy.");
    }
}

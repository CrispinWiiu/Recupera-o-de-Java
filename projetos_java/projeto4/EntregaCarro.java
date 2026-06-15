public class EntregaCarro extends Entrega implements Rastreavel 
{

    public EntregaCarro(double distancia) 
    {
        super(distancia);
    }

    @Override
    public double calcularCusto() 
    {
        return distancia * 2.50;
    }

    @Override
    public void rastrear() 
    {
        System.out.println("Rastreamento via carro: acompanhe a localização pelo GPS do veículo.");
    }
}

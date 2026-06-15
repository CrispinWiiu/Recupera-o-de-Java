public abstract class Entrega 
{
    protected double distancia;

    public Entrega(double distancia) 
    {
        this.distancia = distancia;
    }

    public double getDistancia() 
    {
        return distancia;
    }

    public abstract double calcularCusto();

    public void exibirInformacoes() 
    {
        System.out.println("Distância: " + distancia + " km");
    }
}

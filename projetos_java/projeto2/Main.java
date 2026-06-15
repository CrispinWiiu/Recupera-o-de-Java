import java.util.ArrayList;

public class Main 
{
    public static void main(String[] args) 
    {
        ArrayList<Veiculo> veiculos = new ArrayList<>();
        ArrayList<Motorista> motoristas = new ArrayList<>();

        veiculos.add(new Veiculo("Toyota", "Corolla", "Preto", 2022));
        veiculos.add(new Veiculo("Honda", "Civic", "Branco", 2021));
        veiculos.add(new Veiculo());

        motoristas.add(new Motorista("João Pereira", "12345678900"));
        motoristas.add(new Motorista("Ana Costa", "98765432100"));
        motoristas.add(new Motorista());

        System.out.println("=== Veículos ===");
        for (Veiculo v : veiculos)
        {
            System.out.println(v);
        }

        System.out.println("\n=== Motoristas ===");
        for (Motorista m : motoristas)
        {
            System.out.println(m);
        }
    }
}

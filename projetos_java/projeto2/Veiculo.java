public class Veiculo {
    private String marca;
    private String modelo;
    private String cor;
    private int anoFabricacao;

    public Veiculo() {
        this.marca = "";
        this.modelo = "";
        this.cor = "";
        this.anoFabricacao = 0;
    }

    public Veiculo(String marca, String modelo, String cor, int anoFabricacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.anoFabricacao = anoFabricacao;
    }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public String getCor() { return cor; }
    public void setCor(String cor) { this.cor = cor; }

    public int getAnoFabricacao() { return anoFabricacao; }
    public void setAnoFabricacao(int anoFabricacao) { this.anoFabricacao = anoFabricacao; }

    @Override
    public String toString() {
        return "Marca: " + marca + " | Modelo: " + modelo + " | Cor: " + cor + " | Ano: " + anoFabricacao;
    }
}

public class Motorista {
    private String nome;
    private String numHabilitacao;

    public Motorista() {
        this.nome = "";
        this.numHabilitacao = "";
    }

    public Motorista(String nome, String numHabilitacao) {
        this.nome = nome;
        this.numHabilitacao = numHabilitacao;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getNumHabilitacao() { return numHabilitacao; }
    public void setNumHabilitacao(String numHabilitacao) { this.numHabilitacao = numHabilitacao; }

    @Override
    public String toString() {
        return "Nome: " + nome + " | Habilitação: " + numHabilitacao;
    }
}

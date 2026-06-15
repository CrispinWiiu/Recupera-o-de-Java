public class Main 
{
    public static void main(String[] args) 
    {
        Projeto p1 = new Projeto();
        p1.setCodigo(1);
        p1.setTitulo("Sistema de Vendas");
        p1.setDiasDuracao(90);
        p1.setDescricao("Desenvolvimento de sistema de vendas online");

        Projeto p2 = new Projeto();
        p2.setCodigo(2);
        p2.setTitulo("App Mobile");
        p2.setDiasDuracao(60);
        p2.setDescricao("Aplicativo mobile para gestão de tarefas");

        Funcionario f1 = new Funcionario();
        f1.setCodigo(101);
        f1.setNome("Carlos Silva");
        f1.setTempoServico(5);
        f1.setCargo("Analista de Sistemas");

        Funcionario f2 = new Funcionario();
        f2.setCodigo(102);
        f2.setNome("Mariana Souza");
        f2.setTempoServico(3);
        f2.setCargo("Desenvolvedora");

        System.out.println("=== Projetos ===");
        System.out.println("Código: " + p1.getCodigo() + " | Título: " + p1.getTitulo() +
                " | Duração: " + p1.getDiasDuracao() + " dias | Descrição: " + p1.getDescricao());
        System.out.println("Código: " + p2.getCodigo() + " | Título: " + p2.getTitulo() +
                " | Duração: " + p2.getDiasDuracao() + " dias | Descrição: " + p2.getDescricao());

        System.out.println("\n=== Funcionários ===");
        System.out.println("Código: " + f1.getCodigo() + " | Nome: " + f1.getNome() +
                " | Tempo de Serviço: " + f1.getTempoServico() + " anos | Cargo: " + f1.getCargo());
        System.out.println("Código: " + f2.getCodigo() + " | Nome: " + f2.getNome() +
                " | Tempo de Serviço: " + f2.getTempoServico() + " anos | Cargo: " + f2.getCargo());
    }
}

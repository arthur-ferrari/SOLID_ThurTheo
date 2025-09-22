// Uma classe faz mais de uma coisa → quebra o SRP
class Relatorio {
    public void gerarRelatorio() {
        System.out.println("Gerando relatório...");
    }

    public void salvarRelatorio() {
        System.out.println("Salvando relatório...");
    }
}

public class S_NA {
    public static void main(String[] args) {
        Relatorio relatorio = new Relatorio();
        relatorio.gerarRelatorio();
        relatorio.salvarRelatorio();
    }
}

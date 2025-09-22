// Cada classe tem uma única responsabilidade
class Relatorio {
    public void gerarRelatorio() {
        System.out.println("Gerando relatório...");
    }
}

class RelatorioSalvador {
    public void salvarRelatorio(Relatorio relatorio) {
        System.out.println("Salvando relatório...");
    }
}

public class S_A {
    public static void main(String[] args) {
        Relatorio relatorio = new Relatorio();
        relatorio.gerarRelatorio();

        RelatorioSalvador salvador = new RelatorioSalvador();
        salvador.salvarRelatorio(relatorio);
    }
}


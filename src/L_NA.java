// Subclasse não respeita comportamento esperado
class Ave {
    public void voar() {
        System.out.println("A ave está voando!");
    }
}

class Pinguim extends Ave {
    @Override
    public void voar() {
        throw new UnsupportedOperationException("Pinguim não voa!");
    }
}

public class L_NA {
    public static void main(String[] args) {
        Ave ave = new Pinguim(); // quebra o LSP
        ave.voar(); // erro em tempo de execução
    }
}

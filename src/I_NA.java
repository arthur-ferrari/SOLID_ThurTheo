// Interface gorda obriga classes a implementar métodos que não fazem sentido
interface Ave {
    void voar();
    void nadar();
}

class Pardal implements Ave {
    public void voar() { System.out.println("Pardal voando!"); }
    public void nadar() { /* Não faz sentido para pardal */ }
}

public class I_NA {
    public static void main(String[] args) {
        new Pardal().voar();
    }
}

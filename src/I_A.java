// Interfaces específicas
interface AveQueVoa {
    void voar();
}

interface AveQueNada {
    void nadar();
}

class Pardal implements AveQueVoa {
    public void voar() {
        System.out.println("Pardal voando!");
    }
}

class Pato implements AveQueVoa, AveQueNada {
    public void voar() { System.out.println("Pato voando!"); }
    public void nadar() { System.out.println("Pato nadando!"); }
}

public class I_A {
    public static void main(String[] args) {
        new Pardal().voar();
        new Pato().nadar();
    }
}

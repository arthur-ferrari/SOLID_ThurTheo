 // Subclasses podem substituir a classe base sem problemas
class Ave {
    public void voar() {
        System.out.println("A ave está voando!");
    }
}

class Pardal extends Ave { }

public class L_A {
    public static void main(String[] args) {
        Ave ave = new Pardal(); // substituição funciona
        ave.voar();
    }
}
// Aberto para extensão, fechado para modificação
abstract class Forma {
    public abstract double calcularArea();
}

class Circulo extends Forma {
    double raio;
    public Circulo(double raio) { this.raio = raio; }
    public double calcularArea() { return Math.PI * raio * raio; }
}

class Quadrado extends Forma {
    double lado;
    public Quadrado(double lado) { this.lado = lado; }
    public double calcularArea() { return lado * lado; }
}

public class O_A {
    public static void main(String[] args) {
        Forma f1 = new Circulo(5);
        Forma f2 = new Quadrado(4);
        System.out.println("Área círculo: " + f1.calcularArea());
        System.out.println("Área quadrado: " + f2.calcularArea());
    }
}

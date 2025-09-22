// Para adicionar uma nova forma, é preciso mexer na mesma classe
class CalculadoraArea {
    public double calcular(String tipo, double medida) {
        if (tipo.equals("circulo")) {
            return Math.PI * medida * medida;
        } else if (tipo.equals("quadrado")) {
            return medida * medida;
        }
        return 0;
    }
}

public class O_NA {
    public static void main(String[] args) {
        CalculadoraArea calc = new CalculadoraArea();
        System.out.println("Área círculo: " + calc.calcular("circulo", 5));
        System.out.println("Área quadrado: " + calc.calcular("quadrado", 4));
    }
}

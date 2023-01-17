import java.util.List;

public class CalculadorDeArea {
    public void calcularArea(List<Forma> formas) {
        for (Forma forma : formas) {
            System.out.println(forma.getArea());
        }
    }

    public void getCircuferencia(List<Forma> formas) {
        for (Forma forma : formas) {
            if (forma instanceof Circulo circulo) {
                System.out.println("A circunferencia é " + Math.PI * 2 * circulo.getR());
            }
        }
    }

    public void getPerimetro(List<Forma> formas) {
        for (Forma forma : formas) {
            if (forma instanceof Retangulo retangulo) {
                System.out.println("O perimetro é " + 2 * retangulo.getB() + 2 * retangulo.getH());
            }
        }
    }

    public void getLado(List<Forma> formas) {
        for (Forma forma : formas) {
            if (forma instanceof Triangulo triangulo) {
                System.out.println("Considerando um triangulo retangulo, os lados são altura, a base e a hipotenusa, " +
                        "sendo que a altura é " + triangulo.getH() +
            " a base é " + triangulo.getB() +
                        " e a hipotenusa é " + Math.sqrt(Math.pow(triangulo.getB(), 2)+Math.pow(triangulo.getH(), 2)));
            }
        }
    }
}


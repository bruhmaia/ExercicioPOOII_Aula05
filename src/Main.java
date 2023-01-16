import java.util.List;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(2);
        Retangulo retangulo = new Retangulo(4, 6);
        Triangulo triangulo = new Triangulo(3, 2);

        List<Forma> listaDeFormas = List.of(circulo, retangulo, triangulo);

        System.out.println("A area do retangulo é " + retangulo.getArea());
        System.out.println("A area do triangulo é " + triangulo.getArea());
        System.out.println("A area do circulo é " + circulo.getArea());


        CalculadorDeArea calculadorDeArea = new CalculadorDeArea();
        System.out.println("a área do circulo, do retangulo e do triangulo são respectivamente");
        calculadorDeArea.calcularArea(listaDeFormas);

        calculadorDeArea.getPerimetro(listaDeFormas);
        calculadorDeArea.getCircuferencia(listaDeFormas);
        calculadorDeArea.getLado(listaDeFormas);

    }
}

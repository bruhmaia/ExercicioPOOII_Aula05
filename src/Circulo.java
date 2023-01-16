public class Circulo implements Forma {
    double r;


    public Circulo(double r) {
        this.r = r;
    }


    public double getR() {
        return r;
    }


    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return Math.PI * r * r;
    }
}


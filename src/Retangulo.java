public class Retangulo implements Forma {

    double b;
    double h;

    public Retangulo(double b, double h){
        this.b=b;
        this.h=h;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public double getArea() {
       return b*h;
    }
}

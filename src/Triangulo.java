public class Triangulo implements Forma{

    double b;
    double h;

    public Triangulo(double b, double h){
        this.b=b;
        this.h=h;
    }

    public double getB() {
        return b;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double getArea(){
        return 0.5*b*h;
    }
}

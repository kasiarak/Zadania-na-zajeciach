package GUI.zadanie_04_01;

public class Parabola implements FunDD{
    double a;
    double b;
    double c;

    public Parabola(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public double fun(double x) {
        return a*Math.pow(x,2)+b*x+c;
    }
}

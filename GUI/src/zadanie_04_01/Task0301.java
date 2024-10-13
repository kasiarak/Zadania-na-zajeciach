package GUI.zadanie_04_01;

import static java.lang.Math.sqrt;

public class Task0301 {
    public static void main(String[] args) {
        Parabola parabola = new Parabola(1,-1,-5.0/4);
        System.out.println(FunDD.xminim(parabola, 0, 1));
        FunDD funDD = new FunDD(){
            @Override
            public double fun(double x) {
                return Math.sqrt(Math.pow((x-0.75),2)+1);
            }
        };
        System.out.println(FunDD.xminim(funDD, 0, 2));
        FunDD lambda = (x) -> Math.pow(x,2)*(x - 2);
        System.out.println(FunDD.xminim(lambda,0,2));
    }
}

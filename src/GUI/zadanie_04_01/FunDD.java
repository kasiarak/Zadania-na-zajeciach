package GUI.zadanie_04_01;

@FunctionalInterface
interface FunDD {
    double fun(double x);
    static double xminim(FunDD f, double a, double b) {
        double minY = f.fun(a);
        double minX = a;
        for(double x = a; x <= b; x+=1e-5){
            double y = f.fun(x);
            if(y<minY) {
                minY = y;
                minX = x;
            }
        }
        return minX;
    }
}

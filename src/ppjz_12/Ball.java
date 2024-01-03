package ppjz_12;

public class Ball {
    double radius;
    static int ballcounter = 0;
    public Ball(double radius){
        this.radius = radius;
    }
    public static Ball makeBall(){
        Ball ball = new Ball(10+Math.random()*10);
        ballcounter++;
        return ball;
    }
    public static int showCounter(){
         return ballcounter;
    }

    public static void main(String[] args) {
        makeBall();
        makeBall();
        makeBall();
        makeBall();
        System.out.println(showCounter());

    }
}

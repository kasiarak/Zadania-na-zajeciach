package ppjz_11;

class MathOperations{
        static final double pi = 3.14;
        static double calculateCricleArea(double r){
            return Math.pow(r,2)*pi;
        }

        public static void main(String[] args) {
            double circleArea = calculateCricleArea(2);
            System.out.println(circleArea);
        }
}

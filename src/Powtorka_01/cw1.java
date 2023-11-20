package Powtorka_01;

public class cw1 {
    public static void main(String[] args) {
        int deg = (int)(Math.random() * 360);
        System.out.println(deg + " stopni");
        if(deg>=0 && deg<30 || deg>330 && deg<=360) System.out.println("Północ");
        if(deg>=30 && deg<60) System.out.println("Północny wschód");
        if(deg>=60 && deg<120) System.out.println("Wschód");
        if(deg>=120 && deg<150) System.out.println("Południowy wschód");
        if(deg>=150 && deg<210) System.out.println("Południe");
        if(deg>=210 && deg<240) System.out.println("Południowy zachód");
        if(deg>=240 && deg<300) System.out.println("Zachód");
        if(deg>=300 && deg<330) System.out.println("Północny zachód");

    }
}

package ppjz_11.Kula;

import ppjz_11.Kwadrat2;

public class KulaW {
    double promień;

    public KulaW(Walec walec){
        if(walec.getWysokość()> 2*walec.getPromień()) this.promień = walec.getPromień();
        if(walec.getWysokość()<= 2*walec.getPromień()) this.promień = walec.getWysokość()/2;
    }
    public KulaW(Kwadrat kwadrat){
        this.promień = ((double)kwadrat.getBok()/2);
    }

    public static void main(String[] args) {
        Kwadrat kwadrat = new Kwadrat(2);
        Walec walec = new Walec(2,2);
        KulaW kulaW1 = new KulaW(walec);
        KulaW kulaW2 = new KulaW(kwadrat);
        System.out.println(kulaW1.promień);
        System.out.println(kulaW2.promień);

    }
}

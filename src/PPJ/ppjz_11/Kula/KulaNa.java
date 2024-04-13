package PPJ.ppjz_11.Kula;

public class KulaNa {
    double promień;
    public KulaNa(Walec walec){
        this.promień = Math.sqrt(Math.pow(walec.getPromień(),2)+Math.pow(walec.getWysokość()/2, 2));
    }
    public KulaNa(Kwadrat kwadrat) {
        this.promień = ((double) kwadrat.getBok() * Math.sqrt(2))/2;
    }
    public static void main(String[] args) {
        Kwadrat kwadrat = new Kwadrat(2);
        Walec walec = new Walec(2,2);
        KulaNa kulaNa1 = new KulaNa(walec);
        KulaNa kulaNa2 = new KulaNa(kwadrat);
        System.out.println(kulaNa1.promień);
        System.out.println(kulaNa2.promień);
    }
}

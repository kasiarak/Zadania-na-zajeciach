package ppjz_14;

public class Rakieta {
    String nazwa;
    int wagaPaliwa;
    Rakieta(String nazwa, int wagaPaliwa){
        this.nazwa = nazwa;
        this.wagaPaliwa = wagaPaliwa;
    }
    void zatankuj(){
        wagaPaliwa = wagaPaliwa+(int)(Math.random()*5000);
    }
    void start() throws Exception{
        if(wagaPaliwa<1000) throw new Exception();
    }

    public static void main(String[] args) {
        try{
            Rakieta rakieta = new Rakieta("nazwa", 500);
            rakieta.zatankuj();
            rakieta.start();
        }catch (Exception e){
            System.out.println("start anulowany - za mało paliwa");
        }
    }
}

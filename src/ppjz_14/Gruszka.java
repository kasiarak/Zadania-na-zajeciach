package ppjz_14;

public class Gruszka extends Owoc{
    Gruszka(){
        this.nazwa = String.valueOf(Gruszka.class);
        this.masa = 100+Math.random()*151;
    }
}

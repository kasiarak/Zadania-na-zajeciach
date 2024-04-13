package PPJ.ppjz_14;

public class DetektorDymu {
    static boolean jestDym;
    static void sprawdz() throws Alarm{
        if(jestDym==true) throw new Alarm();
    }

    public static void main(String[] args) {
        try {
           sprawdz();
        }catch (Alarm a){

        }
    }
}

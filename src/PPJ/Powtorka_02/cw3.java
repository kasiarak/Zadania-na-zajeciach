package PPJ.Powtorka_02;

public class cw3 {
    public static void main(String[] args) {
        int tablica1[] = {23, 13, 3, 5, 6, 0};
        int tablica2[] = {2, 87, 11, 4};
        merge(tablica1,tablica2);
    }
    static void merge(int tablica1[], int tablica2[]){
        int nowaTablica[] = new int[tablica1.length+tablica2.length];
        int indeks = 0;
        if(tablica1.length>tablica2.length){
            for(int i = 0; i < nowaTablica.length; i++){
                if(indeks>=tablica2.length){
                    nowaTablica[i] = tablica1[indeks];
                    indeks++;
                }else if(i%2==0){
                    nowaTablica[i] = tablica1[indeks];
                }else{
                    nowaTablica[i] = tablica2[indeks];
                    indeks++;
                }
            }
        }else{
            for(int i = 0; i < nowaTablica.length; i++){
                if(indeks>=tablica1.length){
                    nowaTablica[i] = tablica2[indeks];
                    indeks++;
                }else if(i%2==0){
                    nowaTablica[i] = tablica1[indeks];
                }else{
                    nowaTablica[i] = tablica2[indeks];
                    indeks++;
                }
            }
        }
        for(int i = 0; i < nowaTablica.length; i++){
            System.out.print(nowaTablica[i] + " ");
        }
    }
}

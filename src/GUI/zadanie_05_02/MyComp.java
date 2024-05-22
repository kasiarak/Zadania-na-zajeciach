package GUI.zadanie_05_02;

import java.util.Comparator;

class MyComp implements Comparator<Integer> {
    int byVal;
    public static final int
            BY_VAL=0, BY_VAL_REV=1,
            BY_NUM_OF_DIVS=2, BY_SUM_OF_DIGS=3;

    public MyComp(int byVal) {
        this.byVal = byVal;
    }
    @Override
    public int compare(Integer o1, Integer o2) {
       switch (byVal){
           case BY_VAL -> {
               return o1 - o2;
           }
           case BY_VAL_REV -> {
               return o2 - o1;
           }
           case BY_NUM_OF_DIVS -> {
               int x = 0;
               for(int i=2; i<=o1; i++){
                   if(o1%i==0) x++;
               }
               int y = 0;
               for(int i=2; i<=o2; i++){
                   if(o2%i==0) y++;
               }
               if(x==y){
                   return o1 - o2;
               }else return x - y;
           }
           default -> {
               int x = 0;
               while(o1!=0){
                   x += o1%10;
                   o1= o1/10;
               }
               int y = 0;
               while(o2!=0){
                   y += o2%10;
                   o2 = o2/10;
               }
               if(x==y){
                   return o1 - o2;
               }else return x - y;
           }
       }
    }
}
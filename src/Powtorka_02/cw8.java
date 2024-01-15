package Powtorka_02;

public class cw8 {
    public static void main(String[] args) {
        int[] arr = {7, 1, 0, 2};
        bubbleSortRe(arr, arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    static void bubbleSortRe(int[] arr, int n) {
        if(n==1){
            return;
        }
        for (int i = 0; i < n-1; i++){
            if(arr[i]>arr[i+1]){
                int x = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = x;
            }
        }
        bubbleSortRe(arr,n-1);
    }
}

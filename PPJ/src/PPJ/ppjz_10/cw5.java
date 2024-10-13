package PPJ.ppjz_10;

public class cw5 {
    public static void main(String[] args) {
        int[] arr = {9,1,2,5,8,7};
        int maxElem = maxElem(arr, 2);
        System.out.println(maxElem);
    }
    public static int maxElem(int[] arr, int from){
       if(from == arr.length-1){
           return arr[from];
       }else {
           int max = maxElem(arr, from+1);
           if(arr[from]>max) return arr[from];
           else return max;
       }

    }
}


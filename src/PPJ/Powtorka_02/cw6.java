package PPJ.Powtorka_02;

public class cw6 {
    public static void main(String[] args) {
        int[] arr = {0,7,12,17,22,29,41,44,50};
        System.out.println(binSearch(arr, 2,6,22));
    }
    static int binSearch(int arr[], int begin, int end, int value){
        if(end>=begin){
            int middle = begin+(end-begin)/2;
            if(arr[middle] == value){
                return middle;
            }
            else if(arr[middle]>value){
                return binSearch(arr,begin,middle-1,value);
            }
            return binSearch(arr,middle+1,end,value);
        }
        else return -1;
    }
}

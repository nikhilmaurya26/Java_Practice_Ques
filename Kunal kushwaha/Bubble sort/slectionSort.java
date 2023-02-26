import java.util.*;

public class slectionSort {
    
    public static void main(String[] args) {
        int arr[]= {1,3,5,6,2};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int arr[]){
        for(int i =0; i <arr.length ; i++){
            int last = arr.length - 1 - i ;
            int maxindex = Maxelement(arr, 0, last);
            swap(arr, last, maxindex);
        }
    }


    static void swap(int arr[], int first , int second ){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }


    static int Maxelement(int arr[], int start , int end){
        int max = start;
        for(int i =start ; i<=end;i++ ){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
}

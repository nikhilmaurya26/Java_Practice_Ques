import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int arr[]= {1,3,5,6,2};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=1;j<n-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }
}

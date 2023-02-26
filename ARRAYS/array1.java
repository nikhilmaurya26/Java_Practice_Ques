package ARRAYS;
import java.util.*;

public class array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int size = sc.nextInt();
        
        int[] arr = new int[size];

        for(int i = 0 ; i<size ; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0 ; i < size ; i++){
            if(arr[i]==size){
                System.out.println(size);
                break;
                
            }
            else{
                System.out.println("Not found");
                break;
            }
        }

        
    }
}

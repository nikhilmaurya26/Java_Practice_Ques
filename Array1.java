import java.util.*;

public class Array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];
        
        for(int i = 0; i < num.length ; i++){
            num[i]=sc.nextInt();
        }
        int sum = 0 ;
        for (int i=0; i<num.length;i++){
            System.out.println(num[i]);
            
            sum = num[i] + sum;
            
            
        }
        System.out.print("The sum is ");
        System.out.println(sum);
        int avg = sum/num.length;
        System.out.print("Average is = " + avg);
        // System.out.println("Avg is ",avg);

    }
}

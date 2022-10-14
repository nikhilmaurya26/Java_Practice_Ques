//Q- public Calculate Average Of N Numbersclass third 
import java.util.*;

public class third{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your numbers");
        int a= sc.nextInt();
        int sum = 0 ;
        for(int i =1 ; i<=a; i++){
            System.out.println("Enter the number ");
            int num = sc.nextInt();

            sum=sum+num;
        }
        System.out.print("Average is = ");
        double avg = sum/a;
        System.out.println(avg);
    }
}
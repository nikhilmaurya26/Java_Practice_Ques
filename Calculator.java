import java.util.Scanner;

public class Calculator {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int ans = 0;
     while(true){
         System.out.print("Enter the Operator");
         char op = sc.next().trim().charAt(0);
         System.out.println("");
         if(op=='+' || op =='-' || op=='/'|| op=='%' || op=='*'){
            System.out.print("Enter Two Number");
            int num1 = sc.nextInt();
            int num2= sc.nextInt();
            if(op=='+'){
                ans=num1+num2;
            }
            if(op=='-'){
                ans=num1-num2;
            }
            if(op=='*'){
                ans=num1*num2;
            }
            if(op=='%'){
                ans=num1%num2;
            }
            if(op=='/'){
                if(num2>0){
                    ans = num1/num2;
                }else{
                    System.out.println("Invalid");
                }
            }
         }
        else if(op=='x'||op=='x'){
            break;
        }
        else{
            System.out.println("Invalid");
        }
        System.out.println(ans);
     }
 }   
}

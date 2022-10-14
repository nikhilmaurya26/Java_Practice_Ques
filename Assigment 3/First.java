// Q1 - Factorial Program In Java
import java.util.Scanner;

public class First {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                int a=sc.nextInt();
                int mul = 1;
                for(int i=1;i<=a;i++){
                        mul=i*mul;

                        }
                System.out.println(mul);
        }
        
}

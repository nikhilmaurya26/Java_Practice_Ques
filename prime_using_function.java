import java.util.Scanner;


public class prime_using_function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no ");
        int a = sc.nextInt();
        System.out.println(isprime(a));
    }

    static boolean isprime(int a) {
        if (a<=1){
            return false;
        }
        int c=2;
    
        while(c*c<=a){
            if(a%c==0){
                return false;
            }
            c++;
        }
        return c*c>a;
        
        
     }
}


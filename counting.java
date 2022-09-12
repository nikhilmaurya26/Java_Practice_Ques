import java.util.Scanner;

public class counting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0 ;
        while(n>0){
            int a = n%10;
            if(a==3){
                count++;
            }
         n=n/10;
        
        }
        System.out.println(count);
    }
}

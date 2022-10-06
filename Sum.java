import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        sum();
    }

    static void sum(){
    Scanner sc = new Scanner(System.in);
    int no1, sum , num2 ;

    System.out.println("Enter no 1");
    no1 = sc.nextInt();
    System.out.println("Enter no 1");
    num2 = sc.nextInt();
    sum = no1 + num2;

    System.out.println(sum);
    sc.close();
    }
}

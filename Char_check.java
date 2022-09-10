import java.util.Scanner;

public class Char_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char i = sc.next().trim().charAt(0);
        if(i>='a' && i<='z'){
            System.out.println("Lowercase");
        }
        else{
            System.out.println("Uppercase");
        }
    }
    
}

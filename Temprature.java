import java.util.Scanner;
public class Temprature{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Float TempC = sc.nextFloat();
        Float TempF = (TempC*9/5) +32;
        System.out.println(TempF);
    }
}
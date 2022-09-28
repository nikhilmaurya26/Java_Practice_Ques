import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  fruit = sc.next();
        switch (fruit) {
            case "mango" ->  System.out.println("King of fruits");
            case "orange" ->  System.out.println("King of fruitsssssss");
            default -> System.out.println("not valid");

            // case "Mango":
            //     System.out.println("King of fruits");
            //     break;
            // case "Apple":
            //     System.out.println("Keep the doctor away");
            //     break;
            // case "Grapes":
            //     System.out.println("They were sour");
            //     break;
            // case "kivi":
            //     System.out.println("goof for blood");
            //     break;
            // default:
            //     System.out.println("enter a valid fruit ");
            //     break;
        }
    }
}

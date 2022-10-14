//Q -2 Calculate Electricity Bill

import java.util.*;

public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter previous unit ");
        double unit1 = sc.nextDouble();
        System.out.print("Enter current unit ");
        double unit2 = sc.nextDouble();
        double price = 7.5;
        double bill = (unit2-unit1) *price;
        System.out.println(bill);

    }

}

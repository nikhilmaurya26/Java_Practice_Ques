import java.util.*;


public class Sum_of_no {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    // int b = scn.nextInt();
    scn.close();
    int d = toDecimal(n);
    System.out.println(d);
  }

  public static int toDecimal(int n) {
    int  ans_num = 0;
    while (n > 0) {
      int remainder = n % 10;
     
      ans_num += remainder;
      n = n / 10;
    //   multiplier++;
    }
    return ans_num;
  }
}

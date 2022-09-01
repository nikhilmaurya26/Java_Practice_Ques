import java.util.*;
  
  public class Prime_loop{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
  
      int num = scn.nextInt();
      for(int i =0;i<num;i++ ){
          int input = scn.nextInt();
          int count = 0;
          for(int j=1;j<=input;j++){
              if(input%j==0){
                  count++;
              }
          }
        if(count==1){
            System.out.println("prime");
        }
        else if (count==2){
            System.out.println("prime");
        }
        else{
            System.out.println("Not prime");
        }
      }
  
   }
  }
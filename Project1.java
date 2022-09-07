import java.util.*;

public class Project1 {
    public static void main(String args[]){
        int mynumber = (int)(Math.random()*100);
        Scanner sc = new Scanner(System.in);
        // int userno;
        
        do{
            int userno = sc.nextInt();
            if(userno==mynumber){
                System.out.println("Yeah you have guessed correct");
                break;                
            }
            else if(userno>=mynumber){
                System.out.println("Your number is greater than the guesses number");
            }
            else{
                System.out.println("Number is shorter than the guessed number");
            }
        }while(mynumber>=0);
    }    
}

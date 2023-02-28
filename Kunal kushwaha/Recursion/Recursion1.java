package Recursion;
public class Recursion1 {
    public static void main(String[] args) {
        loop(1);
    }
    static void loop(int n){
        if(n==5){
            System.out.println(n);
            return;
            
        }
        System.out.println(n);
        loop(n+1);
    }
}

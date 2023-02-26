package pattern;

public class pattern1 {
    public static void main(String[] args) {
             pattern5(4);
    }

    static void pattern2(int n){
        for(int row = 1;row<=n;row++){
            for(int col=1;col<=n ; col++ ){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern(int n){
        for(int row = 1;row<=n;row++){
            for(int col=1;col<=row ; col++ ){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
        for(int row = 1;row<=n;row++){
            for(int col=n;col>=row ; col-- ){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
        for(int row = 1;row<=n;row++){
            for(int col=1;col<=row ; col++ ){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n){

        for(int row = 1;row<2*n;row++){
            int colnum = row>n ? 2*n-row: row;
            for(int col=1;col<=colnum ; col++ ){
                System.out.print("* ");
        }

        System.out.println();
     }
  }


}



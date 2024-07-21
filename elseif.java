import java.util.*;

class ifelse2{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int m = sc.nextInt();
       if(n==m) {
        System.out.println("Equal");
       }
       else if(n>m) {
        System.out.println("n is greater than m");
       }
       else if(n<m){
        System.out.println("m is greater than n");
       } else {
        System.out.println( "invalid");
       }

        
    }
}

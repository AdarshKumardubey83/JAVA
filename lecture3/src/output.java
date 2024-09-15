import java.util.*;
public class output {
    static void count(int n){
        int count=0;
        int f,b;
        f=n;
        while(f>0){
            b=f%10;
            if( b>0 && n%b==0){
                count=count+1;
            }
            f=f/10;
            ///10; System.out.println(count);
        }
        System.out.println(count);
    }
   public static void main(String[]args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       count(n);
   }
}
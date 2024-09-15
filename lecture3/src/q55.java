import java.util.*;
public class q55 {
        static void pattern(int n){
            for(int i=1;i<=n;i++){
                for(int j =1;j<=i-1;j++){
                    System.out.print(" ");}
                for(int j=1;j<=2*n-2*i+1;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            pattern(n);
        }
    }

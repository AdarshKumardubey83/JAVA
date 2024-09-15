import java.util.Scanner;
public class sumofdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int b;
        while(n>0){
            b=n%10;
            sum=sum+b;
            n=n/10;
        }
        System.out.println(sum);
    }
}



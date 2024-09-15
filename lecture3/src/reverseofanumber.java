import java.util.Scanner;
public class reverseofanumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = 0;
        int rev;
        while(n>0){
            rev=n%10;
            b=b*10+rev;
            n=n/10;
        }
        System.out.println(b);
    }
}

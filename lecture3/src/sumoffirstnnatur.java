import java.util.*;
public class sumoffirstnnatur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 1;
        int sum = 0;
        while(num<=n){
            sum = sum+n;
            n--;
        }
        System.out.println(sum);
    }
}

import java.util.*;
public class countdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c=0;
        while(n>0){
            c+=1;
            n=n/10;
        }
        System.out.println(c);
    }
}

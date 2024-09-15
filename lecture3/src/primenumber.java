import java.util.*;
public class primenumber {
    static void findanswer(int n) {
        int c=0;
        if (n == 2) System.out.println("Prime number");
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                c = c + 1;
                break;
            }
        }
        if (c==0){
                System.out.println("Prime number");
            }
        else{
            System.out.println("Not prime");
        }
        //if (c==1)
        //System.out.println("prime");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        findanswer(n);
    }
}

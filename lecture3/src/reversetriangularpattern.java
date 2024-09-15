import java.util.*;
public class reversetriangularpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        for (int i = 1; i <= r; i++) {
            for (int j = r; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
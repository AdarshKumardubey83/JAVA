import java.util.Scanner;
public class reversespacestarspace{
    static void reversespacestarspace(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <  i ; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k<(2*n)-(2*i+1);k++){
                System.out.print("*");
            }
            for (int k = 0; k <  i ; k++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines :");
        int n = sc.nextInt();
        reversespacestarspace(n);
    }
}


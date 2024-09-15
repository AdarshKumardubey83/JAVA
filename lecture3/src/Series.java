import java.util.Scanner;
public class Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ser=0;
        for(int i=1;i<=n;i++){
            if(i%2==0)
                ser=ser-i;
            else
                ser=ser+i;
        }
        System.out.println(ser);
    }
}

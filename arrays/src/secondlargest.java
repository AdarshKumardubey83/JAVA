/*import java.util.Scanner;

public class secondlargest {
    static int secondlargest(int[]arr) {
        int n = arr.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] >= arr[j]) {
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] >= arr[j]) {
                    ans=arr[i];
                }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter"+n+"elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(secondlargest(arr));
    }
}*/



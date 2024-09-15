import java.util.*;
public class leftrotatearraybyDplaces {
    static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void rotate(int[] arr,int n,int d) {
        int rem = d % n;
        for (int i = 1; i <= rem; i++) {
            int temp = arr[0];
            for (int k = 0; k < n - 1; k++) {
                    arr[k] = arr[k + 1];
                }
            arr[n - 1] = temp;
            printarray(arr);
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the number of places");
        int d = sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        rotate(arr,n,d);
    }
}


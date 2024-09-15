import java.util.*;
public class leftrotatearraybyoneplace {
    static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void rotate(int[] arr,int n) {
        int j =arr[0];
        for(int i=0;i<n-1;i++) {
            arr[i] = arr[i+1];
        }
        arr[n-1]=j;
        printarray(arr);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        rotate(arr,n);
    }
}



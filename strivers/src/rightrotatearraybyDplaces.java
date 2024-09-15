import java.util.*;
public class rightrotatearraybyDplaces {
    static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void rotate(int[]arr,int n,int d){
        int arr1[]=new int[n];
        for(int i=0;i<n;i++) {
            arr1[i] = arr[i];
        }
        d=d%n;
        if (d==0) return;
        int temp[]=new int[d];
        for(int i=0;i<d;i++){
            temp[i]=arr[i+(n-d)];
        }
        for(int i=d;i<n;i++){
            arr[i]=arr1[i-d];
        }
        for(int i=0;i<d;i++){
            arr[i]=temp[i];
        }
        printarray(arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number of places");
        int d=sc.nextInt();
        rotate(arr,n,d);
    }
}

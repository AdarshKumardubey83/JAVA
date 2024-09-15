import java.util.*;
public class missingnumber {
    static void ans(int[]arr,int n){
       // int answer =0;
        int j=1;
        for(int i=0;i<n-1;i++){
            if(arr[i]!=j){
                System.out.println(j);
                break;
                }
            else{
                j++;
            }
            }
           // System.out.print(answer);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n-1];
        System.out.println("Enter array elements");
        for(int i=0;i<n-1;i++){
            arr[i]=sc.nextInt();
        }
        ans(arr,n);
    }gh
}

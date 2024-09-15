import java.util.*;
public class test{
        static void printarray(int[]arr){
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]);
            }
        }
        static void justunion(int[]arr,int[]arr1,int[]union,int n,int m,int o){
            int count=0;
            for(int i=0;i<n;i++){
                union[count++]=arr[i];
            }
            for(int i=0;i<m;i++){
                //int j=arr.length;
                union[count++]=arr1[i];
                }
            printarray(union);
        }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int []arr=new int[n];
        int []arr1=new int[m];
        int o = n+m;
        int[]union=new int[o];
        System.out.println("Enter array elements");
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++){
            arr1[i]=sc.nextInt();
        }
        justunion(arr,arr1,union,n,m,o);
    }
}
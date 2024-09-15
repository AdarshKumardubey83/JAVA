import java.util.*;
public class firstrepeatedvalue {
    static int firstrepeatedvalue(int[]arr){
        int ans=-1;
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;i++){
                if(arr[i]==arr[j]){
                    ans=arr[i];
                    break;
                }
            }
        }
        return ans;
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
    System.out.println(firstrepeatedvalue(arr));
}
}
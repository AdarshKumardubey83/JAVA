import java.util.*;
public class unionoftwosortedarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[]=new int [n];
        int arr1[]= new int[m];
        System.out.println("Enter array elements");
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                System.out.println();
                arr1[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++){
                set.add(arr[i]);
            }
            for(int i=0;i<m;i++){
                set.add(arr[i]);
            }
            System.out.println(set);
        }
    }



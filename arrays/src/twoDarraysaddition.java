import java.util.*;
public class twoDarraysaddition {
    static void printarray(int[][] arr){
        for(int i=0;i<arr.length;i++){

        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][]arr1 = new int[r][c];
        int[][]arr2 = new int[r][c];
        System.out.println("Enter" + r*c + "elements");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr1[i][j]=sc.nextInt();
                arr2[i][j]=sc.nextInt();
            }
        }
    }
}

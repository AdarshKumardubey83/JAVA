import java.util.Scanner;
class nintydegreerotation {
     static void printmatrix(int[][] arr) {
          for (int i = 0; i < arr.length; i++) {
               for (int j = 0; j < arr.length; j++) {
                    System.out.print(arr[i][j] + " ");
               }
               System.out.println();
          }
     }

     static void transpose(int[][] arr, int r, int c) {
          for (int i = 0; i < r; i++) {
               for (int j = 0; j < c; j++) {
                    System.out.print(arr[j][i]);
               }
               System.out.println();
          }
     }

     static void reverseoftranspose(int[][] arr, int r, int c) {

     }
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter number of rows and columns");
          int r = sc.nextInt();
          int c = sc.nextInt();
          int[][] arr = new int[r][c];
          System.out.println("Enter" + r * c + "elements");
          for (int i = 0; i < r; i++) {
               for (int j = 0; j < c; j++) {
                    arr[i][j] = sc.nextInt();
               }
          }
          System.out.println("Orignal matrix");
          printmatrix(arr);
          transpose(arr);
     }
}


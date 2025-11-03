import java.util.Arrays;
import java.util.Scanner;

public class Do {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" enter row of A : ");
        int r = scan.nextInt();
        System.out.println("enter col of A and row of B : ");
        int n = scan.nextInt();
        System.out.println("enter col of B : ");
        int c = scan.nextInt();


        int[][] a = new int[r][n];
        int[][] b = new int[n][c];
        int[][] m = new int[r][c];
        System.out.println(" enter in matrix A : ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = scan.nextInt();
            }
        }
        for (int[] e : a) {
            System.out.println(Arrays.toString(e));
        }
        System.out.println();
        System.out.println("enter matrix of B : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < c; j++) {
                b[i][j] = scan.nextInt();
            }
        }
        for (int[] e : b) {
            System.out.println(Arrays.toString(e));
        }
        System.out.println();
        System.out.println("multiplication matrix : ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                m[i][j] =0;
               for(int k=0 ;k<n ;k++){

               m[i][j]=m[i][j]+a[i][k]*b[k][j];

               }
            }
        }
        for (int[] e : m) {
            System.out.println(Arrays.toString(e));
        }


    }
}
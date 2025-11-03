import java.util.Arrays;
import java.util.Scanner;
public class Multi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter row limit :");
        int n = scan.nextInt();
        System.out.println("Enter colum limit : ");
        int k = scan.nextInt();
        int[][] a = new int[n][k];
        for(int i =0;i<n;i++){
            for(int j = 0;j<k;j++){
                a[i][j]=scan.nextInt();
            }
        }



for(int[] e: a) {
    System.out.println(Arrays.toString(e));

}
        System.out.println(a.length);
    scan.close();

        }
    }

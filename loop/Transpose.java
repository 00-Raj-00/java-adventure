import java.util.Scanner;
import java.util.Arrays;
public class Transpose {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Row : ");
       int row = scan.nextInt();
        System.out.print("Enter colum : ");
        int colum = scan.nextInt();
        int[][] a = new int[row][colum];
        for(int i = 0 ;i<row;i++ ) {
            for (int j = 0; j < colum; j++) {
                a[i][j] = scan.nextInt();
            }
        }
            for(int[] e : a){
                System.out.println(Arrays.toString(e));
            }


        int[][]b=new int[colum][row];
        for(int i = 0 ;i<row;i++ ){
            for(int j=0;j<colum;j++){
                b[j][i]=a[i][j];
            }
        }
        for(int []e : b){
            System.out.println(Arrays.toString(e));
        }

    }
}

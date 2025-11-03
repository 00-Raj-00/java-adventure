import java.util.Scanner;
import java.util.Arrays;
public class Add{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("row : ");
        int row = scan.nextInt();
        System.out.println("colum : ");
        int colum = scan.nextInt();
        int[][]a= new int[row][colum];
        for(int i =0;i<row;i++){
            for(int j = 0 ;j<colum;j++){
                a[i][j]=scan.nextInt();
            }
        }
        for(int[]e:a){
            System.out.println(Arrays.toString(e));
        }
        System.out.println("Enter matrix b :");
        int[][]b=new int[row][colum];
        for(int i =0;i<row;i++){
            for(int j = 0 ;j<colum;j++){
                b[i][j]=scan.nextInt();
            }
        }

        for(int[]e:b){
            System.out.println(Arrays.toString(e));
        }
        System.out.println();
        System.out.println("Sum of a and b matrix : ");

        int[][]c=new int[row][colum];
        for(int i =0;i<row;i++){
            for(int j = 0 ;j<colum;j++){
                c[i][j]= a[i][j]+b[i][j];

            }
        }
        for(int[]e:c){
            System.out.println(Arrays.toString(e));
        }
        scan.close();





    }
}

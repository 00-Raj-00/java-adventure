
import java.util.Scanner;
import java.util.Arrays;
public class Multiply {
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
        System.out.println("multiply of a and b matrix : ");

        int[][]c=new int[row][colum];
        for(int i =0;i<row;i++){
            for(int j = 0 ;j<colum;j++){
                int x = a[i][j]*b[i][j];
                int z=0;

                if (i == row-1 ){
                     z = 0;
                }
                else if(j== colum-1){
                    z=0;
                }
                else{
                    z = 1;
                }



                int y = a[i][j+z]*b[i+z][j];
                c[i][j]= x+y;



            }
        }
        for(int[]e:c){
            System.out.println(Arrays.toString(e));
        }
        scan.close();





    }
}

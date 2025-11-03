import java.util.Scanner;
public class Arrg {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       int [] a= new int[5];

        for(int i = 0 ; i < 5;i++ )
              a[i] = scan.nextInt();

           for(int j=0;j<5;j++){
               System.out.print(a[j]+" ");
           }



    }
}

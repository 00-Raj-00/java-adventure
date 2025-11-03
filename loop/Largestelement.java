import java.util.Scanner;
public class Largestelement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       int [] a= new int[5];
       int max = 0;

        for(int i = 0 ; i < 5;i++ ) {
            a[i] = scan.nextInt();
        }

           for(int j=0;j<5;j++){
               System.out.print(a[j]+" ");
           }
            for(int k = 0 ; k<5; k++){
                max = a[k];

                for(int l = 0 ; l<5;l++){
                    if (max < a[l]) {
                        max = a[l];

                    }




                }

            }
        System.out.println("max "+max);
       scan.close();

    }
}

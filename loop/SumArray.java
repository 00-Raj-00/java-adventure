import java.util.Scanner;
public class SumArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] a = new int[5];  // input-er of array

        int temp = 0;
        for (int i = 0; i < 5; i++) {
            a[i] = scan.nextInt();

        }
        for (int h = 0; h < 5; h++) {
            System.out.println(" real" + a[h]);
        }


        for (int k = 0; k < a.length /2; k++) {
            temp = a[k];
            a[k] = a[a.length - 1 - k];
            a[a.length - 1 - k] = temp;

        }
        for(int num = 0 ; num<a.length;num++){
            System.out.println("reverse : "+ a[num]);
        }
        int sum=0;
        for (int w = 0 ;w<a.length;w++ ){
            sum = sum+a[w];
        }
        System.out.println("sum : "+sum);
    }

}

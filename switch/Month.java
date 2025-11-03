import java.util.Scanner;
class Month
{
 public static void main ( String[] args)
 {
  Scanner scan = new Scanner(System.in);
  System.out.print(" choose your Month from 1 to 12 : " ); 
     int month    = scan.nextInt();
  switch(month){
 case 1 -> System.out.println(" January - 31 days " );
 case 2 -> System.out.println(" February - 28 days");
 case 3 -> System.out.println( " March - 31 days ");
 case 4 -> System.out.println( " April - 30 days " );
 case 5 -> System.out.println( " May - 31 days " );
 case 6 -> System.out.println( " June - 30 days " );
 case 7 ->System.out.println( " July - 31 days " );
 case 8 -> System.out.println( " August - 31 days ");
 case 9 -> System.out.println( " September - 30 days ");
 case 10 -> System.out.println( " October - 31 days " );
 case 11 -> System.out.println( " November - 30 days " );
 case 12 -> System.out.println( " December - 31 days ");
 default -> System.out.println( " wrong input ");
  }
 scan.close();
 }
}
 
  
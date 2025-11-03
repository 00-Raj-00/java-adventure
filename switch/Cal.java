import java.util.Scanner ;
class Cal 
{
 public static void main( String[] args )
 {
  Scanner scan = new Scanner(System.in);
      System.out.print(" Please in put any number in A : "); 
       int a = scan.nextInt();
      System.out.print(" Please in put any number in B : ");
       int b = scan.nextInt();
       scan.nextLine();
      System.out.print(" Choose from ( + , - , * , / ) : " );
       String sighn = scan.nextLine();
      switch( sighn ){
         case "+" : System.out.println(" Addion you have applied "+( a+b));
             break;
         case "-" : System.out.println(" Subtraction you have applied "+ (a-b));
             break;
         case "*" : System.out.println(" Multiply you have applied "+ (a*b) ) ;
             break;
         case "/": System.out.println(" Division you have applied " + (a/b));
             break ; 
         default: System.out.println(" You have choosen wrong sighn ");
           }
         scan.close();
        }
   }
 
  
  
 
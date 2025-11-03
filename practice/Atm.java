import java.util.Scanner;
class Atm
{
 public static void main (String [] arg)
 {
  Scanner scan = new Scanner(System.in);
  System.out.print(" Please enter your Account Balance : ");
  double cash = scan.nextDouble();
  System.out.print("if you want to Deposit press (1) to Withdraw (2) : ");
  double choice = scan.nextInt();
  double balance = 0 ;
  if( choice == 1 ){
    System.out.print(" please enter ammount to be deposit : ");
     double deposit = scan.nextInt();
     balance = cash + deposit ;
    }
   else if( choice == 2 ){
    if ( balance <= 1){
    System.out.println(" insufficient funds ");
     }else{
  System.out.print(" Please enter ammount to be Withdraw : ");
   double withdraw = scan.nextInt();
    balance = cash - withdraw ;
    }
    
    }
   System.out.println( " currunt : " + balance );

   scan.close();

  }
}
  
    
     
     
    
      
       
   
 
  
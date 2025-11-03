import java.util.Scanner;
class Tax;
{
 public static void main(String []args)
 {
  Scanner scan = new Scanner(System.in);
  System.out.print("Please enter your income : ");
  double income = scan.nextDouble();
  double pay = 0 ;
  double totaltax = 0;

  if( income <= 10_000 ){
  System.out.println(" You do not need to pay Tax ");
  }
  else if ( income >= 10_001 && income <= 30_000 ){
    pay = ((income - 10_000)*0.1);
   System.out.println("your tax on your income is : " + pay );
   }
   else if ( income >= 30_001 && income <= 60_000 ){
    pay = 20_000*0.1 + ((income-30_000)*0.2);
   System.out.println(" your tax on income is : " + pay);
   }
  else if ( income >= 60_000 ) {
  pay = 20_000*0.1 + 30_000*0.2 + ((income - 60_000)*0.3);
 System.out.println("Your tax on income is : " + pay );
 }

  totaltax = pay ; 
 system.out.println(" your total Tax is : " + totaltax);

 double NetIncome = income - pay ;
 System.out.println("Net Income of your : " + NetIncome);
 scan.close();
 }
}
 
 

   
    
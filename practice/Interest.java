import java.util.Scanner;
class Interest 
{
 public static void main(String [] args)
 {
  Scanner scan = new Scanner( System.in);
System.out.print("enter your unit : ");

  double unit = scan.nextDouble();
  double interest;
   double price;
   if(unit <= 50){
   price = unit*0.5;
    System.out.println( "unit price : "+ unit*0.5);
    }
  else if ( unit >= 51 && unit <= 150){
      interest = (unit-50)*0.75;
      price =  (50*0.5) + interest; 
    System.out.println( "unit price : "+ price);
  }
 else if ( unit >= 151 && unit <= 250 ){
      
   interest = (100*0.75)+((unit-150)*1.20);
    price = (50*0.5)+interest;
  System.out.println("unit price : "+ price);
 }
else if ( unit > 250 ){
 interest = (100*0.75)+(100*1.20)+((unit-250)*1.5); 
    price = (50*0.5)+interest;
  System.out.println("unit price : "+ price);
 }
double surcharge = price*0.2;
double total = surcharge + price;
System.out.println(total);

  scan.close();
}
}
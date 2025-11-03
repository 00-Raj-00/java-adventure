import java.util.Scanner;
class Shop
{
 public static void main(String[] args)
 {
  Scanner scan = new Scanner (System.in);
   System.out.print("choose from espresso , latte , cappuccino : " );
   String coffee = scan.next().toLowerCase().trim();
   System.out.print("choose from small , medium , large : ");
   String type = scan.next().toLowerCase().trim();
   switch(coffee){
    case  "espresso" :
      switch(type){
      case "small" : System.out.println(" You have choosen "+type+" "+coffee+" . Your total is $2.0 ");
       break;
      case "medium" : System.out.println(" You have choosen "+type+" "+coffee+" . Your total is $2.5 ");
       break; 
      case "large" : System.out.println(" You have choosen "+type+" "+coffee+" . Your total is $3.0 ");
       break;
      }
     break;
   case  "latte" :
      switch(type){
      case "small" : System.out.println(" You have choosen "+type+" "+coffee+" . Your total is $3.0 ");
       break;
      case "medium" : System.out.println(" You have choosen "+type+" "+coffee+" . Your total is $3.5 ");
       break; 
      case "large" : System.out.println(" You have choosen "+type+" "+coffee+" . Your total is $4.0 ");
       break;
      }
     break;
   case  "cappuccino" :
      switch(type){
      case "small" : System.out.println(" You have choosen "+type+" "+coffee+" . Your total is $4.0 ");
       break;
      case "medium" : System.out.println(" You have choosen "+type+" "+coffee+" . Your total is $4.5 ");
       break; 
      case "large" : System.out.println(" You have choosen "+type+" "+coffee+" . Your total is $5.0 ");
       break;
      }
     break;
  default:System.out.println(" we do not have this coffee ");
     }
    System.out.println("Thank you for Coming");
   scan.close();
  }
}
            
   

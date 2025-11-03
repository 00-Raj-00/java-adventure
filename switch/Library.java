import java.util.Scanner;
class Library
{
 public static void main( String[] args)
 {
  Scanner scan = new Scanner(System.in);
  System.out.printf(" category %n F for Fiction %n N for Non-Fiction %n C for Comics %n choose : " );
  String s = scan.nextLine().toUpperCase().trim();
  String n;
  switch(s){
  case "F": System.out.print(" You have chosen Fiction \n R for Romance Noval \n T for Thriller Novel \n chose : " );
          n = scan.nextLine().trim().toUpperCase();
     switch(n){
      case "R": System.out.println(" Romance Novel \n Borrowing period: 14 days \n Late fine: $0.50 per day ");
         break;
      case "T":System.out.println(" Thriller Novel \nBorrowing period: 10 days \n Late fine: $0.75 per day " );
          break;
default:System.out.println(" wronge input ");
               }
           break;
 case"N" :System.out.print("You have chosen Non-Fiction \n H for History \n S for Science \n choose : " );
         n = scan.nextLine().trim().toUpperCase();
       switch(n){
        case "H" :System.out.println("History \n Borrowing period: 21 days \n Late fine: $0.40 per day " );
        break;
        case "S":System.out.println("Science \n Borrowing period: 21 days \n Late fine: $0.40 per day");
    break;
  default:System.out.println(" wronge input" );
     }
    break;
 case "C":System.out.print("You have chosen Comics \n S for Superhero Comics \n G for Graphic Novels \n choose : " );
       n = scan.nextLine().trim().toUpperCase();
     switch(n){
      case "S":System.out.println(" Superhero Comics \n Borrowing period: 7 days \n Late fine: $1.00 per day "); 
      break;
     case"G":System.out.println(" Graphic Novels \n Borrowing period: 7 days \n Late fine: $1.25 per day ");
    break;
  default:System.out.println(" wronge input ");
    }
 break;
 default:System.out.println(" wronge input ");
} 
 scan.close();
}
}   
  
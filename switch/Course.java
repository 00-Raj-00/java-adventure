import java.util.Scanner;
class Course
{
 public static void main( String[] args)
 {
  Scanner scan = new Scanner(System.in);
  System.out.printf("Please enter faculty : %n ( E ) for Engineering %n ( S )for Science %n ( B ) for Business %n choose : " );
  String  s = scan.nextLine().toUpperCase().trim();
  switch(s){
   case "E": System.out.printf(" You have choosen Engineering Faculty , Now Choose Your Course :%n ( M ) for Mechanical Engineering %n ( E )                for Electrical Engineering %n ( C ) for Civil Engineering %n choose : " );
      String b = scan.nextLine().toUpperCase().trim();
      switch(b){
        case "M" : System.out.println("You have registered for Mechanical Engineering under the Engineering faculty. Your registration fee is $200." );
           break; 
        case "E" : System.out.println("You have registered for Electrical Engineering under the Engineering faculty. Your registration fee is $210." );
           break; 
         case "C" : System.out.println("You have registered for Civil Engineering under the Engineering faculty. Your registration fee is $220." );
           break; 
        }
      break;

  case "S": System.out.printf(" You have choosen Science Faculty , Now Choose Your Course :%n( P ) for Physics %n( C ) for Chemistry      %n( B ) for Biology %n choose : " );
      String c = scan.nextLine().toUpperCase().trim();
      switch(c){
        case "P" : System.out.println("You have registered for Physics under the Science faculty. Your registration fee is $100." );
           break; 
        case "C" : System.out.println("You have registered for Chemistry under the Science faculty. Your registration fee is $110." );
           break; 
         case "B" : System.out.println("You have registered for Biology under the Science faculty. Your registration fee is $120." );
           break; 
        }
      break;

    case "B": System.out.printf(" You have choosen Business Faculty , Now Choose Your Course :%n( F ) for Finance %n ( M ) or Marketing    %n( H )for Human Resources %n choose : " );
      String d = scan.nextLine().toUpperCase().trim();
      switch(d){
        case "F" : System.out.println("You have registered for Finance under the Business faculty. Your registration fee is $90." );
           break; 
        case "M" : System.out.println("You have registered for Marketing under the Business faculty. Your registration fee is $80." );
           break; 
         case "H" : System.out.println("You have registered for Human Resources under the Business faculty. Your registration fee is $85." );
           break; 
        }
      break;
   } 
 scan.close();
 }
}
       
           
                  
  
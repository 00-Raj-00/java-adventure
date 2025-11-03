import java.util.Scanner;
public class Ticket
{
 public static void main(String[] args)
 {
  Scanner scan = new Scanner(System.in);
  System.out.println("Please choose movie type (2D/3D): ");
  String s = scan.nextLine().trim().toUpperCase();
  String n ;
   boolean ticket = true;
  switch(s){
  case "2D"->{ System.out.print("Please choose show timing (Morning/Afternoon/Evening): ");
             n=scan.nextLine();
            
            n = n.substring(0,1).toUpperCase()+n.substring(1).toLowerCase();
          switch(n){
          case"Morning"->System.out.println("You have selected a "+s+" movie in the "+n+" slot. Ticket price:$8 ");
          case"Afternoon"->System.out.println("You have selected a "+s+" movie in the "+n+" slot. Ticket price:$10 ");
          case"Evening"->System.out.println("You have selected a "+s+" movie in the "+n+" slot. Ticket price:$12 ");
          default->{System.out.println(" Invalid Input ");
            ticket = false;
              }
           }
          }
  case "3D"->{ System.out.print("Please choose show timing (Morning/Afternoon/Evening): ");
             n=scan.nextLine();
            n = n.substring(0,1).toUpperCase()+n.substring(1).toLowerCase();
            
          switch(n){
          case"Morning"->System.out.println("You have selected a "+s+" movie in the "+n+" slot. Ticket price:$10 ");
          case"Afternoon"->System.out.println("You have selected a "+s+" movie in the "+n+" slot. Ticket price:$12 ");
          case"Evening"->System.out.println("You have selected a "+s+" movie in the "+n+" slot. Ticket price: $15");
          default->{System.out.println(" Invalid Input ");
             ticket = false;
             }
           }
          }
       }
       if(ticket)
         System.out.println("Thank you for using over services ");
            

     scan.close();
  }
}
                          
  
import java.util.Scanner;
class Bill
{
 public static void main(String[] args)
 {
  Scanner scan = new Scanner( System.in);
   System.out.println(" Appetizer : " );
   int app = scan.nextInt();
   System.out.print(" please enter your quantity : ");
   int qu = scan.nextInt();
   
   if ( app >= 0  ){
     
      System.out.println("  Appetizer : " + app + "   quantity : "+qu);
      }else {
       System.out.println(" you put wrong value ");
       }


       System.out.println(" Main Course : " );
       int  main = scan.nextInt();
       System.out.print(" please enter your quantity : ");
       int qua = scan.nextInt();
     
     
     if (main >=0){
     
     
   System.out.println(" Main Course:  " + main + " quantity : "+qua);
      }else{
      System.out.println(" you put wrong value " );
      }




   System.out.println(" Dessert : " );
   int des = scan.nextInt();
   System.out.print(" please enter your quantity : ");
    int qub  = scan.nextInt();
   
   
     
     if ( des >=0){
     
       System.out.println("    Dessert : " + des +"    quantity : "+qub);
      
      }else{
      System.out.println(" you put wrong value " );
      } 
    
      
     
     double subtotal = (app*qu) + (main*qua) +( des*qub) ;
     double service = subtotal*0.1;
     double  bill   =  subtotal + service;
   System.out.println(" final bill  : " + bill);
     scan.close();
     }
    }
      
     
import java.util.Scanner;
class Grading 
{
 public static void main (String[] args)
 {
  Scanner scan = new Scanner(System.in);
  System.out.print(" Please enter your Marks from 0 to 100 : ");
  int mark = scan.nextInt();
  if (mark>=0 && mark<=100){
  switch(   mark/10  ){
  case 9,10 -> System.out.println(" A grade ");
  case 8 -> System.out.println(" B grade ");
  case 7 -> System.out.println(" C grade ");
  case 6 -> System.out.println(" D grade ");
  default ->System.out.println(" F grade ");
   }
  }else{
   System.out.println(" Wrong Marks inputed ");
   }

 scan.close();
 }
}  
    
  
  
  
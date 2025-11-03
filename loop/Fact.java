import java.util.Scanner;
class Fact
{
 public static void main(String[] args)
 {
  Scanner scan = new Scanner(System.in);
  System.out.print(" enter your number for factorial: " );
  int fact = scan.nextInt();
  int n = 0;
  int t= 1;
  
for (; n<fact;n++){
       t=t*(fact-n);
 
 }
 System.out.println(fact+"!  factorial is " +t);
 
scan.close();
}
}
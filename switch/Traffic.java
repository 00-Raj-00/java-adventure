import java.util.Scanner;
class Traffic 
{
 public static void main (String[] args)
 { 
  Scanner scan = new Scanner(System.in);
  System.out.print(" Choose light from red , yellow , green : ");
  String s =scan.next().toLowerCase().trim();
  switch (s ){
  case "red"->System.out.println("  Stop ");
  case "yellow"->System.out.println("  Slow down ");
  case "green" -> System.out.println("  Go " );
 default-> System.out.println(" Wrong cammand ");
  }
scan.close();
 }
}
 
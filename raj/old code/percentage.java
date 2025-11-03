
import java.util.Scanner;

class percentage
{
public static void main( String []arg)
{
  Scanner sc = new Scanner ( System.in);
 System.out.println("total number");
  int a = sc.nextInt();
  
System.out.println("achive score ");
int b = sc.nextInt();

int p = b*100/a;
System.out.println(p);
}
}
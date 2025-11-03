import java.util.Scanner;
class expression
{

public static void main(String args[])
{
Scanner sc = new Scanner(System.in);

System.out.println( "value of V = ");
double v = sc.nextDouble();



System.out.println("value of u =");
double u = sc.nextDouble();



System.out.println("value of a =" ); 
double a = sc.nextDouble();

double total = (v*v - u*u)/(2*a*5);
System.out.println("total is =" + total);
}
}
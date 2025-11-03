import java.util.Scanner;
class array
{
public static void main(String[] args)
{
int size,i;
Scanner r= new Scanner(System.in);
System.out.println("enter array size");
size=r.nextInt();
int a[]=new int[size];
for(i=0;i<size;i++)
{
a[i]=r.nextInt();
}
System.out.println("printed");
for(i=0;i<size;i++)
{
System.out.print(a[i]);
}
}
}
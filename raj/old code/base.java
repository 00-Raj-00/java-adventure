import java.io.*;
class base 
{


int e , d,sum;
void add(int a,int b)
{
e=a;
d=b;
sum = a+b;
}
void show ()
{
System.out.println("sum="+sum);
}
}
class sub extends base
{
int s,r,sub;
void sub(int x,int y)
{
s=x;
r=y;
sub = x- y;
}
void display()
{
System.out.println("sub="+sub);
}
}
class single
{
public static void main(String[]args)
{
sub t1 = new sub();
t1.add(10,20);
t1.show();
t1.sub(3,4);
t1.display();
}
}
class convert
{
public static void main(String args[])
{
byte b = 127;
int a = b ;//change from byte to int
System.out.println(a);
int x = 12;
byte y;
y =(byte)x;//converting large int into small byte 
System.out.println(y);
int r = 385;//biger than range of byte
byte s ;
s = (byte)r;//modeule of range is divide by value
System.out.println(s);
float f= 23.8f;
int i ;
i=(int)f;
System.out.println(i);
char c='c';
int k;
k=(int)c;
System.out.println(k);
double d=236.987;
int m ;
m=(int)d;
System.out.println(m);

}
}
import java.util.Scanner;
class Sum
{
 public static void main(String[] args)
 {
  Scanner scan = new Scanner(System.in); // scanner class intialized 
 System.out.print("please enter initial natural number : " );
  int n = scan.nextInt();     // in this intial number will be enter
  int sum = 0;
 System.out.println(" choose : " );
  int c = scan.nextInt();
  switch(c){
case 1->{
   
  for( ; n > 0  ;n-- ){           // decrement is used to decrease and add in sum , n is bigger than and equal to zero

    sum  = sum +  n ;    
   System.out.println( " sum of " + n+" is  : " + sum);
  }
   }
case 2-> { while (n >0){
   sum = (n*(n+1))/2;
  System.out.println(" Sum is : " + sum);
 n--;
}
}
}
   System.out.println(" Total sum : " +sum);
  scan.close();
}
}          
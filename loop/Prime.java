import java.util.Scanner;
class Prime 
{
 public static void main (String[] args )
 {
  Scanner scan = new Scanner(System.in);
System.out.println(" enter : ");
  int n = scan.nextInt();
  int i = 2 ;
  int g = n;
  int f =0;
  for ( ; i <= n ;i++){
    f=n/i;
    
    
   
    
     if( f== g  ){
       System.out.println("prime number " + i + "   "+n);
        
        
      
      }
   
  
 }
} 
 } 
  
  

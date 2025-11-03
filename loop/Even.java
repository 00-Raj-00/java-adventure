import java.util.Scanner;
class Even
{
 public static void main(String[] args)
 {
  Scanner scan = new Scanner(System.in);
  System.out.print("Choose loop type \n 1 for for loop \n 2 while loop \n 3 do while loop \n choose : ");
  int c = scan.nextInt();
  int i = 2 ;
  switch(c){
   case 1 ->{ System.out.println("for loop you using " );
            for( ;i<=20;i++){
                           if( i%2==0)
                            System.out.println("Even number : " + i);
                            }
           }
  case 2 ->{ System.out.println("while loop you using " );
                   while(i<=20){
                             if( i%2==0)
                               System.out.println("Even number : " + i); 
                               i++;
                               }
            }
  case 3 ->{ System.out.println("do while loop you using " );
            do{
             
                 System.out.println("Even number : " + i);
              i+=2; } while(i<=20);
              }
           }
     scan.close(); 
        
 }
}        
               
  
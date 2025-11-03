class GfG {
    public static void main(String [] arg)
{
   int n = 1900;
     
      // Check if n is divisible by 4
      if (n % 4 == 0) {
        
         // If it's divisible by 100, it should also be
         // divisible by 400 to be a leap year
         if (n % 100 == 0) {
            return n % 400 == 0;
         }
         return true;
      }
      return false;
   }

   public static void main(String[] args) {
      int year = 1900;
      if (checkYear(year)) {
         System.out.println("true");
      } else {
         System.out.println("false");
      }
   }
}

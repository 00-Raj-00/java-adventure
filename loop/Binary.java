import java.util.Scanner;
public class Binary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt(); // Example decimal number
        String binary = "";
        
        // Check for zero
        if (number == 0) {
            binary = "0";
        }
        
        // Convert number to binary
        while (number > 0) {
            int remainder = number % 2;  // Get the remainder (either 0 or 1)
            binary = remainder + binary; // Prepend the remainder (build the binary string)
            number = number / 2;         // Divide the number by 2
        }
        
        System.out.println("Binary representation: " + binary);  // Output: 11001
    }
}

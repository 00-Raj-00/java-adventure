class T {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) { // Loop for numbers 1 to 10
            for (int n = 1; n <= 10; n++) { // Loop for multiplication from 1 to 10
                System.out.print(n * i + "\t"); // Use tab for better formatting
            }
            System.out.println(); // Move to the next line after printing one row
        }
    }
}

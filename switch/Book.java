import java.util.Scanner;

public class Book {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Prompt for book category selection
        System.out.printf("Please choose a book category:%n(F) for Fiction%n(N) for Non-Fiction%n(C) for Comics%nChoose: ");
        String category = scan.nextLine().trim().toUpperCase();
        String bookChoice;
        boolean validInput = true;
        
        switch (category) {
            case "F" -> {
                System.out.printf("You have chosen Fiction.%nNow choose your book:%n(R) for Romance Novel%n(T) for Thriller Novel%nChoose: ");
                bookChoice = scan.nextLine().trim().toUpperCase();
                switch (bookChoice) {
                    case "R" -> System.out.println("Romance Novel%nBorrowing period: 14 days%nLate fine: $0.50 per day".replace("%n", "\n"));
                    case "T" -> System.out.println("Thriller Novel%nBorrowing period: 10 days%nLate fine: $0.75 per day".replace("%n", "\n"));
                    default -> {
                        System.out.println("Invalid book selection for Fiction.");
                        validInput = false;
                    }
                }
            }
            case "N" -> {
                System.out.printf("You have chosen Non-Fiction.%nNow choose your book:%n(H) for History%n(S) for Science%nChoose: ");
                bookChoice = scan.nextLine().trim().toUpperCase();
                switch (bookChoice) {
                    case "H" -> System.out.println("History%nBorrowing period: 21 days%nLate fine: $0.40 per day".replace("%n", "\n"));
                    case "S" -> System.out.println("Science%nBorrowing period: 21 days%nLate fine: $0.40 per day".replace("%n", "\n"));
                    default -> {
                        System.out.println("Invalid book selection for Non-Fiction.");
                        validInput = false;
                    }
                }
            }
            case "C" -> {
                System.out.printf("You have chosen Comics.%nNow choose your book:%n(S) for Superhero Comics%n(G) for Graphic Novels%nChoose: ");
                bookChoice = scan.nextLine().trim().toUpperCase();
                switch (bookChoice) {
                    case "S" -> System.out.println("Superhero Comics%nBorrowing period: 7 days%nLate fine: $1.00 per day".replace("%n", "\n"));
                    case "G" -> System.out.println("Graphic Novels%nBorrowing period: 7 days%nLate fine: $1.25 per day".replace("%n", "\n"));
                    default -> {
                        System.out.println("Invalid book selection for Comics.");
                        validInput = false;
                    }
                }
            }
            default -> {
                System.out.println("Invalid book category selection.");
                validInput = false;
            }
        }

        if (validInput) {
            System.out.println("Thank you for using the Library Borrowing System!");
        }
        
        scan.close();
    }
}

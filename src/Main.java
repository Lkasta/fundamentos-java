import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Library library = new Library();
        System.out.println(library);

        System.out.println("Welcome to the library!");

        while (true) {
            System.out.println("\nDo you want to see the list of available books?");
            System.out.print("Enter YES or NO: ");

            String answer = scanner.nextLine();

            if (answer.equalsIgnoreCase("YES")) {
                library.showAvailableBooks();

                System.out.print("\nEnter the ID of the book you want to borrow: ");
                int bookId = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Enter your name: ");
                String clientName = scanner.nextLine();

                library.rentBook(bookId, clientName);

                System.out.println("\nThank you for using the library system!");
                break;

            } else if (answer.equalsIgnoreCase("NO")) {
                System.out.println("\nThank you for using the library system!");
                break;

            } else {
                System.out.println("Invalid option. Please enter YES or NO.");
            }
        }

        scanner.close();
    }
}
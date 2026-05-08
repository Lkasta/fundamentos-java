import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Library library = new Library();
        System.out.println(library);

        System.out.println("Bem-vindo à biblioteca!");

        while (true) {
            System.out.println("\nDeseja ver a lista de livros disponíveis?");
            System.out.print("Digite SIM ou NÃO: ");

            String answer = scanner.nextLine();

            if (answer.equalsIgnoreCase("SIM")) {
                library.showAvailableBooks();

                System.out.print("\nDigite o ID do livro que deseja emprestar: ");
                int bookId = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Digite seu nome: ");
                String clientName = scanner.nextLine();

                library.rentBook(bookId, clientName);

                System.out.println("\nObrigado por usar o sistema da biblioteca!");
                break;

            } else if (answer.equalsIgnoreCase("NÃO") || answer.equalsIgnoreCase("NAO")) {
                System.out.println("\nObrigado por usar o sistema da biblioteca!");
                break;

            } else {
                System.out.println("Opção inválida. Digite SIM ou NÃO.");
            }
        }

        scanner.close();
    }
}
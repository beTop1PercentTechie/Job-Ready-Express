package views;

import models.Book;
import java.util.Scanner;

public class LibraryView {

    private final Scanner scanner = new Scanner(System.in);

    public int getMenuSelection() {
        System.out.println("\nChoose an option:");
        System.out.println("1. Add a Book");
        System.out.println("2. View All Books");
        System.out.println("3. Search Book by Title");
        System.out.println("4. Remove a Book");
        System.out.println("5. Exit");
        System.out.print("Option: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public Book getBookDetails() {
        System.out.print("Enter Book Title: ");
        String title = scanner.nextLine();
        System.out.print("Enter Book Author: ");
        String author = scanner.nextLine();
        System.out.print("Enter Book ISBN: ");
        String isbn = scanner.nextLine();
        return new Book(title, author, isbn);
    }

    public String getSearchTitle() {
        System.out.print("Enter Title to Search: ");
        return scanner.nextLine();
    }

    public String getRemoveIsbn() {
        System.out.print("Enter ISBN to Remove: ");
        return scanner.nextLine();
    }

    public void displayBookDetails(Book book) {
        if (book != null) {
            System.out.println("Book found: " + book);
        } else {
            System.out.println("No book found with that title.");
        }
    }

    public void displayAllBooks(Book[] books) {
        if (books == null || books.length == 0) {
            System.out.println("No books available.");
        } else {
            for (Book book : books) {
                if (book != null) {
                    System.out.println(book);
                }
            }
        }
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }
}

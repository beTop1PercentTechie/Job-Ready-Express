package controllers;

import models.Book;
import models.Library;
import views.LibraryView;

public class LibraryController {

    private Library library;
    private LibraryView view;

    public LibraryController(Library library, LibraryView view) {
        this.library = library;
        this.view = view;
    }

    // Handle adding a book
    public void addBook() {
        Book book = view.getBookDetails();
        boolean success = library.addBook(book);
        if (success) {
            view.displayMessage("Book added successfully.");
        } else {
            view.displayMessage("Library is full, cannot add more books.");
        }
    }

    // Handle viewing all books
    public void viewAllBooks() {
        Book[] books = library.getAllBooks();
        view.displayAllBooks(books);
    }

    // Handle searching for books by title
    public void searchBookByTitle() {
        String title = view.getSearchTitle();
        Book book = library.searchByTitle(title);
        view.displayBookDetails(book);
    }

    // Handle removing a book
    public void removeBook() {
        String isbn = view.getRemoveIsbn();
        boolean success = library.removeBook(isbn);
        if (success) {
            view.displayMessage("Book removed successfully.");
        } else {
            view.displayMessage("No book found with that ISBN.");
        }
    }

    // Main loop to interact with the user (program's logic flow)
    public void start() {
        boolean running = true;
        while (running) {
            int choice = view.getMenuSelection();
            switch (choice) {
                case 1: addBook(); break;
                case 2: viewAllBooks(); break;
                case 3: searchBookByTitle(); break;
                case 4: removeBook(); break;
                case 5:
                    running = false;
                    view.displayMessage("Exiting the system...");
                    break;
                default:
                    view.displayMessage("Invalid option. Please try again.");
            }
        }
    }
}

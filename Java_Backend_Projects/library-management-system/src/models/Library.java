package models;

public class Library {
    private Book[] books;
    private int count;

    public Library(int capacity) {
        this.books = new Book[capacity];
        this.count = 0;
    }

    public boolean addBook(Book book) {
        if (count < books.length) {
            books[count++] = book;
            return true;
        } else {
            return false;
        }
    }

    public Book searchByTitle(String title) {
        for (int i = 0; i < count; i++) {
            if (books[i].getTitle().toLowerCase().contains(title.toLowerCase())) {
                return books[i];
            }
        }
        return null;
    }

    public boolean removeBook(String isbn) {
        for (int i = 0; i < count; i++) {
            if (books[i].getIsbn().equals(isbn)) {
                for (int j = i; j < count - 1; j++) {
                    books[j] = books[j + 1];
                }
                books[count - 1] = null;
                count--;
                return true;
            }
        }
        return false;
    }

    public Book[] getAllBooks() {
        Book[] allBooks = new Book[count];
        System.arraycopy(books, 0, allBooks, 0, count);
        return allBooks;
    }
}

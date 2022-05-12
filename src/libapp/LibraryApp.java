package libapp;

import java.util.ArrayList;

public class LibraryApp {
    private BookRepository bookRepo = new BookRepository();

    public void searchByIsbn(String isbn){
        System.out.printf("Searching for books with ISBN %s.\n", isbn);

        Book book = bookRepo.findByIsbn(isbn);
        if (book != null){
            System.out.printf("1 book found: \n\t Title: %s\n\tGenre: %s\n\tAuthor: %s\n\t", book.getTitle(), book.getGenre(), book.getAuthor());
        }else{
            System.out.printf("0 Bookd found");
        }
        System.out.println("\n\n");

    }

    public void searchByTitle(String keyword){
        System.out.printf("Searching for books with '%s' in the title...\n", keyword);
        ArrayList<Book> books = bookRepo.findByTitle(keyword);
        System.out.printf("%s books found%s\n", books.size(),  books.size() > 0 ? ":" : ".");

        for (Book book : books){
            System.out.printf("\tTitle: %s\n\tGenre: %s\n\tAuthor: %s\n\t", book.getTitle(), book.getGenre(), book.getAuthor());
        }
        System.out.println();

    }

    public void checkOutBook(String isbn){
        Book book = bookRepo.findByIsbn(isbn);
        if(book!= null){
            book.checkOut();
            System.out.println("Book Checked out successfully");
            System.out.printf("\tISBN: %s\n\tTitle: %s\n\tGenre: %s\n\tAuthor: %s\n\t", book.getIsbn(),book.getTitle(), book.getGenre(), book.getAuthor());
            System.out.println("\n");
        }
        else{
            System.out.println("Failed to check out book.");
            System.out.println("Reason: no book with the given ISBN is found");
        }
    }

    public void checkInBook(String isbn){
        Book book = bookRepo.findByIsbn(isbn);
        if(book!= null){
            book.checkIn();
            System.out.println("Book Checked in successfully");
            System.out.printf("\tISBN: %s\n\tTitle: %s\n\tGenre: %s\n\tAuthor: %s\n\t", book.getIsbn(),book.getTitle(), book.getGenre(), book.getAuthor());
            System.out.println("\n");
        }
        else{
            System.out.println("Failed to check in book.");
            System.out.println("Reason: no book with the given ISBN is found");
        }
    }

}

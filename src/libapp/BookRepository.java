package libapp;
import java.util.ArrayList;

public class BookRepository {
    private ArrayList<Book> books = new ArrayList<Book>();

    public BookRepository(){
        books.add(new Book("83471", "The Dead of night", "Horror", "A horror genre book", "S.K. Eleton", 10, 7));
        books.add(new Book("15972", "Harry Potter and the Sorcerer's stone", "Ficttion", "A fictional fantasy about magics", "J.K. Rowling",15,13));
        books.add(new Book("58739", "The Lord of the Rings The Two Towers", "Fiction", "A Fantastic book about heroes and magics", "J.R.R. Tolkien", 18, 18));
        books.add(new Book("96478", "Castles and siege", "Historical", "A record about sieges to castles", "N.N. Blacksmith", 9, 6));
        books.add(new Book("26843", "Night and Day", "Mystery", "A interesting book", "Q.Z. Bizar", 13, 5));
        books.add(new Book("61468", "Never Time", "Thriller", "A good book for some boring time", "P.B. Jelliton",6,6));
    }

    public Book findByIsbn(String isbn){
        for(Book book: books){
            if(book.getIsbn().equals(isbn)){
                return book;
            }
        }
        return null;
    }

    public ArrayList<Book> findByTitle(String keyword){
       ArrayList<Book> booksFound = new ArrayList<>();
       for(Book book : books){
           if (book.getTitle().toLowerCase().contains(keyword.toLowerCase())){
               booksFound.add(book);
           }
       }
       return booksFound;
    }

}

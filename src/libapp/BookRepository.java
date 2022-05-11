package libapp;
import java.util.ArrayList;

public class BookRepository {
    private ArrayList<Book> books = new ArrayList<Book>();

    public BookRepository(){
        books.add(new Book("83471", "The Dead of night", "Horror", "A horror genre book", "S.K. Eleton"));
        books.add(new Book("15972", "Harry Potter and the Sorcer's stone", "Ficttion", "A fictional fantasy about magics", "J.K. Rowling"));
        books.add(new Book("58739", "The Lord of the Rings The Two Towers", "Fiction", "A Fantastic book about heroes and magics", "J.R.R. Tolkien"));
    }

    public Book findByIsbn(String isbn){
        for(Book book: books){
            if(book.getIsbn().equals(isbn)){
                return book;
            }
        }
        return null;
    }

}

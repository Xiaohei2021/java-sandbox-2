package libapp;

public class Main {
    public static void main(String[] args) {

        LibraryApp app = new LibraryApp();

        app.searchByIsbn("15972");
        app.searchByTitle("dagger");
    }
}
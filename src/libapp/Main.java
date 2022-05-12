package libapp;

public class Main {
    public static void main(String[] args) {

        LibraryApp app = new LibraryApp();

        app.searchByIsbn("15972");
        app.searchByTitle("dagger");
        app.checkOutBook("15972");
        app.checkOutBook("68135");
        app.checkInBook("96478");
    }
}
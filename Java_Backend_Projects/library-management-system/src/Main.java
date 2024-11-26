import controllers.LibraryController;
import models.Library;
import views.LibraryView;

public class Main {
    public static void main(String[] args) {
        Library library = new Library(10);
        LibraryView view = new LibraryView();
        LibraryController controller = new LibraryController(library, view);

        controller.start();
    }
}

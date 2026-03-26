
class LibraryInfo {
    int libId;
    String libName;

    void showWelcomeMessage() {
        System.out.println("---- Library System ----");
    }

    void printLibraryInfo() {
        libId = 500;
        libName = "Central Library";

        System.out.println("Library ID : " + libId);
        System.out.println("Library Name : " + libName);
    }
}

// Book class
class BookInfo extends LibraryInfo {
    int bId;
    String bName;

    void showBookSection() {
        System.out.println("Book Section Details");
    }

    void printBookInfo() {
        printLibraryInfo();   // calling parent method

        bId = 900;
        bName = "Object Oriented Programming";

        System.out.println("Book ID : " + bId);
        System.out.println("Book Name : " + bName);
    }
}

// Member class
class UserInfo extends LibraryInfo {
    int userId;

    void showUserSection() {
        System.out.println("Member Section Details");
    }

    void printUserInfo() {
        printLibraryInfo();   // calling parent method

        userId = 700;

        System.out.println("Member ID : " + userId);
    }
}

public class MainApp {
    public static void main(String[] args) {

        BookInfo book = new BookInfo();
        book.showWelcomeMessage();
        book.showBookSection();
        book.printBookInfo();
        System.out.println();
        UserInfo user = new UserInfo();
        user.showWelcomeMessage();
        user.showUserSection();
        user.printUserInfo();
    }
}

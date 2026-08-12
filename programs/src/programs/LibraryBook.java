package programs;


public class LibraryBook {

    int bookid;
    String booktitle;
    String authorName;
    int availablecopies;

    static String libraryName = "City Library";
    static String librarianName = "Gopi";

    void displayBookDetails() {
        System.out.println("Book ID = " + bookid);
        System.out.println("Book Name = " + booktitle);
        System.out.println("Author Name = " + authorName);
        System.out.println("Available Copies = " + availablecopies);
    }

    void issueBook() {
        int issue = Math.min(1, availablecopies);
        availablecopies = availablecopies - issue;

        System.out.println("Issued Copies = " + issue);
        System.out.println("Available Copies = " + availablecopies);
    }

    static void displayLibraryDetails() {
        System.out.println("Library Name = " + libraryName);
        System.out.println("Librarian Name = " + librarianName);
    }

    static void changeLibrarian() {
        librarianName = "Werrt";
        System.out.println("Librarian Name = " + librarianName);
    }

    public static void main(String[] args) {

        LibraryBook a1 = new LibraryBook();

        a1.bookid = 1;
        a1.booktitle = "Comic";
        a1.authorName = "Oda";
        a1.availablecopies = 12;

        a1.displayBookDetails();
        a1.issueBook();

        LibraryBook.displayLibraryDetails();
        LibraryBook.changeLibrarian();
    }
}
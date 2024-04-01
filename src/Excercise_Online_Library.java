import java.util.Scanner;

class Library {
    String[] books ; // declaring books array
    int no_of_books = 0;

    public Library(){
        this.books = new String[100];
    }
     void addBook(String book) {
        this.books[no_of_books] = book;
        System.out.println(book+" - Your book have been added");
        no_of_books++;
    }

    //    This showAllBooks function is to show all the books
    void  showAllBooks() {
        System.out.println("Available Books are:");
        for (String book : this.books) {
            if (book == null){
                continue;
            }
            System.out.println("* " + book);
        }
    }
    void issueBook(String book){
        for (int i=0;i<this.books.length;i++){
            if (this.books[i]==(book)){
                System.out.println("The book has been issued");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("This book does not exist");
    }

    void returnBook(String book){
        addBook(book);
    }

}
public class Excercise_Online_Library {
    public static void main(String[] args) {
    Library use = new Library();
        use.addBook("गुनाहों का देवता");
        use.addBook("गोदान");
        use.addBook("सूरज का सातवाँ घोड़ा");
        use.addBook("कुरुक्षेत्र");
        use.addBook("आषाढ़ का एक दिन");
        use.addBook("the Alchemist");
        Scanner addinput = new Scanner(System.in);
        String addinputdata = addinput.next();
        use.addBook(addinputdata);
        use.showAllBooks();
        use.issueBook("गोदान");
        use.showAllBooks();
        use.returnBook("गोदान");
        use.showAllBooks();

    }
}
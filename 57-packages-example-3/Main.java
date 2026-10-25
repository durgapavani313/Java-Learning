import books.Book;
import members.Member;

public class Main {
    public static void main(String[] args) {

        System.out.println("--- Library Book Details ---");
        Book var1 = new Book();
        var1.displayBook();

        System.out.println();

        System.out.println("--- Library Member Details ---");
        Member var2 = new Member();
        var2.displayMember();
    }
}

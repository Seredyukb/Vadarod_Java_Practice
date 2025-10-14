import Task_3.Book;
import Task_3.Classes;

public class Main {
    public static void main(String[] args) {
        Book book99 = new Book(1, "1984", "Oruell", "Publish1", 1960, 350, 13);
        book99.chgPrice(17);

        String result = book99.info();
        System.out.println(result);
        Classes.books();
        Book booksGet[] = Classes.books();
        Book bookResult[] = book99.chgBook(booksGet, 1970);
        for (Book s : bookResult) {
            System.out.println(s.info());
        }
    }

}

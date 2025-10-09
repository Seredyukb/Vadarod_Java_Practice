package Task_3;

public class Book {
    int id = 0;
    String name;
    String author;
    String publish;
    int establ;
    int pages;
    double price;

    /**
     * Создать класс Book c полями id (тип int), name (тип String),
     * * author (тип String), издательство ( тип String ), Год издания(тип Int),
     * * Количество старниц (тип int), цена (double).
     */
    public Book(int idParam, String nameParam, String authorParam, String publishParam, int establ, int pages, double price) {

        id = idParam;
        name = nameParam;
        author = authorParam;
        publish = publishParam;
        this.establ = establ;
        this.pages = pages;
        this.price = price;
        /*
         * * Инициализацию книги в классе main выполнять через конструктор с параметрами.
         *     * Также определите конструктор без параметров.
         */


    }

    public Book() {

        /**
         * * Инициализацию книги в классе main выполнять через конструктор с параметрами.
         *     * Также определите конструктор без параметров.
         *     2 Создать метод, который будет выводить информацию по полям которые есть в классе и назвать его info
         * 3 Создать метод, который будет изменять ценц книги (сам метод в качестве параметра будет принимать новую цену)
         */

    }

    public String info() {
        String result = "Id: " + id + " name: " + name + " author: " + author + " publish: " + publish + " establ: " + establ + " pages: " + pages + " price: " + price;
        return result;
    }

    /*
     * 3 Создать метод, который будет изменять ценц книги (сам метод в качестве параметра будет принимать новую цену)
     */
    public void chgPrice(int price) {
        this.price = price;
    }

    //Создать метод в классе Book, который будет принимать массив книг и возвращать массив книг, у которых год издания ниже переданнго года в методе.
    public Book[] chgBook(Book[] books, int establParam) {

        int count = 0;
        for (Book s : books) {
            if (s.establ < establParam) {
                count++;
            }
        }
        int j = 0;
        Book booksResult[] = new Book[count];
        for (int i = 0; i < books.length; i++) {

            if (books[i].establ < establParam) {
                booksResult[j] = books[i];
                j++;
            }
        }
        return booksResult;
    }
}

package Task_3;

public class Classes {
    /*
    * 1 Создать класс Book c полями id (тип int), name (тип String),
    * author (тип String), издательство ( тип String ), Год издания(тип Int),
    * Количество старниц (тип int), цена (double).
    * Инициализацию книги в классе main выполнять через конструктор с параметрами.
    * Также определите конструктор без параметров.
2 Создать метод, который будет выводить информацию по полям которые есть в классе и назвать его info
3 Создать метод, который будет изменять ценц книги (сам метод в качестве параметра будет принимать новую цену)

4 В классе main создать массив из пяти книг
5 Создать метод в классе Book, который будет принимать массив книг и возвращать из массив книг, у которых год издания ниже переданной года в методе.
    * */

    Book book99 = new Book(1, "1984", "Oruell", "Publish1", 1960, 350, 13);


    public static Book[] books() {
        /*
         int idParam, String nameParam, String authorParam, String publishParam, int establ, int pages, double price
         */

        Book book1 = new Book(1, "1984", "Oruell", "Publish1", 1990, 350, 13);
        Book book2 = new Book(2, "Kolobok", "Narod", "Publish1", 1980, 350, 3);
        Book book3 = new Book(3, "Java для чайников", "kto-to", "Publish1", 1940, 350, 6);
        Book book4 = new Book(4, "JavaRush", "kto-toJavaRush", "Publish1", 1969, 350, 7);
        Book book5 = new Book(5, "Java Shield", "Shield", "Publish1", 1957, 350, 8);
        Book arrayBooks[] = {book1, book2, book3, book4, book5};
        return arrayBooks;
    }
}

package Task_13;

import java.util.ArrayList;
import java.util.List;

public class Main {
    //    Задачи по практике
//1.1.Создать коллекцию List (реализация ArrayList). Типизация коллекции – String.
//1.2Добавить  пару записей (Привет, Как дела, Праздник, Суфле)
//1.3 Вывести все записи.
//1.4 Проверить, содержит ли коллекция слово Конфета
//1.5 Посчитать количество элементов в коллекции
//2. Условие: Создайте ArrayList<String> для хранения списка покупок. Добавь в него 5 товаров. Затем выведите весь список на экран, а после — удалите один товар по названию и снова выведите обновлённый список.
//3. Условие: Создай класс Book с полями:
//• String title
//• String author
//3.1. Создайте 3 книги. И добавьте эти книги в коллекцию. Используйте метод List.of();
//3.2 Переоперделите метод equals на книгах так,чтобы он всегда возвращал false
//3.3. Удалите 1 книгу из коллекции. Выведите все книги и проанализируйте результат.
//8. Условие: Создай класс Book с полями:
//• String title
//• String author
//Создайте множество Set<Book> и добавьте в него несколько книг, включая дубликаты (одинаковое название и автор). Переопределите методы equals() и hashCode() так, чтобы книги с одинаковыми значениями title и author считались одинаковыми. Выведи содержимое множества и убедись, что дубликаты не добавляются.
    public static void main(String[] args) {
//        task_1();
//        task_2();
        task_3();
    }

    public static void task_1() {
        List<String> words = new ArrayList<>();
        String s1 = "Hi";
        String s2 = "How r u?";
        String s3 = "Nice to meet u";
        String s4 = "HalO!";
        String s5 = "Привет";
        words.add(s1);
        words.add(s2);
        words.add(s3);
        words.add(s4);
        words.add(s5);
        for (String s : words) {
            System.out.println(s);
        }

        Boolean candyContains = words.contains("Конфета");
        System.out.println(candyContains);
        int wordsSize = words.size();
        System.out.println(wordsSize);
    }

    public static void task_2() {
        //List<String> purchases = List.of("Milk", "Bred", "Candies", "Potatoe", "Tea");
        List<String> purchases = new ArrayList<>();
        String s1 = "Milk";
        String s2 = "Bred";
        String s3 = "Candies";
        String s4 = "Potatoe";
        String s5 = "Tea";
        purchases.add(s1);
        purchases.add(s2);
        purchases.add(s3);
        purchases.add(s4);
        purchases.add(s5);
        System.out.println(purchases.size());
        showList(purchases);
        purchases.remove("Milk");
        showList(purchases);


    }

    public static void task_3() {
        Book book1 = new Book("Цветы для Элджернона", "Киз");
        Book book2 = new Book("Множ-е умы Билли М.", "Киз");
        Book book3 = new Book("Ночной портье", "И. Шоу");
        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);

        for (Book p : books) {
            System.out.println(p);
        }
        books.remove(book2);
        for (Book p : books) {
            System.out.println(p);
        }

    }

    public static void showList(List<String> strings) {
        for (String p : strings) {
            System.out.println(p);
        }


    }
}
package Task_19;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Задание №1
//        1. Создать функциональный интерфейс. В этом интерфейсе будет метод, который будет возвращать результат умножения двух чисел.
//        Наименование метода: Integer multiplication(int a, int b);
//        2. В классе main используя ваш функциональный интерфейс, создате лямбда выражение и посчитайте произведение 5 на 10.
//        3. Результат выведите в консоль.

//        Задание №2
//        1. Создать класс авто. Поля: id, марка, пробег, год выпуска, максимальная скорость, цена.
//        1.1 Создать коллекцию из авто.
//        1.2 Найти самую быструю машину.
//        1.3 Найти самую медленную машину.
//        1.4 Найти самую старую
//        1.5 Найти самую новую
//        1.6 Найти машины, у которых пробег от 50000 до 100000.
//        1.7 Найти самую дорогую машину.
//        1.8 Найти самую дешёвую машину.
//        1.9 Отсортировать машины по пробегу (по возрастанию и по убыванию
//        1.10 Отсортировать машины по стоимости (по возрастанию и по убыванию)
//        1.11 Найти машины в диапазоне пробега от 20000 до 100000 и в диапазоне цен от 10000 до 20000.
//        1.12 Получить не повторяющиеся значения марок авто (distinct).
//        1.13 Найти машину в задданом дипазоне цен, определённой марки, с заданным дипазоном пробега, в заданном диапазон год выпуска. Если таких нет, выбросить своё исключение.
        Multiplication multi = (int a, int b) -> {
            return a * b;
        };
        Multiplication divide = (int a, int b) -> {
            return a / b;
        };
        int resultNumber = multi.multiplication(2, 3);
        System.out.println(resultNumber);

        int divideResult = divide.multiplication(6, 2);
        System.out.println(divideResult);

        customMultiplication(multi, 5, 4);
        stream1();
    }

    public static void customMultiplication(Multiplication multiplication, int a, int b) {
        System.out.println(multiplication.multiplication(a, b));
        ;
    }

    public static void stream1() {
        Car car1 = new Car("1", "Mazda", 200000, 2023, 180, 30000);
        Car car2 = new Car("2", "BMW", 100000, 2022, 240, 50000);
        Car car3 = new Car("3", "Jaguar", 80000, 2019, 240, 50000);
        Car car4 = new Car("4", "Kia", 220000, 2025, 200, 20000);
        Car car5 = new Car("5", "Jaguar", 70000, 2025, 260, 800000);

        List<Car> cars = List.of(car1, car2, car3, car4, car5);
        List<Car> list = cars.stream().filter(car -> {
            if (car.getDistance() > 50000 && car.getDistance() <= 100000) {
                return true;
            } else {
                return false;
            }
        }).toList();
        List<Car> list2 = cars.stream().filter(car -> car.getDistance() > 50000 && car.getDistance() <= 100000).toList();
        System.out.println(list);
        //        1.2 Найти самую быструю машину.
        Optional<Car> resultCars = cars.stream().max(Comparator.comparing(Car::getMaxSpeed));
        if (resultCars.isPresent()) {
            System.out.println(resultCars.get());
        }
        //        1.12 Получить не повторяющиеся значения марок авто (distinct).
        List<String> marks = cars.stream().map(car -> {
            return car.getMark();
        }).distinct().toList();
        System.out.println(marks);

        //1.13 Найти машину в задданом дипазоне цен, определённой марки, с заданным дипазоном пробега, в заданном диапазон год выпуска. Если таких нет, выбросить своё исключение.
        Car carOne = cars.stream().filter(car -> {
            if (car.getMark().equals("Jaguar") && car.getMaxSpeed() > 100) {
                return true;
            } else return false;
        }).findFirst().orElseThrow(() -> new CarNotFoundException("такой машины нет"));
        System.out.println(carOne);

    }

    public static void colable() {
// Задание №3
//Создать задачу Callable, которая генерирует коллекцию из 10 рандомных целых чисел -> засыпает произвольно на 1-10 секунд, результат выполнения – сумму этих чисел в виде строки. Запустить 10 задач параллельно в пуле из 3 потоков. Вывести ход программы на экран с указанием имени потока, который выполняет работу.

    }


}

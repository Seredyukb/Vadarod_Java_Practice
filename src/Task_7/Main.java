package Task_7;

import Task_7.exception.NotCorrectPasswordException;
import Task_7.exception.UserNotFoundException;
import Task_7.service.UserService;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
//        Задача 1
//        1. Заполнить HashMap 10 объектами <Integer, String>. Найти строки у которых ключ>5. Если ключ = 0, вывести строки через запятую. Перемножить все ключи, где длина строки>5.
//
//        Задача 2
//        1. Создать класс пользователь. Поля логин, пароль, имя, фамилия.
//        2. Создать класс UserRepository. Внутри класса создать статическую переменную List<User> users.
//        3. Выполнить инициаизацию коллекции в статическом блоке. Создать 5 пользователей и заполнить поля.
//        4. Создать класс сервис. Реализовать в этом классе метод аутенфикации  пользователя (void authenticate (String login, String password). Этот метод должен проверять наличие пользователя в репозитории по логину. Если пользователя нет, то выбрасываем собственное исключение (UserNotFoundException)
//        5. В этом же методе выполнить проверку пароля пользователя, если по логину мы его нашли. Если пароль не совпадает, то выбрасываем собственное исключение NotCorrectPasswordException.
//        6. В классе main при вызове метода аутенфикации перехватите исключение UserNotFoundException и выведите в консоль (нет пользователя)
//        7. Также перехватите оставшиеся исключения и в блоке catch выведите в консоль сообщение (Вы не прошли аутенфикацию)
//
//        Задача 3
//        1. Создать класс Фирма. Создать класс Налоговая.
//        1.1 Поля у фирмы. Наименование, сфера деятельности, идентификационный номер. Долг перед налоговой
//        1.2 В классе налоговой создать поле типа HashMap(String, Collection<Фирма>>.
//        1.3 Создать десять фирм.
//        1.4 Добавить информацию о фирмах в налоговую со следующими ключами: Нет долгов, Не уплачено рублей до 10000, не уплачено рублей более 10000.
//        1.5 *Создать метод, который после оплаты налога какой-нибудь фирмой проверял задолжность и перед налоговой, и мог переместить эту фирму в другой статус (в соответствующий ключ).
//        Map<Integer, String> entry = new HashMap<>();
//        entry.put(10, "String0");
//        entry.put(1, "String1");
//        entry.put(2, "String2");
//        entry.put(3, "String3");
//        entry.put(4, "String4");
//        entry.put(5, "String5");
//        entry.put(6, "String6");
//        entry.put(7, "String7");
//        entry.put(8, "String8");
//
//        Set<Integer> keys = entry.keySet();
//        int sum = 0;
//        for (Integer s : keys) {
//            if (s > 5) {
//                System.out.println(entry.get(s));
//            } else if (s == 0) {
//                System.out.println(entry.values());
//            }
//            String valuesFromKey = entry.get(s);
//
//            if (valuesFromKey.length() > 5) {
//                sum *= s;
//            }
//
//        }
//        System.out.println(sum);


        authentification();
    }

    public static void authentification() {
        try {
            UserService userService = new UserService();
            userService.authenticate("RObert", "1234");
        } catch (NotCorrectPasswordException notCorrectPasswordException) {
            System.out.println("Вы не прошли аутенфикацию!");
        } catch (UserNotFoundException userNotFoundException) {
            System.out.println("нет пользователя");
        }

    }
}

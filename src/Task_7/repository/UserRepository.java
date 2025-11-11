package Task_7.repository;

import Task_7.enity.User;
import Task_7.exception.UserNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    public static List<User> users = new ArrayList<>();


    static {
        User user1 = new User("Marta17", "1234", "Maria", "Fomina");
        User user2 = new User("Kubik", "5656", "Vainya", "Vruh");
        User user3 = new User("kichik", "asd123", "Lyaisan", "Utyaheva");
        User user4 = new User("hrom", "asldkjb12", "Gerald", "Dzubik");
        User user5 = new User("grom", "987324kl", "Prohor", "Krotov");

        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
    }

    public static User searchUsersByLogin(String login) {
        for (User s : users) {
            if (s.getLogin().equals(login)) {
                return s;
            }
        }
        throw new UserNotFoundException("Такого пользователя не существует");
    }
}

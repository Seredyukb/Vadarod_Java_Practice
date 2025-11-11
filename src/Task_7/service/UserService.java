package Task_7.service;

import Task_7.enity.User;
import Task_7.exception.NotCorrectPasswordException;
import Task_7.repository.UserRepository;

public class UserService {
    public User authenticate(String login, String password) {
        UserRepository userRepository = new UserRepository();
        User user = UserRepository.searchUsersByLogin(login);
        if (user.getPassword().equals(password)) {
            return user;
        }
        throw new NotCorrectPasswordException("Пароль не совпадает");
    }
}

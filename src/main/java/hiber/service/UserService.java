package hiber.service;

import hiber.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    void saveUser(User user);
    void deleteUserById(Long id);
    User getUserById(Long id);
    void updateUser(User user);
}

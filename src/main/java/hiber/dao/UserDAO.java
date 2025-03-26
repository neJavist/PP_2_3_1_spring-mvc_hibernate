package hiber.dao;

import hiber.entity.User;

import java.util.List;

public interface UserDAO {
    List<User> getAllUsers();
    void saveUser(User user);
    void deleteUserById(Long id);
    User getUserById(Long id);
    void updateUser(User user);
}

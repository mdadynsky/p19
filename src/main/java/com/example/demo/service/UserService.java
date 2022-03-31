package com.example.demo.service;

import com.example.demo.dao.UserDao;
import com.example.demo.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserService {
    private final UserDao userDao;

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public List<Map<String, Object>> getUsers() {
        return userDao.getUsers();
    }

    public List<User> getUserList() {
        return userDao.getUserList();
    }

    public User getUserById(Integer userId){
        return userDao.getUserById(userId);
    }

    public void deleteUser(Integer userId) {
        userDao.deleteUser(userId);
    }

    public void save(User user) {
        if (user.getId()==null)
            userDao.insert(user);
        else
            userDao.update(user);
    }
}

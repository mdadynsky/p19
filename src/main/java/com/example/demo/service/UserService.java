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

    public void deleteUser(Integer userId) {
        userDao.deleteUser(userId);
    }
}

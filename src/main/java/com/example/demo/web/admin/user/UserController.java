package com.example.demo.web.admin.user;

import com.example.demo.dao.UserDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;

@Controller
public class UserController {

    private UserDao userDao;

    public UserController(UserDao userDao) {
        this.userDao = userDao;
    }

    @GetMapping("/admin/user/users")
    public String showUserList() {
        List<Map<String, Object>> listOfMaps = userDao.getUsers();
        return "admin/user/users";
    }

    @GetMapping("/admin/user/edit")
    public String showUserEdit() {
        return "admin/user/users";
    }
}

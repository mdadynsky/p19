package com.example.demo.web.admin.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/admin/user/users")
    public String showUserList() {
        return "admin/user/users";
    }

    @GetMapping("/admin/user/edit")
    public String showUserEdit() {
        return "admin/user/users";
    }
}

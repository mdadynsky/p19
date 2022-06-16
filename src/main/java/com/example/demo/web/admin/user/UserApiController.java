package com.example.demo.web.admin.user;

import com.example.demo.model.*;
import com.example.demo.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/admin/user")
public class UserApiController {

    private final UserService userService;

    public UserApiController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/users")
    public List<User> getUsers() {
        return userService.getUserList();
    }

    public void animalTest() {
        String a1 = "stroka";

        int a2 = 7;
        Integer a3 = 7;


        Cat cat1 = new Cat();
        cat1.setName("Shushpan");
        cat1.setAge(3);
        cat1.setSex(Animal.SEX_MALE);

        Cat cat2 = new Cat();
        cat2.setName("Murka");
        cat2.setAge(5);
        cat2.setSex(Animal.SEX_FEMALE);

        Dog dog1 = new Dog();
        dog1.setName("Sharik");
        dog1.setAge(7);
        dog1.setSex(Animal.SEX_MALE);

        child(cat1);
        child(cat2);
        child(dog1);

        say(cat1);
        say(cat2);
        say(dog1);

        Elephant e1 = new Elephant();
        e1.countFoot()
    }

    private void child(Animal animal) {
        if (animal.getAge() < 5) {
            System.out.println("It's child");
        } else {
            System.out.println("It's adult");
        }
    }

    private void say(IAnimal animal) {
        System.out.println(animal.say());
        System.out.println(animal.getName());
    }
}

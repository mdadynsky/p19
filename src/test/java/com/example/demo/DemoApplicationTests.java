package com.example.demo;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.springframework.test.util.AssertionErrors.*;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private UserService userService;

	@Test
	void contextLoads() {
	}

	@Test
	public void testAdd() {
		assertEquals("Проверка суммы",42, Integer.sum(19, 23));
	}

	@Test
	public void userList() {
		List user = userService.getUsers();
		assertEquals("Пользователей должно быть 6", 6, user.size());
	}

	@Test
	public void userById(){
		User user = userService.getUserById(1);
		assertEquals("Имя пользователя должно быть admin", "admin", user.getUserName());
		assertTrue("Пользователь должен быть активен", user.isActive());

		user = userService.getUserById(9);
		assertNull("Не должна выбиратся запись с id больше 6", user);
	}

	@Test
	public void saveUser(){
		User user = new User();
		user.setUserName("user-1");
		user.setPassword("password-1");

		userService.save(user);

		User savedUser = userService.getUserByName("user-1");

		assertNotNull("Сохраннный пользователь должен быть найден в БД", savedUser);

		if (!"password-1".equals(user.getPassword()))
			fail("Пароль не совпадает с сохраненным");

		userService.deleteUser(savedUser.getId());

		savedUser = userService.getUserByName("user-1");
		assertNull("Сохраннный пользователь должен удален", savedUser);
	}

}

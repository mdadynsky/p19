package com.example.demo;

import com.example.demo.service.UserService;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.springframework.test.util.AssertionErrors.assertEquals;

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

}

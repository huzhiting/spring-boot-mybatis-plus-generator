package com.example.demo.service.impl;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by hzt on 2019/4/18 0018.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest {

	@Autowired
	private UserService userService;

	@Test
	public void testQueryAllUsers() throws Exception {
		List<User> userList=userService.queryAllUsers();
		if(userList!=null && !userList.isEmpty()){
			for (User user:userList) {
				System.out.println("查询用户结果：" + user.getId() + "/ " + user.getName());
			}
		}

	}
}
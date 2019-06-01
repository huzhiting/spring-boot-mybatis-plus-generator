package com.example.demo;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class SpringBootMybatisPlusGeneratorApplicationTests {

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

package com.example.demo.service.impl;

import com.example.demo.model.User;
import com.example.demo.dao.UserMapper;
import com.example.demo.service.UserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author huzhiting
 * @since 2019-04-18
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public List<User> queryAllUsers() {
		return userMapper.selectList(null);
	}
}

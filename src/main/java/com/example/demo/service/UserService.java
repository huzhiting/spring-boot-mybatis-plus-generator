package com.example.demo.service;

import com.baomidou.mybatisplus.service.IService;
import com.example.demo.model.User;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author huzhiting
 * @since 2019-04-18
 */
public interface UserService extends IService<User> {

	List<User> queryAllUsers();

}

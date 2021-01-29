package com.bdqn.smbms.service.userservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import com.bdqn.smbms.dao.user.UserMapper;
import com.bdqn.smbms.pojo.User;
@Service
@Transactional
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper userMapper;
	

	public UserMapper getUserMapper() {
		return userMapper;
	}

	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	public int add(User user) throws Exception {
		// TODO Auto-generated method stub
		return userMapper.add(user);
	}
	@Transactional(isolation=Isolation.READ_COMMITTED)
	public User getLoginUser(String userCode) throws Exception {
		// TODO Auto-generated method stub
		return userMapper.getLoginUser(userCode);
	}

	public List<User> getUserList(String userName, int userRole,
			int currentPageNo, int pageSize) throws Exception {
		// TODO Auto-generated method stub
		return userMapper.getUserList(userName, userRole, currentPageNo, pageSize);
	}

	public int getUserCount(String userName, int userRole) throws Exception {
		// TODO Auto-generated method stub
		return userMapper.getUserCount(userName, userRole);
	}

	public int deleteUserById(Integer delId) throws Exception {
		// TODO Auto-generated method stub
		return userMapper.deleteUserById(delId);
	}

	public User getUserById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return userMapper.getUserById(id);
	}

	public int modify(User user) throws Exception {
		// TODO Auto-generated method stub
		return userMapper.modify(user);
	}

	public int updatePwd(int id, String userPassword) throws Exception {
		// TODO Auto-generated method stub
		return userMapper.updatePwd(id, userPassword);
	}

	public User login(String userName, String password) {
		// TODO Auto-generated method stub
		
		return userMapper.getUserByUserNameandpassword(userName, password);
	}


}

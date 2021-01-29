package com.bdqn.smbms.service.roleservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bdqn.smbms.dao.role.RoleMapper;
import com.bdqn.smbms.pojo.Role;
@Service("roleService")
public class RoleServiceImpl implements RoleService{
@Autowired
private RoleMapper roleMapper;

	public RoleMapper getRoleMapper() {
	return roleMapper;
}

public void setRoleMapper(RoleMapper roleMapper) {
	this.roleMapper = roleMapper;
}

	public List<Role> getRole() {
		// TODO Auto-generated method stub
		return roleMapper.getRole();
	}

}

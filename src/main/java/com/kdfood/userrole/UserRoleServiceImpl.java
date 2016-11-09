package com.kdfood.userrole;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserRoleServiceImpl implements UserRoleService {
@Autowired
	UserRoleDAO dao;

   @Transactional	
public void insertUserRole(UserRole i) {
		// TODO Auto-generated method stub
		dao.insertUserRole(i);

	}
   @Transactional	
	public void deleteUserRole(int i) {
		// TODO Auto-generated method stub
       dao.deleteUserRole(i);
	}
   @Transactional	
	public void updateUserRole(UserRole i) {
		// TODO Auto-generated method stub
dao.updateUserRole(i);
	}
   @Transactional	
	public void generateUserRoles() {
		// TODO Auto-generated method stub
dao.generateUserRoles();
	}
   @Transactional	
	public UserRole getUserRole(int i) {
		// TODO Auto-generated method stub
		return dao.getUserRole(i);
	}
   @Transactional	
	public List<UserRole> getAllUserRoles() {
		// TODO Auto-generated method stub
		return dao.getAllUserRoles();
	}

}

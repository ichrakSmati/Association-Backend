package com.backend.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.backend.dao.RoleRepository;
import com.backend.models.Role;

public class RoleServiceImp implements RoleService{

	@Autowired
	private RoleRepository roleRepository;

	@Override
	public List<Role> getListRole() {
		return roleRepository.findAll();
	}
	
	@Override
	public Role findById(Integer id) {
	    return roleRepository.getOne(id); 
	}
}

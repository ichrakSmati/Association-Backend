package com.backend.service;

import java.util.List;
import com.backend.models.Role;

public interface RoleService {

	void addRole(Role role);
	List<Role> getListRole();
	Role findById(Integer id);
}

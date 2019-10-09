package com.backend.service;

import java.util.List;
import com.backend.models.Role;

public interface RoleService {

	List<Role> getListRole();
	Role findById(Integer id);
}

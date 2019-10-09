package com.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.backend.models.Role;

public interface RoleRepository extends JpaRepository<Role, Integer>{

}

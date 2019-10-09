package com.backend.dao;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{	
	Optional<User> findByEmail(String email);
	Optional<User> findByResetToken(String resetToken);
}

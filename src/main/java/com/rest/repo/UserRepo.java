package com.rest.repo;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.model.User;

public interface UserRepo extends JpaRepository<User,Long> {
	@Transactional
	void deleteUserById(Long id);
	Optional<User> findUserById(Long id);

}

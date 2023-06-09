package com.project2.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project2.demo.model.UserModel;
@Repository
public interface UserRepository extends JpaRepository<UserModel, Integer> {
	UserModel findByUsername(String username);
}

package com.eduloan.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eduloan.demo.Model.UserModel;
@Repository
public interface UserRepo extends JpaRepository<UserModel, Integer> {

	UserModel findByEmail(String email);
}

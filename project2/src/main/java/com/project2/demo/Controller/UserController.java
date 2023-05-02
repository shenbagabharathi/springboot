package com.project2.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project2.demo.model.UserModel;
import com.project2.demo.service.UserService;

@RestController
public class UserController {
@Autowired
public UserService cserv;
@PostMapping("/checkLogin")
public String validateUser(@RequestBody UserModel u)
{
System.out.println(u.getUsername());
	return cserv.validateUser(u.getUsername(),u.getPassword());
}
@PostMapping("/addUser")
public UserModel add(@RequestBody UserModel u)
{
  return cserv.saveuser(u);
}
}

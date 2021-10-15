package com.haqq.microserviceregister;

import com.haqq.microserviceregister.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.haqq.microserviceregister.model.User;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController {
    @Autowired
    private UserRepo userRepo;

    @RequestMapping("/")
    public String registerCheck(){

        return "check register!!!";
    }

    @RequestMapping("/register-user/{username}/{password}")
    public String registerUser(@PathVariable("username") String username, @PathVariable("password") String password){
        User user = new User();
        user.setId(1);
        user.setName(username);
        user.setPassword(password);
        userRepo.save(user);
        return "successfully register!!!";
    }
}

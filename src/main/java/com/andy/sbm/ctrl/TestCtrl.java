package com.andy.sbm.ctrl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.andy.sbm.entity.User;

@RestController
public class TestCtrl {


	@RequestMapping("/demo")
    public User demo(){
        User user = new User();
        user.setUsername("abc");
        return user;
    }
	
}

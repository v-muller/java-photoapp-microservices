package com.vmuller.photo.api.users.controllers;

import com.vmuller.photo.api.users.models.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private Environment env;

    @GetMapping("/status/check")
    public String status(){
        return "Working" + env.getProperty("local.server.port");
    }

    @PostMapping
    public String createUser(@Valid @RequestBody UserModel userDetails){
        return "Create user method is called";
    }
}

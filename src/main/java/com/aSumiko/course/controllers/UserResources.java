package com.aSumiko.course.controllers;

import com.aSumiko.entities.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( "/users")
public class UserResources {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User user = null;
        try{
            user = new User(1L, "Maria", "maria@gmail.com","99999999", "12345");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
}

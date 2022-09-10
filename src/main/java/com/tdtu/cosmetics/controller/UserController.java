package com.tdtu.cosmetics.controller;

import com.tdtu.cosmetics.exception.UserIdNotFoundException;
import com.tdtu.cosmetics.model.Users;
import com.tdtu.cosmetics.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class UserController {
    @Autowired
    private UserService userService;

    // get user by id rest api
    @RequestMapping(value="/getUserById", method= RequestMethod.GET)
    public ResponseEntity<Users> getUserById(@RequestParam("id") String id) {
        Users user = userService.getById(id);
        if(user==null)
        {
            throw new UserIdNotFoundException();
        }
        return ResponseEntity.ok(user);
    }

    // get user by id rest api
    @RequestMapping(value="/getUserById/{id}", method= RequestMethod.GET)
    public ResponseEntity<Users> getUser(@PathVariable String id) {
        Users user = userService.getById(id);
        if(user==null)
        {
            throw new UserIdNotFoundException();
        }
        return ResponseEntity.ok(user);
    }
}

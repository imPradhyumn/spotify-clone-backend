package com.spotifyclone.controllers;

import com.spotifyclone.entities.AuthRequest;
import com.spotifyclone.entities.Song;
import com.spotifyclone.entities.User;
import com.spotifyclone.error.AuthenticationFailedException;
import com.spotifyclone.error.UserAlreadyRegisteredException;
import com.spotifyclone.error.UserNotFoundException;
import com.spotifyclone.services.interfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "*")
public class UserController {
    @Autowired
    private IUserService userService;

    @GetMapping("/")
    public String hello() {
        return "hello world!";
    }

    @PostMapping("/login")
    public ResponseEntity<User> authenticateUser(@RequestBody AuthRequest authCredentials) throws UserNotFoundException, AuthenticationFailedException {
        String userId = authCredentials.getUserId();
        String password = authCredentials.getPassword();
        User user = userService.authenticateUser(userId, password);
        return ResponseEntity.ok(user);
    }

    @PostMapping("/signup")
    @ResponseBody
    public User addUser(@RequestBody User user) throws UserAlreadyRegisteredException {
        return userService.addUser(user);
    }

    @GetMapping("/get-playlist/{id}")
    public List<Song> getUserPlaylist(@PathVariable("userId") long userId) {
        return userService.getUserPlaylist(userId);
    }

}

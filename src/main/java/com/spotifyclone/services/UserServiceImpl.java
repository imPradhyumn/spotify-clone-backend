package com.spotifyclone.services;

import com.spotifyclone.entities.Song;
import com.spotifyclone.entities.User;
import com.spotifyclone.error.AuthenticationFailedException;
import com.spotifyclone.error.UserAlreadyRegisteredException;
import com.spotifyclone.error.UserNotFoundException;
import com.spotifyclone.repositories.UserRepository;
import com.spotifyclone.services.interfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserRepository userRepo;

    @Override
    public User getUser(String userId) {
        Optional<User> user = userRepo.findByUserNameOrEmail(userId).stream().findFirst();
        return user.orElse(null);
    }

    @Override
    public User authenticateUser(String userId, String passwordEntered) throws AuthenticationFailedException, UserNotFoundException {
        User user = getUser(userId);
        if (user == null) {
            throw new UserNotFoundException("User not found");
        }
        String passwordStored = user.getPassword();
        if (!passwordStored.equals(passwordEntered)) {
            throw new AuthenticationFailedException("Invalid credentials");
        }
        return user;
    }

    @Override
    public User addUser(User user) throws UserAlreadyRegisteredException {
        String email = user.getEmail();
        String userName = user.getUserName();
        String userId = userName == null ? email : userName;
        if (getUser(userId) != null) {
            throw new UserAlreadyRegisteredException("User already registered");
        }
        return userRepo.save(user);
    }

    @Override
    public List<Song> getUserPlaylist(long userId) {
        return null;
    }

}

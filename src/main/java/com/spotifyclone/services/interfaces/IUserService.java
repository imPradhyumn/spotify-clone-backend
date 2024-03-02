package com.spotifyclone.services.interfaces;

import com.spotifyclone.entities.Playlist;
import com.spotifyclone.entities.User;
import com.spotifyclone.error.AuthenticationFailedException;
import com.spotifyclone.error.UserAlreadyRegisteredException;
import com.spotifyclone.error.UserNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface IUserService {

    public User getUser(String userId);

    public User authenticateUser(String userId, String password) throws UserNotFoundException, AuthenticationFailedException;

    public User addUser(User user) throws UserAlreadyRegisteredException;

    public List<Playlist> getUserPlaylists(long userId);

}

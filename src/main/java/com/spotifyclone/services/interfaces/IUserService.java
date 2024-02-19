package com.spotifyclone.services.interfaces;

import com.spotifyclone.entities.Song;
import com.spotifyclone.entities.User;
import com.spotifyclone.error.AuthenticationFailedException;
import com.spotifyclone.error.UserAlreadyRegisteredException;
import com.spotifyclone.error.UserNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IUserService {

    public User getUser(String userId);

    public User authenticateUser(String userId, String password) throws UserNotFoundException, AuthenticationFailedException;

    public User addUser(User user) throws UserAlreadyRegisteredException;

    public List<Song> getUserPlaylist(long userId);

}

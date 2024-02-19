package com.spotifyclone.services.interfaces;

import com.spotifyclone.entities.Album;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IAlbumService {

    public List<Album> getAlbumListByName(String albumName);
}

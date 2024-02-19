package com.spotifyclone.services.interfaces;

import com.spotifyclone.entities.Album;

import java.util.List;

public interface IAlbumService {

    public List<Album> getAlbumListByName(String albumName);
}

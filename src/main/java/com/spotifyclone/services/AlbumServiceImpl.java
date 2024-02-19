package com.spotifyclone.services;

import com.spotifyclone.entities.Album;
import com.spotifyclone.repositories.AlbumRepository;
import com.spotifyclone.services.interfaces.IAlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumServiceImpl implements IAlbumService {

    @Autowired
    AlbumRepository albumRepository;

    @Override
    public List<Album> getAlbumListByName(String albumName) {
        return albumRepository.findByNameIgnoreCaseContaining(albumName);
    }
}

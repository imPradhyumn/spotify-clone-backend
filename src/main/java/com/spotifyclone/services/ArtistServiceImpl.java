package com.spotifyclone.services;

import com.spotifyclone.entities.Artist;
import com.spotifyclone.repositories.ArtistRepository;
import com.spotifyclone.services.interfaces.IArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtistServiceImpl implements IArtistService {

    @Autowired
    ArtistRepository artistRepository;

    @Override
    public List<Artist> getArtistListByName(String artistName) {
        return artistRepository.findByNameIgnoreCaseContaining(artistName);
    }
}

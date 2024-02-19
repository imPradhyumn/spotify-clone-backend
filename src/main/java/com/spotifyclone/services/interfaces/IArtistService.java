package com.spotifyclone.services.interfaces;

import com.spotifyclone.entities.Artist;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IArtistService {
    public List<Artist> getArtistListByName(String artistName);
}

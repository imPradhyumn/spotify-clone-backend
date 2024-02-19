package com.spotifyclone.services.interfaces;

import com.spotifyclone.entities.Artist;

import java.util.List;

public interface IArtistService {
    public List<Artist> getArtistListByName(String artistName);
}

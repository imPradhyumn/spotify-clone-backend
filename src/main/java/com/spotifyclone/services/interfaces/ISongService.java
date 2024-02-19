package com.spotifyclone.services.interfaces;

import com.spotifyclone.entities.Song;
import com.spotifyclone.error.SongNotFoundException;

import java.util.List;

public interface ISongService {
    public List<Song> getSongsByTitle(String songTitle) throws SongNotFoundException;

    List<Song> getSongsToDisplayAtInitialLoading();
}

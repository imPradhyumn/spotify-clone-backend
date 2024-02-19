package com.spotifyclone.services;

import com.spotifyclone.entities.Song;
import com.spotifyclone.error.SongNotFoundException;
import com.spotifyclone.repositories.SongRepository;
import com.spotifyclone.services.interfaces.ISongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongServiceImpl implements ISongService {
    @Autowired
    SongRepository songRepository;

    @Override
    public List<Song> getSongsByTitle(String songTitle) throws SongNotFoundException {
        List<Song> songList = songRepository.findByTitleIgnoreCaseContaining(songTitle);
        if (songList.isEmpty()) {
            throw new SongNotFoundException("Songs with given title not found");
        }
        return songList;
    }

    @Override
    public List<Song> getSongsToDisplayAtInitialLoading() {
        //System.out.println(songRepository.findTop10Songs());
        return songRepository.findTop10Songs();
    }
}

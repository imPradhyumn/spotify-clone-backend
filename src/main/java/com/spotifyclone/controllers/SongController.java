package com.spotifyclone.controllers;

import com.spotifyclone.entities.Song;
import com.spotifyclone.error.SongNotFoundException;
import com.spotifyclone.services.interfaces.ISongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/song")
@CrossOrigin(origins = "*")
public class SongController {

    @Autowired
    ISongService songService;

    @GetMapping("/get/{title}")
    public List<Song> getSongsByTitle(@PathVariable("title") String songTitle) throws SongNotFoundException {
        return songService.getSongsByTitle(songTitle);
    }

    @GetMapping("/get/all")
    public List<Song> getSongsToDisplayAtInitialLoading() {
        return songService.getSongsToDisplayAtInitialLoading();
    }

}

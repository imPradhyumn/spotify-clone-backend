package com.spotifyclone.controllers;

import com.spotifyclone.entities.Artist;
import com.spotifyclone.services.interfaces.IArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/artist")
public class ArtistController {

    @Autowired
    IArtistService artistService;
    
    @GetMapping("/get-artists/{name}")
    public List<Artist> getArtistListByName(@PathVariable("name") String artistName) {
        return artistService.getArtistListByName(artistName);
    }
}

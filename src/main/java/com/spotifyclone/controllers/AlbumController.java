package com.spotifyclone.controllers;

import com.spotifyclone.entities.Album;
import com.spotifyclone.services.interfaces.IAlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/album")
public class AlbumController {

    @Autowired
    IAlbumService albumService;

    @GetMapping("/get-albums/{name}")
    public List<Album> getAlbumListByName(@PathVariable("name") String albumName) {
        return albumService.getAlbumListByName(albumName);
    }
}

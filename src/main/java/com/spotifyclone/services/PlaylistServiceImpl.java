package com.spotifyclone.services;

import com.spotifyclone.entities.Playlist;
import com.spotifyclone.services.interfaces.IPlaylistService;
import org.springframework.stereotype.Service;

@Service
public class PlaylistServiceImpl implements IPlaylistService {
    @Override
    public Playlist createPlaylist(String playlistName) {
        return null;
    }

    @Override
    public Playlist renamePlaylist(String playlistName, long playlistId) {
        return null;
    }

    @Override
    public boolean deletePlaylist(long playlistId) {
        return false;
    }

    @Override
    public boolean addSongToPlaylist(long songId, long playlistId) {
        return false;
    }

    @Override
    public boolean removeSongFromPlaylist(long songId, long playlistId) {
        return false;
    }
}

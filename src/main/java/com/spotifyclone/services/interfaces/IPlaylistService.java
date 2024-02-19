package com.spotifyclone.services.interfaces;

import com.spotifyclone.entities.Playlist;
import org.springframework.stereotype.Service;

@Service
public interface IPlaylistService {

    public Playlist createPlaylist(String playlistName);

    public Playlist renamePlaylist(String playlistName, long playlistId);

    public boolean deletePlaylist(long playlistId);

    public boolean addSongToPlaylist(long songId, long playlistId);

    public boolean removeSongFromPlaylist(long songId, long playlistId);
}

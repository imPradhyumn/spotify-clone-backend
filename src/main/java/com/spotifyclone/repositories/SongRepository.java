package com.spotifyclone.repositories;

import com.spotifyclone.entities.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SongRepository extends JpaRepository<Song, Long> {
    List<Song> findByTitleIgnoreCaseContaining(String title);

    @Query("select s from Song s order by s.title")
    List<Song> findTop10Songs();
}

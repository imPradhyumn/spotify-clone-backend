package com.spotifyclone.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "songs")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String posterPath;
    @Column(nullable = false, unique = true)
    private String url;
    @ManyToOne
    @JoinColumn(name = "album_id")
    private Album album;
    @ManyToMany
    private List<Artist> artists;

}

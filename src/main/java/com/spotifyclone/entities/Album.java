package com.spotifyclone.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "albums")
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String posterPath;
    @ManyToMany
    @JsonIgnore
    private List<Artist> artists;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "album")
    @JsonIgnore
    private List<Song> songs;
}

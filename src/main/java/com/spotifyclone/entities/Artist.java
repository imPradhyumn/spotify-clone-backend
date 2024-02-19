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
@Table(name = "artists")
public class Artist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String posterPath;
    @ManyToMany(mappedBy = "artists", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Album> albums;
    @ManyToMany(mappedBy = "artists", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Song> songs;

}

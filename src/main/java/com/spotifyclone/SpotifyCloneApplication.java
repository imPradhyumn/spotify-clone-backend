package com.spotifyclone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpotifyCloneApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpotifyCloneApplication.class, args);
    }
}

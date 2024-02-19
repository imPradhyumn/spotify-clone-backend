package com.spotifyclone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.spotifyclone.entities")
@EnableJpaRepositories("com.spotifyclone.*")
@ComponentScan(basePackages = {"com.spotifyclone.*"})
public class SpotifyCloneApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpotifyCloneApplication.class, args);
    }
}

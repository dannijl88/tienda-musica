package com.dani.tienda_musica.controllers;

import com.dani.tienda_musica.models.Artist;
import com.dani.tienda_musica.services.ArtistService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/artists")
@RequiredArgsConstructor
public class ArtistController {

    private final ArtistService service;

    @PostMapping
    public ResponseEntity<Artist> createArtist(@RequestBody Artist artist){
        Artist saved = service.createArtist(artist);

        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @GetMapping
    public List<Artist> getAllArtists(){
        return service.getAllArtists();
    }

    @GetMapping("/{id}")
    public Artist getArtistById(@PathVariable Long id){
        return service.getArtistById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteArtist(@PathVariable Long id){
        service.deleteArtist(id);
    }
}

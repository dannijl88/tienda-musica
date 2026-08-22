package com.dani.tienda_musica.controllers;

import com.dani.tienda_musica.models.Album;
import com.dani.tienda_musica.services.AlbumService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/albums")
public class AlbumController {

    private final AlbumService service;

    @PostMapping
    public ResponseEntity<Album> createAlbum(@RequestBody Album album){
        Album created = service.createAlbum(album);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @GetMapping
    public List<Album> getAllAlbums(){
        return service.getAllAlbum();
    }

    @GetMapping("/{id}")
    public Album getAlbumById(@PathVariable Long id){
        return service.getAlbumById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteAlbum(@PathVariable Long id){
        service.deleteAlbum(id);
    }

}

package com.dani.tienda_musica.services;

import com.dani.tienda_musica.models.Album;
import com.dani.tienda_musica.repositories.AlbumRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AlbumService {

    private final AlbumRepository repository;

    public Album createAlbum(Album album){
        return repository.save(album);
    }

    public List<Album> getAllAlbum(){
        return repository.findAll();
    }

    public Album getById(Long id){
        return repository.findById(id).orElseThrow();
    }

    public void deleteAlbum(Long id){
        repository.deleteById(id);
    }

}

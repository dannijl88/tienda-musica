package com.dani.tienda_musica.services;

import com.dani.tienda_musica.models.Artist;
import com.dani.tienda_musica.repositories.ArtistRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ArtistService {

    private final ArtistRepository repository;

    public Artist createArtist(Artist artist){
        return repository.save(artist);
    }

    public List<Artist> getAllArtists(){
        return repository.findAll();
    }

    public Artist getArtistById(Long id){
        return repository.findById(id).orElseThrow();
    }

    public void deleteArtist(Long id){
        repository.deleteById(id);
    }

}

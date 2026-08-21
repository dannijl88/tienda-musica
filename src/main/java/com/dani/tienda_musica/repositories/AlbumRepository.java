package com.dani.tienda_musica.repositories;

import com.dani.tienda_musica.models.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepository extends JpaRepository<Album, Long> {
}

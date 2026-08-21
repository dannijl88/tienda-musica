package com.dani.tienda_musica.repositories;

import com.dani.tienda_musica.models.Artist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistRepository extends JpaRepository<Artist, Long> {
}

package com.dani.tienda_musica.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "album")
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Lob
    private String description;

    private LocalDate releaseDate;

    @Column(name = "song_count")
    private int songCount;
    private BigDecimal price;

    @ManyToOne
    @JoinColumn(name = "artist_id")
    private Artist artist;
}

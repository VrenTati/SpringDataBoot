package com.example.springdataboot.data;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "album")
public class Album {
    @Id
    @Column(name = "AlbumId", nullable = false)
    private Integer id;

    @Column(name = "Title", nullable = false, length = 160)
    private String title;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ArtistId", nullable = false)
    private Artist artist;

}
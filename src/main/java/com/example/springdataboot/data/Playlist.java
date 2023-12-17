package com.example.springdataboot.data;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "playlist")
public class Playlist {
    @Id
    @Column(name = "PlaylistId", nullable = false)
    private Integer id;

    @Column(name = "Name", length = 120)
    private String name;

    @ManyToMany
    @JoinTable(name = "playlisttrack",
            joinColumns = @JoinColumn(name = "PlaylistId"),
            inverseJoinColumns = @JoinColumn(name = "TrackId"))
    private Set<Track> tracks = new LinkedHashSet<>();

}
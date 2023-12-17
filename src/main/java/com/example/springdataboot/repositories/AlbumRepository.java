package com.example.springdataboot.repositories;

import com.example.springdataboot.data.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepository extends JpaRepository<Album, Integer> {
}
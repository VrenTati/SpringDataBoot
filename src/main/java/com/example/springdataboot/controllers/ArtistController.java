package com.example.springdataboot.controllers;

import com.example.springdataboot.data.Artist;
import com.example.springdataboot.services.ArtistService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Controller
@AllArgsConstructor
public class ArtistController {

    private final ArtistService artistService;
    @GetMapping("/artists")
    public String getArtists(Model model){
        model.addAttribute("artists", artistService.getArtists());
        return "artists";
    }

    @GetMapping("/artist_info/{id}")
    public String getArtistInfo(@PathVariable int id, Model model){
        Optional<Artist> artist = artistService.getArtist(id);
        if(artist.isPresent()){
            model.addAttribute("artist", artist.get());
            return "artist_info";
        }

        return "artist_info_not_found";
    }

}

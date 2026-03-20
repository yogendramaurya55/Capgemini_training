package com.music.streaming.platform.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.music.streaming.platform.dto.ArtistRequest;
import com.music.streaming.platform.model.Artist;
import com.music.streaming.platform.service.ArtistService;
import com.music.streaming.platform.service.impl.ArtistServiceImpl;

@RestController
@RequestMapping("music/platform/v1/artists")
public class ArtistController {
	
	ArtistService service;
	
	public ArtistController(ArtistService ars) {
		this.service = ars;
	}
	
	@PostMapping
	public Artist createArtist(@RequestBody ArtistRequest ar){
		return service.createArtist(ar);
		
	}
	
	@GetMapping
	public List<Artist> getAllArtist(){
		return service.getAllArtists();
	}
	
	@GetMapping("{artistId}")
	public Artist getArstistById(@PathVariable Long  artistId) {
		return service.getArtistById(artistId);
	}
	
	@PutMapping("{artistId}")
	public Artist updateArtist(@PathVariable Long artistId , @RequestBody ArtistRequest ar) {
		return service.updateArtist(artistId, ar);
	}
	
	@DeleteMapping("{artistId}")
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public void deleteArtist(@PathVariable Long artistId) {
		 service.deleteArtist(artistId);
	}
}

package com.music.streaming.platform.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.music.streaming.platform.dto.PlayListRequest;
import com.music.streaming.platform.model.PlayList;
import com.music.streaming.platform.service.PlayListService;

@RestController
@RequestMapping("music/platform/v1/playlists")
public class PlayListController {
	
	private PlayListService service;
	
	public PlayListController(PlayListService service) {
		this.service = service;
	}
	
	@PostMapping
	public PlayList create(@RequestBody PlayListRequest plr) {
		return service.createPlayList(plr);
	}
	
	@GetMapping("{playListId}")
	public PlayList getById(@PathVariable Long playListId) {
		return service.getPlayListById(playListId);
	}
	
	@DeleteMapping("{playListId}")
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long playListId) {
		service.deletePlayList(playListId);
	}
}

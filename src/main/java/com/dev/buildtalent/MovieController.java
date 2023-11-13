package com.dev.buildtalent;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dev.buildtalent.pojo.Movie;

@RestController
public class MovieController {
	
	@GetMapping("/findMovie")
	public Movie findMovieByActor(@RequestParam("actor") String actor) {
		return new Movie("Abc","Shole",2023);
		
	}

}

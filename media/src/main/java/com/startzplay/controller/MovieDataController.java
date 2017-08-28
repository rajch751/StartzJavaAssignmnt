package com.startzplay.controller;

import java.io.Serializable;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.startzplay.error.MovieDataErrorType;
import com.startzplay.service.MovieDataService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(description="Media Service")
public class MovieDataController implements Serializable {
	
	public static final Logger logger = LoggerFactory.getLogger(MovieDataController.class);

	@Autowired
	MovieDataService movieDataService;
	
	@ApiOperation(value = "getMovieEntry")
	@RequestMapping(value = "/media", method = RequestMethod.GET,produces="application/json")
    public ResponseEntity<?> getUser(@RequestParam("filter") String filter,@RequestParam("level") String level) {
        logger.info("Filter is" +filter+"level is" + level);
        List<String> movieData=movieDataService.findByFilterandLevel(filter,level);
        
        if(movieData== null){
        	logger.error("Invalid Inputs+=========Filter is" +filter+"level is" + level);
        	return new ResponseEntity(new MovieDataErrorType("Invalid Inputs " + level + " not found"), HttpStatus.NOT_FOUND);
        }
        
        
        return new ResponseEntity<List<String>>(movieData, HttpStatus.OK);
    }
		
	
}

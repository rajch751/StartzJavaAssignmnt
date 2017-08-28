package com.startzplay.service.impl;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.startzplay.controller.MovieDataController;
import com.startzplay.entity.MovieData;
import com.startzplay.entity.MovieEntry;
import com.startzplay.service.MovieDataService;

@Service("movieDataService")
public class MovieDataServiceImpl implements MovieDataService {

	public static final Logger logger = LoggerFactory.getLogger(MovieDataServiceImpl.class);
	private static MovieData moviedata;

	// @Autowired
	// private static ObjectMapper mapper;

	static {

		moviedata = populateContentJson();
	}

	@Override
	public List<String> findByFilterandLevel(String filter, String level) {
		// TODO Auto-generated method stub

		logger.info("Filter is" + filter + "level is" + level + "at service level"+moviedata);
		if(filter.equals("censored") || (filter.equals("censoring"))){
			MovieEntry[] mEntry=moviedata.getEntries();
			List<String> guids=Arrays.asList(mEntry)
							 .stream()
							 .filter(check->level.equalsIgnoreCase(check.getPeg$contentClassification()))
							 .map(guid->guid.getGuid())
							 .collect(Collectors.toList()); 
							  
			
			return guids;
					           
			
		}
		return null;
		
		  
	}

	private static MovieData populateContentJson() {
		// TODO Auto-generated method stub
		// return null;

		try {
			//MovieData movieData;
			ObjectMapper mapper = new ObjectMapper();
			File file = ResourceUtils.getFile("classpath:content.json");
			moviedata = mapper.readValue(file, MovieData.class);
			logger.info("MovieData is " + moviedata);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return moviedata;
	}

}

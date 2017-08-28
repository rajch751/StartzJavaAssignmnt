package com.startzplay.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.startzplay.entity.MovieData;

public interface MovieDataService {

	public List<String> findByFilterandLevel(String filter, String level);

}

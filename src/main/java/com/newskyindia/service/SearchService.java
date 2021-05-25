package com.newskyindia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newskyindia.model.Flights;
import com.newskyindia.repo.SearchRepository;

@Service
public class SearchService {

	@Autowired
	private SearchRepository searchRepository;
	
	public List<Flights> fetchFlightsBySourceAndDest(String source, String dest) {
		return searchRepository.findBySourceAndDest(source, dest);
		
	}
}

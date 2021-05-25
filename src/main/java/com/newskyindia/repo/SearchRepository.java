package com.newskyindia.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.newskyindia.model.Flights;



public interface SearchRepository extends MongoRepository<Flights,String> {

	
	public List<Flights> findBySourceAndDest(String source, String dest);
}

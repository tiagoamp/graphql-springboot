package com.tiagoamp.demographql.resolver;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.tiagoamp.demographql.model.Series;
import com.tiagoamp.demographql.model.SeriesCharacter;
import com.tiagoamp.demographql.service.SeriesService;

@Component
public class Mutation implements GraphQLMutationResolver {
    
	@Autowired
    private SeriesService service;
	
	
	public Series createSeries(String name, Integer nrOfSeasons) {
		return service.createSeries(name, nrOfSeasons);
	}
	
	public SeriesCharacter createCharacter(String name, String nickname, String occupation, String birthday, Integer seriesId) {
		LocalDate dayOfBirth = LocalDate.parse(birthday, DateTimeFormatter.ISO_DATE);  // date pattern example: '2011-12-03'
		return service.createCharacter(name, nickname, occupation, dayOfBirth, seriesId);
	}
	    
}
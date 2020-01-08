package com.tiagoamp.demographql.resolver;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.tiagoamp.demographql.model.Series;
import com.tiagoamp.demographql.model.SeriesCharacter;
import com.tiagoamp.demographql.service.SeriesService;

@Component
public class Query implements GraphQLQueryResolver {
	
	@Autowired
    private SeriesService service;

		
	public List<SeriesCharacter> characters() {
		return service.getCharacters();
	}
	
	public SeriesCharacter character(Integer id) {
		return service.getCharacter(id);
	}
	
	public List<Series> allSeries() {
		return service.getSeries();
	}
	
	public Series series(Integer id) {
		return service.getSeries(id);
	}	
	
}
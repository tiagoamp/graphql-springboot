package com.tiagoamp.demographql.resolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.tiagoamp.demographql.model.SeriesCharacter;
import com.tiagoamp.demographql.model.Series;
import com.tiagoamp.demographql.service.SeriesService;

@Component
public class SeriesCharacterResolver implements GraphQLResolver<SeriesCharacter> {
	
	@Autowired
    private SeriesService seriesService;

    public Series getSeries(SeriesCharacter character) {
    	return seriesService.getSeries(character.getSeries().getId());
    }
        
}

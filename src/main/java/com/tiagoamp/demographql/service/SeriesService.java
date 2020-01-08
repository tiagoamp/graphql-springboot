package com.tiagoamp.demographql.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tiagoamp.demographql.dao.CharacterDao;
import com.tiagoamp.demographql.dao.SeriesDao;
import com.tiagoamp.demographql.model.SeriesCharacter;
import com.tiagoamp.demographql.model.Series;

@Service
public class SeriesService {

	@Autowired
	private CharacterDao characterDao;
	
	@Autowired
	private SeriesDao seriesDao;
	
	
	@Transactional
	public Series createSeries(String name, Integer nrOfSeasons) {
		Series series = new Series(name, nrOfSeasons);
		return seriesDao.save(series);
	}
	
	@Transactional(readOnly = true)
	public List<Series> getSeries() {
		return seriesDao.findAll();
	}
	
	@Transactional(readOnly = true)
	public Series getSeries(Integer id) {
		Optional<Series> series = seriesDao.findById(id);
        return series.orElseThrow(() -> new IllegalArgumentException("Series 'id' not found!!!")  );
	}
	
	@Transactional
	public SeriesCharacter createCharacter(String name, String nickname, String occupation, LocalDate dateofbirth, Integer seriesId) {
		SeriesCharacter character = new SeriesCharacter(name, nickname, occupation, dateofbirth);
		Series series = getSeries(seriesId);
        character.setSeries(series);
        return characterDao.save(character);
	}
	
	@Transactional(readOnly = true)
	public List<SeriesCharacter> getCharacters() {
		return characterDao.findAll();
	}
	
	@Transactional(readOnly = true)
	public SeriesCharacter getCharacter(Integer id) {
		Optional<SeriesCharacter> characterOpt = characterDao.findById(id);
		return characterOpt.orElseThrow(() -> new IllegalArgumentException("Character 'id' not found!!!"));
	}

}

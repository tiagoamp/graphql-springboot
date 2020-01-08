package com.tiagoamp.demographql.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tiagoamp.demographql.model.SeriesCharacter;

@Repository
public interface CharacterDao extends JpaRepository<SeriesCharacter, Integer> {
	
}

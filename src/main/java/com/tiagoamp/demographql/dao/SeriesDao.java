package com.tiagoamp.demographql.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tiagoamp.demographql.model.Series;

@Repository
public interface SeriesDao extends JpaRepository<Series, Integer> {
	
}

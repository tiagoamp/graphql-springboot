package com.tiagoamp.demographql.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Series implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
	
    @Column(name = "name", nullable = false)
    private String name;
    
    @Column(name = "seasons")
    private Integer nrOfSeasons;
	
    
    public Series() { }
        
    public Series(String name, Integer nrOfSeasons) {
		this.name = name;
		this.nrOfSeasons = nrOfSeasons;
	}

    
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Series)) return false;
		Series other = (Series) obj;
		return this.name.equals(other.name);
	}
    
    @Override
    public int hashCode() {
    	return name.length();
    }

    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getNrOfSeasons() {
		return nrOfSeasons;
	}
	public void setNrOfSeasons(Integer nrOfSeasons) {
		this.nrOfSeasons = nrOfSeasons;
	}
    
}

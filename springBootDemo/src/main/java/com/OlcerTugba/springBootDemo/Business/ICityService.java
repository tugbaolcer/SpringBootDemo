package com.OlcerTugba.springBootDemo.Business;

import java.util.List;

import com.OlcerTugba.springBootDemo.Entities.City;

/*
 *Created by OLCERTUGBA 2021 
 */

public interface ICityService {
	List<City> getAll();
	void add(City city);
	void update(City city);
	void delete(City city);
	City getById(int id);
}

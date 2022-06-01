package fr.d3us.dao;

import java.util.List;

import fr.d3us.bo.Film;


public interface FilmDAO {
	void insert(Film f);
	void update(Film f);
	void delete(int id);
	List<Film> selectAll();
	Film selectById(int id);
}

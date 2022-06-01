package fr.d3us.dao;

import java.util.List;

import fr.d3us.bo.Style;

public interface StyleDAO {
	void insert(Style s);
	void update(Style s);
	void delete(int id);
	List<Style> selectAll();
	Style selectById(int id);
}

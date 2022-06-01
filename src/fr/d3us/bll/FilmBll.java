package fr.d3us.bll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.d3us.bo.Film;
import fr.d3us.dao.FilmDAO;


@Service
public class FilmBll {
	
	@Autowired
	private FilmDAO dao;
	
	public void insert(Film f) {
		dao.insert(f);
	}
	
	public void update(Film f) {
		dao.update(f);
	}
	
	public void delete(int id) {
		dao.delete(id);
	}
	
	public List<Film> selectAll() {
		return dao.selectAll();
	}
	
	public Film selectById(int id) {
		return dao.selectById(id);
	}

}

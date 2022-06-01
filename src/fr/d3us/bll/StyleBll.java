package fr.d3us.bll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.d3us.bo.Realisateur;
import fr.d3us.bo.Style;
import fr.d3us.dao.RealisateurDAO;
import fr.d3us.dao.StyleDAO;

@Service
public class StyleBll {
	
	@Autowired
	private StyleDAO dao;
	
	public void insert(Style s) {
		dao.insert(s);
	}
	
	public void update(Style s) {
		dao.update(s);
	}
	
	public void delete(int id) {
		dao.delete(id);
	}
	
	public List<Style> selectAll() {
		return dao.selectAll();
	}
	
	public Style selectById(int id) {
		return dao.selectById(id);
	}


}

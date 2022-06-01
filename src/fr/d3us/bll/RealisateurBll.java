package fr.d3us.bll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import fr.d3us.bo.Realisateur;

import fr.d3us.dao.RealisateurDAO;

@Service
public class RealisateurBll {
	
	@Autowired
	private RealisateurDAO dao;
	
	public void insert(Realisateur r) {
		dao.insert(r);
	}
	
	public void update(Realisateur r) {
		dao.update(r);
	}
	
	public void delete(int id) {
		dao.delete(id);
	}
	
	public List<Realisateur> selectAll() {
		return dao.selectAll();
	}
	
	public Realisateur selectById(int id) {
		return dao.selectById(id);
	}

}

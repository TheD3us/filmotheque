package fr.d3us.bll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.d3us.bo.Acteur;
import fr.d3us.dao.ActeurDao;


@Service
public class ActeurBll {
	
	@Autowired
	private ActeurDao dao;
	
	public void insert(Acteur a) {
		if(a.getNom().length() > 0 && a.getNom().length() < 64)
		{
			dao.insert(a);
		}
		else
		{
			System.out.println("Nom trop long ou trop court");
		}
		
	}
	
	public void update(Acteur a) {
		dao.update(a);
	}
	
	public void delete(int id) {
		dao.delete(id);
	}
	
	public List<Acteur> selectAll() {
		return dao.selectAll();
	}
	
	public Acteur selectById(int id) {
		return dao.selectById(id);
	}

}

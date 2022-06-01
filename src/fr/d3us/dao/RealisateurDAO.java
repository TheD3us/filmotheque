package fr.d3us.dao;

import java.util.List;

import fr.d3us.bo.Film;
import fr.d3us.bo.Realisateur;

public interface RealisateurDAO {
	void insert(Realisateur r);
	void update(Realisateur r);
	void delete(int id);
	List<Realisateur> selectAll();
	Realisateur selectById(int id);
}

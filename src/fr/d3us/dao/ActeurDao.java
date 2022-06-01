package fr.d3us.dao;

import java.util.List;

import fr.d3us.bo.Acteur;

public interface ActeurDao {
	

		void insert(Acteur a);
		void update(Acteur a);
		void delete(int id);
		List<Acteur> selectAll();
		Acteur selectById(int id);
	

}

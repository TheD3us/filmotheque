package fr.d3us.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.d3us.bo.Film;

@Repository
public class FilmDAOHibernateImpl implements FilmDAO{
	
	@PersistenceContext
	EntityManager em;
	

	@Override
	@Transactional
	public void insert(Film f) {
		em.persist(f);
		
	}

	@Override
	@Transactional
	public void update(Film f) {
		em.createQuery("UPDATE film SET titre = :titre, annee = :annee, style = :style, realisateur = :realisateur, duree = :duree, vu = :vu, liste_acteur = :list_acteur, synopsis = :synopsis WHERE id = :id ")
		.setParameter("titre", f.getTitre())
		.setParameter("annee", f.getAnnee())
		.setParameter("style", f.getStyle())
		.setParameter("realisateur", f.getRealisteur())
		.setParameter("duree", f.getDuree())
		.setParameter("vu", f.isVu())
		.setParameter("liste_acteur", f.getListActeur())
		.setParameter("synopsis", f.getSynopsis())
		.executeUpdate();
		
	}

	@Override
	@Transactional
	public void delete(int id) {
		em.createQuery("DELETE FROM film WHERE id = :id")
		.setParameter("id", id)
		.executeUpdate();
		
	}

	@Override
	public List<Film> selectAll() {
		
		return em.createQuery("FROM film", Film.class).getResultList();
	}

	@Override
	public Film selectById(int id) {
		
		return em.createQuery("FROM film", Film.class)
				.setParameter("id", id)
				.getSingleResult();
	}

}

package fr.d3us.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;


import fr.d3us.bo.Realisateur;

public class RealisateurDAOHibernateImpl implements RealisateurDAO {

	
	@PersistenceContext
	EntityManager em;
	
	@Override
	@Transactional
	public void insert(Realisateur r) {
		em.persist(r);
		
	}

	@Override
	@Transactional
	public void update(Realisateur r) {
		em.createQuery("UPDATE realisateur SET prenom = :prenom, nom = :nom WHERE id = :id")
		.setParameter("prenom", r.getPrenom())
		.setParameter("nom", r.getNom())
		.setParameter("id", r.getId())
		.executeUpdate();
		
	}

	@Override
	@Transactional
	public void delete(int id) {
		em.createQuery("DELETE FROM realisateur WHERE id = :id")
		.setParameter("id", id)
		.executeUpdate();
	}

	@Override
	public List<Realisateur> selectAll() {
		return em.createQuery("FROM realisateur", Realisateur.class).getResultList();
	}

	@Override
	public Realisateur selectById(int id) {
		return em.createQuery("FROM realisateur WHERE id = :id", Realisateur.class)
				.setParameter("id", id)
				.getSingleResult();
	}

}

package fr.d3us.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.d3us.bo.Acteur;

@Repository
public class ActeurDAOHibernateImpl implements ActeurDao{
	
	@PersistenceContext
	EntityManager em;

	@Override
	@Transactional
	public void insert(Acteur a) {
		em.persist(a);
		
	}

	@Override
	@Transactional
	public void update(Acteur a) {
		em.createQuery("UPDATE acteur SET prenom = :prenom, nom = :nom WHERE id = :id")
		.setParameter("prenom", a.getPrenom())
		.setParameter("nom", a.getNom())
		.setParameter("id", a.getId())
		.executeUpdate();
		
	}

	@Override
	@Transactional
	public void delete(int id) {
		em.createQuery("DELETE FROM acteur WHERE id = :id")
		.setParameter("id", id)
		.executeUpdate();
		
	}

	@Override
	public List<Acteur> selectAll() {
		
		return em.createQuery("FROM acteur", Acteur.class).getResultList();
	}

	@Override
	public Acteur selectById(int id) {
		
		return em.createQuery("FROM acteur WHERE id = :id", Acteur.class)
				.setParameter("id", id)
				.getSingleResult();
	}

}

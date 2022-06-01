package fr.d3us.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import fr.d3us.bo.Style;

public class StyleDAOHibernateImpl implements StyleDAO{
	
	@PersistenceContext
	EntityManager em;

	@Override
	@Transactional
	public void insert(Style s) {
		em.persist(s);
		
	}

	@Override
	@Transactional
	public void update(Style s) {
		em.createQuery("UPDATE style SET nom = :nom WHERE id = :id")
		.setParameter("nom", s.getNom())
		.setParameter("id", s.getId())
		.executeUpdate();
		
	}

	@Override
	@Transactional
	public void delete(int id) {
		em.createQuery("DELETE FROM style WHERE id = :id")
		.setParameter("id", id)
		.executeUpdate();
		
	}

	@Override
	public List<Style> selectAll() {
		return em.createQuery("FROM style", Style.class).getResultList();
	}

	@Override
	public Style selectById(int id) {
		return em.createQuery("FROM style WHERE id = :id", Style.class)
				.setParameter("id", id)
				.getSingleResult();
	}

}

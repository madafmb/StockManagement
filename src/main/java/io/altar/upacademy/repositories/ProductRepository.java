package io.altar.upacademy.repositories;

import javax.enterprise.context.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import io.altar.upacademy.model.Entity;
import io.altar.upacademy.model.Product;

@RequestScoped
@Transactional
public class ProductRepository {

@PersistenceContext(unitName="database")
private EntityManager em;


public void addEntity(Entity T ) {
	em.persist(T);
}
	
}
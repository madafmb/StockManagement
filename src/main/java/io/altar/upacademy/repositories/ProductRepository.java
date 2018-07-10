package io.altar.upacademy.repositories;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;

import io.altar.upacademy.model.Product;



@ApplicationScoped

public class ProductRepository extends EntityRepository<Product> {
	
	@SuppressWarnings("unchecked")
	@PostConstruct
	protected void loadFromDB() {
		localList = em.createQuery("SELECT e FROM Product e").getResultList();
	}

	@Override
	public void updateLocalList() {
		loadFromDB();
	}

	
}
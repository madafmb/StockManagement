package io.altar.upacademy.repositories;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;

import io.altar.upacademy.model.Shelf;



@ApplicationScoped
public class ShelfRepository extends EntityRepository<Shelf> {
	
	@SuppressWarnings("unchecked")
	@PostConstruct
	protected void loadFromDB() {
		localList = em.createQuery("SELECT e FROM Shelf e").getResultList();
	}

	@Override
	public void updateLocalList() {
		loadFromDB();
	}

	
}

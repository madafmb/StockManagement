package io.altar.upacademy.repositories;

import javax.enterprise.context.RequestScoped;
import javax.transaction.Transactional;

import io.altar.upacademy.model.Product;
import io.altar.upacademy.model.Shelf;



@RequestScoped
public class ShelfRepository extends EntityRepository<Shelf> {
	
	public ShelfRepository() {
		super(Shelf.class);
	}
	

	
}

package io.altar.upacademy.repositories;

import io.altar.upacademy.model.Shelf;

public class ShelfRepository extends EntityRepository {
	
private static final ShelfRepository INSTANCE=new ShelfRepository();

	private ShelfRepository() {
		this.addEntity(new Shelf());
	}

	
	
	public static ShelfRepository getInstance() {
		return INSTANCE;
	}

	
}

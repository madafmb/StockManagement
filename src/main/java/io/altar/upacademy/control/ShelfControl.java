package io.altar.upacademy.control;



import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import io.altar.upacademy.model.Product;
import io.altar.upacademy.model.Shelf;
import io.altar.upacademy.repositories.ShelfRepository;

@RequestScoped
public class ShelfControl  {
	
	
	@Inject
	ShelfRepository dbs;

	public void criarShelf(Shelf s) {
	
		dbs.addEntity(s);	
	}
	

	public void editarShelf(Shelf s) {
		dbs.editEntity(s);
	}
	
	public Shelf getShelf(long id) {
		Shelf s= dbs.getEntity(Shelf.class, id);
		return s;
	}
	
	public void removeShelf(long id) {
		Shelf s = getShelf(id);
		if(s.getShelfProduto()!=null ) {
			Product tempProduct= s.getShelfProduto();
			tempProduct.getListaPrateleiras().remove(s);
		}
		
		dbs.removeEntity(Shelf.class,id);
	}
	
	public List<Shelf> getShelf() {
		return dbs.getAll(Shelf.class);
		
	}
	
	
	
}


package io.altar.upacademy.control;



import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import io.altar.upacademy.model.Shelf;
import io.altar.upacademy.repositories.ShelfRepository;

@RequestScoped
public class ShelfControl  {
	
	
	@Inject
	ShelfRepository dbs;
	@Inject
	ProductControl productControl;
	
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
	
	public void removeShelf(Shelf s) {


		//s.getShelfProduto().getListaPrateleiras().remove(s);

		
		dbs.removeEntity(s);
		updateList();
		productControl.updateList();
	}
	
	public List<Shelf> getShelf() {
		return dbs.getLocalList();
	}
	
	public void updateList() {
		dbs.updateLocalList();
	}
	
}


package io.altar.upacademy.control;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import io.altar.upacademy.model.Shelf;
import io.altar.upacademy.repositories.ShelfRepository;

@RequestScoped
public class ShelfControl implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Inject
	private ShelfRepository dbs;

//	public void criarShelf(Shelf s) {
//	
//		dbs.addEntity(s);	
//	}
	
	
//
//	public void editarShelf(Shelf s) {
//		dbs.editEntity(s);
//	}
//	
//	public Shelf getShelf(long id) {
//		Shelf s= dbs.getEntity(id);
//		return s;
//	}
//	
//	public void removeShelf(long id) {
//		Shelf s = ShelfControl.getShelf(id);
//		if(s.getShelfProduto()!=null ) {
//			Product tempProduct= s.getShelfProduto();
//			tempProduct.getListaPrateleiras().remove(s);
//		}
//		
//		dbs.removeEntity(id);
//	}
//	
//	public Collection<Shelf> getShelf() {
//		return dbs.getEntity();
//		
//	}
	
	
	
}


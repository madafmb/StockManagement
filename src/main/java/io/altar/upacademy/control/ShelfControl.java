package io.altar.upacademy.control;

import java.io.Serializable;
import java.util.Collection;

import javax.enterprise.context.RequestScoped;

import io.altar.upacademy.model.Product;
import io.altar.upacademy.model.Shelf;
import io.altar.upacademy.repositories.EntityRepository;
import io.altar.upacademy.repositories.ShelfRepository;

@RequestScoped
public class ShelfControl implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final EntityRepository<Shelf> dbs = ShelfRepository.getInstance();

	public  void criarShelf(Shelf s) {
	
	dbs.addEntity(s);	
	}
	
	

	public void editarShelf(Shelf s) {
		dbs.editEntity(s);
	}
	
	public static Shelf getShelf(long id) {
		Shelf s= dbs.getEntity(id);
		return s;
	}
	
	public  void removeShelf(long id) {
		Shelf s = ShelfControl.getShelf(id);
		if(s.getShelfProduto()!=null ) {
			Product tempProduct= s.getShelfProduto();
			tempProduct.getListaPrateleiras().remove(s);
		}
		
		dbs.removeEntity(id);
	}
	
	public Collection<Shelf> getShelf() {
		return dbs.getEntity();
		
	}
	
	
	
}


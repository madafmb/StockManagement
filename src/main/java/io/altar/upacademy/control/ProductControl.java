package io.altar.upacademy.control;


import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import io.altar.upacademy.model.Product;
import io.altar.upacademy.model.Shelf;
import io.altar.upacademy.repositories.ProductRepository;

@RequestScoped
public class ProductControl  {
	
	
	
	@Inject
	ProductRepository dbp;
	@Inject
	ShelfControl shelfControl;
	
	public void criarProduto(Product p) {
		
		dbp.addEntity(p);
	
	}
	
	public void editarProduto(Product p) {
		dbp.editEntity(p);
		
	}
	
	
	public Product getProduto(long id) {
		Product p= dbp.getEntity(Product.class, id);
		return p;
	}

	
	public void removeProduto(Product p) {
			for(Shelf s: p.getListaPrateleiras()) {
				s.setShelfProduto(null);
			}
		
		dbp.removeEntity(p);
		updateList();
		shelfControl.updateList();
	}
	
	
	public List<Product> getAllProduto() {
		return dbp.getLocalList();
	}
	
	public void updateList() {
		dbp.updateLocalList();
	}
	
}

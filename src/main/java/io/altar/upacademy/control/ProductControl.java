package io.altar.upacademy.control;




import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import io.altar.upacademy.model.Product;
import io.altar.upacademy.repositories.ProductRepository;

@RequestScoped
public class ProductControl  {
	
	
	
	@Inject
	ProductRepository dbp;
	
	public void criarProduto(Product p) {
		
		dbp.addEntity(p);
	
	}
	
//	
//	public void editarProduto(Product p) {
//		dbp.editEntity(p);
//		
//	}
//	
//	public Product getProduto(long id) {
//		Product p= dbp.getEntity(id);
//		return p;
//	}
//	
//	public void removeProduto(long id) {
//
//		Product p = ProductControl.getProduto(id);
//		if(p.getListaPrateleiras()!=null){
//			
//			for(Shelf s: p.getListaPrateleiras()) {
//				s.setShelfProduto(null);
//			}
//		}
//		
//		dbp.removeEntity(id);
//	}
//	
//	public  Collection<Product> getProduto() {
//		return dbp.getEntity();
//		
//	}
//	
	
	
}
